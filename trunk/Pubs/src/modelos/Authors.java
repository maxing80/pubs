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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Luis
 */
@Entity
@Table(name = "AUTHORS", catalog = "", schema = "PUBS")
@NamedQueries({
    @NamedQuery(name = "Authors.findAll", query = "SELECT a FROM Authors a"),
    @NamedQuery(name = "Authors.findByAuId", query = "SELECT a FROM Authors a WHERE a.auId = :auId"),
    @NamedQuery(name = "Authors.findByAu", query = "SELECT a FROM Authors a WHERE a.au = :au"),
    @NamedQuery(name = "Authors.findByAuLname", query = "SELECT a FROM Authors a WHERE a.auLname = :auLname"),
    @NamedQuery(name = "Authors.findByAuFname", query = "SELECT a FROM Authors a WHERE a.auFname = :auFname"),
    @NamedQuery(name = "Authors.findByPhone", query = "SELECT a FROM Authors a WHERE a.phone = :phone"),
    @NamedQuery(name = "Authors.findByAddress", query = "SELECT a FROM Authors a WHERE a.address = :address"),
    @NamedQuery(name = "Authors.findByCity", query = "SELECT a FROM Authors a WHERE a.city = :city"),
    @NamedQuery(name = "Authors.findByState", query = "SELECT a FROM Authors a WHERE a.state = :state"),
    @NamedQuery(name = "Authors.findByZip", query = "SELECT a FROM Authors a WHERE a.zip = :zip"),
    @NamedQuery(name = "Authors.findByContract", query = "SELECT a FROM Authors a WHERE a.contract = :contract")})
public class Authors implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "AU_ID")
    @GeneratedValue(generator="seq_Authors", strategy= GenerationType.SEQUENCE)
    @SequenceGenerator(name="seq_Authors", sequenceName="seq_Authors", allocationSize=1)
    private BigDecimal auId;
    @Column(name = "AU")
    private String au;
    @Column(name = "AU_LNAME")
    private String auLname;
    @Column(name = "AU_FNAME")
    private String auFname;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STATE")
    private String state;
    @Column(name = "ZIP")
    private String zip;
    @Column(name = "CONTRACT")
    private BigInteger contract;

    public Authors() {
    }

    public Authors(BigDecimal auId) {
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

    public String getAu() {
        return au;
    }

    public void setAu(String au) {
        String oldAu = this.au;
        this.au = au;
        changeSupport.firePropertyChange("au", oldAu, au);
    }

    public String getAuLname() {
        return auLname;
    }

    public void setAuLname(String auLname) {
        String oldAuLname = this.auLname;
        this.auLname = auLname;
        changeSupport.firePropertyChange("auLname", oldAuLname, auLname);
    }

    public String getAuFname() {
        return auFname;
    }

    public void setAuFname(String auFname) {
        String oldAuFname = this.auFname;
        this.auFname = auFname;
        changeSupport.firePropertyChange("auFname", oldAuFname, auFname);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        String oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
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

    public BigInteger getContract() {
        return contract;
    }

    public void setContract(BigInteger contract) {
        BigInteger oldContract = this.contract;
        this.contract = contract;
        changeSupport.firePropertyChange("contract", oldContract, contract);
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
        if (!(object instanceof Authors)) {
            return false;
        }
        Authors other = (Authors) object;
        if ((this.auId == null && other.auId != null) || (this.auId != null && !this.auId.equals(other.auId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presentacion.catalogos.Authors[ auId=" + auId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
