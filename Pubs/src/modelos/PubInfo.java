/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Luis
 */
@Entity
@Table(name = "PUB_INFO", catalog = "", schema = "PUBS")
@NamedQueries({
    @NamedQuery(name = "PubInfo.findAll", query = "SELECT p FROM PubInfo p"),
    @NamedQuery(name = "PubInfo.findByPubId", query = "SELECT p FROM PubInfo p WHERE p.pubId = :pubId"),
    @NamedQuery(name = "PubInfo.findByPrInfo", query = "SELECT p FROM PubInfo p WHERE p.prInfo = :prInfo")})
public class PubInfo implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "PUB_ID")
    @GeneratedValue(generator="seq_pub_info", strategy= GenerationType.SEQUENCE)
    @SequenceGenerator(name="seq_pub_info", sequenceName="seq_pub_info", allocationSize=1)
    private BigDecimal pubId;
    @Lob
    @Column(name = "LOGO")
    private Serializable logo;
    @Column(name = "PR_INFO")
    private String prInfo;
    @JoinColumn(name = "PUB_ID", referencedColumnName = "PUB_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Publishers publishers;
    @JoinColumn(name = "PUB_ID", referencedColumnName = "PUB_ID", updatable = false, insertable = false)
    @ManyToOne
    private Publishers pubId2;

    public PubInfo() {
        this.logo = "";
    }

    public PubInfo(BigDecimal pubId) {
        this.pubId = pubId;
    }

    public BigDecimal getPubId() {
        return pubId;
    }

    public void setPubId(BigDecimal pubId) {
        BigDecimal oldPubId = this.pubId;
        this.pubId = pubId;
        changeSupport.firePropertyChange("pubId", oldPubId, pubId);
    }

    public Serializable getLogo() {
        return logo;
    }

    public void setLogo(Serializable logo) {
        Serializable oldLogo = this.logo;
        this.logo = logo;
        changeSupport.firePropertyChange("logo", oldLogo, logo);
    }

    public String getPrInfo() {
        return prInfo;
    }

    public void setPrInfo(String prInfo) {
        String oldPrInfo = this.prInfo;
        this.prInfo = prInfo;
        changeSupport.firePropertyChange("prInfo", oldPrInfo, prInfo);
    }

    public Publishers getPublishers() {
        return publishers;
    }

    public void setPublishers(Publishers publishers) {
        this.publishers = publishers;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pubId != null ? pubId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PubInfo)) {
            return false;
        }
        PubInfo other = (PubInfo) object;
        if ((this.pubId == null && other.pubId != null) || (this.pubId != null && !this.pubId.equals(other.pubId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presentacion.catalogos.PubInfo[ pubId=" + pubId + " ]";
    }

    public Publishers getPubId2() {
        return pubId2;
    }

    public void setPubId2(Publishers pubId2) {
        Publishers oldPubId2 = this.pubId2;
        this.pubId2 = pubId2;
        changeSupport.firePropertyChange("pubId2", oldPubId2, pubId2);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
