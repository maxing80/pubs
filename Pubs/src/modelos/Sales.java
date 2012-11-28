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
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Luis
 */
@Entity
@Table(name = "SALES", catalog = "", schema = "PUBS")
@NamedQueries({
    @NamedQuery(name = "Sales.findAll", query = "SELECT s FROM Sales s"),
    @NamedQuery(name = "Sales.findByStorId", query = "SELECT s FROM Sales s WHERE s.storId = :storId"),
    @NamedQuery(name = "Sales.findByStor", query = "SELECT s FROM Sales s WHERE s.stor = :stor"),
    @NamedQuery(name = "Sales.findByOrdDate", query = "SELECT s FROM Sales s WHERE s.ordDate = :ordDate"),
    @NamedQuery(name = "Sales.findByQty", query = "SELECT s FROM Sales s WHERE s.qty = :qty"),
    @NamedQuery(name = "Sales.findByPayterms", query = "SELECT s FROM Sales s WHERE s.payterms = :payterms"),
    @NamedQuery(name = "Sales.findByTitleId", query = "SELECT s FROM Sales s WHERE s.titleId = :titleId")})
public class Sales implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "STOR_ID")
    private BigDecimal storId;
    @Column(name = "STOR")
    private BigInteger stor;
    @Column(name = "ORD_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ordDate;
    @Column(name = "QTY")
    private BigInteger qty;
    @Column(name = "PAYTERMS")
    private String payterms;
    @Column(name = "TITLE_ID")
    private BigInteger titleId;

    public Sales() {
    }

    public Sales(BigDecimal storId) {
        this.storId = storId;
    }

    public BigDecimal getStorId() {
        return storId;
    }

    public void setStorId(BigDecimal storId) {
        BigDecimal oldStorId = this.storId;
        this.storId = storId;
        changeSupport.firePropertyChange("storId", oldStorId, storId);
    }

    public BigInteger getStor() {
        return stor;
    }

    public void setStor(BigInteger stor) {
        BigInteger oldStor = this.stor;
        this.stor = stor;
        changeSupport.firePropertyChange("stor", oldStor, stor);
    }

    public Date getOrdDate() {
        return ordDate;
    }

    public void setOrdDate(Date ordDate) {
        Date oldOrdDate = this.ordDate;
        this.ordDate = ordDate;
        changeSupport.firePropertyChange("ordDate", oldOrdDate, ordDate);
    }

    public BigInteger getQty() {
        return qty;
    }

    public void setQty(BigInteger qty) {
        BigInteger oldQty = this.qty;
        this.qty = qty;
        changeSupport.firePropertyChange("qty", oldQty, qty);
    }

    public String getPayterms() {
        return payterms;
    }

    public void setPayterms(String payterms) {
        String oldPayterms = this.payterms;
        this.payterms = payterms;
        changeSupport.firePropertyChange("payterms", oldPayterms, payterms);
    }

    public BigInteger getTitleId() {
        return titleId;
    }

    public void setTitleId(BigInteger titleId) {
        BigInteger oldTitleId = this.titleId;
        this.titleId = titleId;
        changeSupport.firePropertyChange("titleId", oldTitleId, titleId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (storId != null ? storId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sales)) {
            return false;
        }
        Sales other = (Sales) object;
        if ((this.storId == null && other.storId != null) || (this.storId != null && !this.storId.equals(other.storId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presentacion.catalogos.Sales[ storId=" + storId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
