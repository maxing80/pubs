/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Luis
 */
@Entity
@Table(name = "TITLEAUTHOR", catalog = "", schema = "PUBS")
@NamedQueries({
    @NamedQuery(name = "Titleauthor.findAll", query = "SELECT t FROM Titleauthor t"),
    @NamedQuery(name = "Titleauthor.findByAuId", query = "SELECT t FROM Titleauthor t WHERE t.auId = :auId"),
    @NamedQuery(name = "Titleauthor.findByAu", query = "SELECT t FROM Titleauthor t WHERE t.au = :au"),
    @NamedQuery(name = "Titleauthor.findByAuOrd", query = "SELECT t FROM Titleauthor t WHERE t.auOrd = :auOrd"),
    @NamedQuery(name = "Titleauthor.findByRoyaltyper", query = "SELECT t FROM Titleauthor t WHERE t.royaltyper = :royaltyper")})
public class Titleauthor implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "AU_ID")
    private BigDecimal auId;
    @Column(name = "AU")
    private BigInteger au;
    @Column(name = "AU_ORD")
    private BigInteger auOrd;
    @Column(name = "ROYALTYPER")
    private BigInteger royaltyper;
    @JoinColumn(name = "TITLE_ID", referencedColumnName = "TITLE_ID")
    @ManyToOne
    private Titles titleId;

    public Titleauthor() {
    }

    public Titleauthor(BigDecimal auId) {
        this.auId = auId;
    }

    public BigDecimal getAuId() {
        return auId;
    }

    public void setAuId(BigDecimal auId) {
        BigDecimal oldAuId = this.auId;
        this.auId = auId;
        changeSupport.firePropertyChange("auId", oldAuId, auId);
    }

    public BigInteger getAu() {
        return au;
    }

    public void setAu(BigInteger au) {
        BigInteger oldAu = this.au;
        this.au = au;
        changeSupport.firePropertyChange("au", oldAu, au);
    }

    public BigInteger getAuOrd() {
        return auOrd;
    }

    public void setAuOrd(BigInteger auOrd) {
        BigInteger oldAuOrd = this.auOrd;
        this.auOrd = auOrd;
        changeSupport.firePropertyChange("auOrd", oldAuOrd, auOrd);
    }

    public BigInteger getRoyaltyper() {
        return royaltyper;
    }

    public void setRoyaltyper(BigInteger royaltyper) {
        BigInteger oldRoyaltyper = this.royaltyper;
        this.royaltyper = royaltyper;
        changeSupport.firePropertyChange("royaltyper", oldRoyaltyper, royaltyper);
    }

    public Titles getTitleId() {
        return titleId;
    }

    public void setTitleId(Titles titleId) {
        Titles oldTitleId = this.titleId;
        this.titleId = titleId;
        changeSupport.firePropertyChange("titleId", oldTitleId, titleId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (auId != null ? auId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Titleauthor)) {
            return false;
        }
        Titleauthor other = (Titleauthor) object;
        if ((this.auId == null && other.auId != null) || (this.auId != null && !this.auId.equals(other.auId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presentacion.catalogos.Titleauthor[ auId=" + auId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
