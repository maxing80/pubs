/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Luis
 */
@Entity
@Table(name = "PUBLISHERS", catalog = "", schema = "PUBS")
@NamedQueries({
    @NamedQuery(name = "Publishers.findAll", query = "SELECT p FROM Publishers p"),
    @NamedQuery(name = "Publishers.findByPubId", query = "SELECT p FROM Publishers p WHERE p.pubId = :pubId"),
    @NamedQuery(name = "Publishers.findByPub", query = "SELECT p FROM Publishers p WHERE p.pub = :pub"),
    @NamedQuery(name = "Publishers.findByPubName", query = "SELECT p FROM Publishers p WHERE p.pubName = :pubName"),
    @NamedQuery(name = "Publishers.findByCity", query = "SELECT p FROM Publishers p WHERE p.city = :city"),
    @NamedQuery(name = "Publishers.findByState", query = "SELECT p FROM Publishers p WHERE p.state = :state"),
    @NamedQuery(name = "Publishers.findByCountry", query = "SELECT p FROM Publishers p WHERE p.country = :country")})
public class Publishers implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "PUB_ID")
    @GeneratedValue(generator="seq_publishers", strategy= GenerationType.SEQUENCE)
    @SequenceGenerator(name="seq_publishers", sequenceName="seq_publishers", allocationSize=1)
    private BigDecimal pubId;
    @Column(name = "PUB")
    private String pub;
    @Column(name = "PUB_NAME")
    private String pubName;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STATE")
    private String state;
    @Column(name = "COUNTRY")
    private String country;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "publishers")
    private PubInfo pubInfo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pubId2")
    private Collection<PubInfo> pubInfoCollection;

    public Publishers() {
    }

    public Publishers(BigDecimal pubId) {
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

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        String oldPub = this.pub;
        this.pub = pub;
        changeSupport.firePropertyChange("pub", oldPub, pub);
    }

    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        String oldPubName = this.pubName;
        this.pubName = pubName;
        changeSupport.firePropertyChange("pubName", oldPubName, pubName);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        String oldState = this.state;
        this.state = state;
        changeSupport.firePropertyChange("state", oldState, state);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        String oldCountry = this.country;
        this.country = country;
        changeSupport.firePropertyChange("country", oldCountry, country);
    }

    public PubInfo getPubInfo() {
        return pubInfo;
    }

    public void setPubInfo(PubInfo pubInfo) {
        this.pubInfo = pubInfo;
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
        if (!(object instanceof Publishers)) {
            return false;
        }
        Publishers other = (Publishers) object;
        if ((this.pubId == null && other.pubId != null) || (this.pubId != null && !this.pubId.equals(other.pubId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presentacion.catalogos.Publishers[ pubId=" + pubId + " ]";
    }

    public Collection<PubInfo> getPubInfoCollection() {
        return pubInfoCollection;
    }

    public void setPubInfoCollection(Collection<PubInfo> pubInfoCollection) {
        this.pubInfoCollection = pubInfoCollection;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
