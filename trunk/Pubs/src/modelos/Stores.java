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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.envers.Audited;

/**
 *
 * @author Luis
 */
@Entity
@Audited
@Table(name = "STORES", catalog = "", schema = "PUBS")
@NamedQueries({
    @NamedQuery(name = "Stores.findAll", query = "SELECT s FROM Stores s"),
    @NamedQuery(name = "Stores.findByStorId", query = "SELECT s FROM Stores s WHERE s.storId = :storId"),
    @NamedQuery(name = "Stores.findByStor", query = "SELECT s FROM Stores s WHERE s.stor = :stor"),
    @NamedQuery(name = "Stores.findByStorName", query = "SELECT s FROM Stores s WHERE s.storName = :storName"),
    @NamedQuery(name = "Stores.findByStorAddress", query = "SELECT s FROM Stores s WHERE s.storAddress = :storAddress"),
    @NamedQuery(name = "Stores.findByCity", query = "SELECT s FROM Stores s WHERE s.city = :city"),
    @NamedQuery(name = "Stores.findByState", query = "SELECT s FROM Stores s WHERE s.state = :state"),
    @NamedQuery(name = "Stores.findByZip", query = "SELECT s FROM Stores s WHERE s.zip = :zip")})
public class Stores implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "STOR_ID")
    @GeneratedValue(generator="seq_Stores", strategy= GenerationType.SEQUENCE)
    @SequenceGenerator(name="seq_Stores", sequenceName="seq_Stores", allocationSize=1)
    private BigDecimal storId;
    @Column(name = "STOR")
    private String stor;
    @Column(name = "STOR_NAME")
    private String storName;
    @Column(name = "STOR_ADDRESS")
    private String storAddress;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STATE")
    private String state;
    @Column(name = "ZIP")
    private String zip;

    public Stores() {
    }

    public Stores(BigDecimal storId) {
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

    public String getStor() {
        return stor;
    }

    public void setStor(String stor) {
        String oldStor = this.stor;
        this.stor = stor;
        changeSupport.firePropertyChange("stor", oldStor, stor);
    }

    public String getStorName() {
        return storName;
    }

    public void setStorName(String storName) {
        String oldStorName = this.storName;
        this.storName = storName;
        changeSupport.firePropertyChange("storName", oldStorName, storName);
    }

    public String getStorAddress() {
        return storAddress;
    }

    public void setStorAddress(String storAddress) {
        String oldStorAddress = this.storAddress;
        this.storAddress = storAddress;
        changeSupport.firePropertyChange("storAddress", oldStorAddress, storAddress);
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        String oldZip = this.zip;
        this.zip = zip;
        changeSupport.firePropertyChange("zip", oldZip, zip);
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
        if (!(object instanceof Stores)) {
            return false;
        }
        Stores other = (Stores) object;
        if ((this.storId == null && other.storId != null) || (this.storId != null && !this.storId.equals(other.storId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presentacion.catalogos.Stores[ storId=" + storId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
