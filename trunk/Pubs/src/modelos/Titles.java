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
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.hibernate.envers.Audited;

/**
 *
 * @author Luis
 */
@Entity
@Audited
@Table(name = "TITLES", catalog = "", schema = "PUBS")
@NamedQueries({
    @NamedQuery(name = "Titles.findAll", query = "SELECT t FROM Titles t"),
    @NamedQuery(name = "Titles.findByTitleId", query = "SELECT t FROM Titles t WHERE t.titleId = :titleId"),
    @NamedQuery(name = "Titles.findByIsbn", query = "SELECT t FROM Titles t WHERE t.isbn = :isbn"),
    @NamedQuery(name = "Titles.findByTitle", query = "SELECT t FROM Titles t WHERE t.title = :title"),
    @NamedQuery(name = "Titles.findByTipo", query = "SELECT t FROM Titles t WHERE t.tipo = :tipo"),
    @NamedQuery(name = "Titles.findByPubId", query = "SELECT t FROM Titles t WHERE t.pubId = :pubId"),
    @NamedQuery(name = "Titles.findByPrice", query = "SELECT t FROM Titles t WHERE t.price = :price"),
    @NamedQuery(name = "Titles.findByAdvance", query = "SELECT t FROM Titles t WHERE t.advance = :advance"),
    @NamedQuery(name = "Titles.findByRoyality", query = "SELECT t FROM Titles t WHERE t.royality = :royality"),
    @NamedQuery(name = "Titles.findByYdtSales", query = "SELECT t FROM Titles t WHERE t.ydtSales = :ydtSales"),
    @NamedQuery(name = "Titles.findByNote", query = "SELECT t FROM Titles t WHERE t.note = :note"),
    @NamedQuery(name = "Titles.findByPubdate", query = "SELECT t FROM Titles t WHERE t.pubdate = :pubdate")})
public class Titles implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "TITLE_ID")
    @GeneratedValue(generator="seq_Titles", strategy= GenerationType.SEQUENCE)
    @SequenceGenerator(name="seq_Titles", sequenceName="seq_Titles", allocationSize=1)
    private BigDecimal titleId;
    @Column(name = "ISBN")
    private String isbn;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "PUB_ID")
    private BigInteger pubId;
    @Column(name = "PRICE")
    private BigDecimal price;
    @Column(name = "ADVANCE")
    private BigDecimal advance;
    @Column(name = "ROYALITY")
    private BigInteger royality;
    @Column(name = "YDT_SALES")
    private BigInteger ydtSales;
    @Column(name = "NOTE")
    private String note;
    @Column(name = "PUBDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pubdate;
    @OneToMany(mappedBy = "titleId")
    private List<Titleauthor> titleauthorList;

    public Titles() {
    }

    public Titles(BigDecimal titleId) {
        this.titleId = titleId;
    }

    public BigDecimal getTitleId() {
        return titleId;
    }

    public void setTitleId(BigDecimal titleId) {
        BigDecimal oldTitleId = this.titleId;
        this.titleId = titleId;
        changeSupport.firePropertyChange("titleId", oldTitleId, titleId);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        String oldIsbn = this.isbn;
        this.isbn = isbn;
        changeSupport.firePropertyChange("isbn", oldIsbn, isbn);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        String oldTitle = this.title;
        this.title = title;
        changeSupport.firePropertyChange("title", oldTitle, title);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        String oldTipo = this.tipo;
        this.tipo = tipo;
        changeSupport.firePropertyChange("tipo", oldTipo, tipo);
    }

    public BigInteger getPubId() {
        return pubId;
    }

    public void setPubId(BigInteger pubId) {
        BigInteger oldPubId = this.pubId;
        this.pubId = pubId;
        changeSupport.firePropertyChange("pubId", oldPubId, pubId);
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        BigDecimal oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public BigDecimal getAdvance() {
        return advance;
    }

    public void setAdvance(BigDecimal advance) {
        BigDecimal oldAdvance = this.advance;
        this.advance = advance;
        changeSupport.firePropertyChange("advance", oldAdvance, advance);
    }

    public BigInteger getRoyality() {
        return royality;
    }

    public void setRoyality(BigInteger royality) {
        BigInteger oldRoyality = this.royality;
        this.royality = royality;
        changeSupport.firePropertyChange("royality", oldRoyality, royality);
    }

    public BigInteger getYdtSales() {
        return ydtSales;
    }

    public void setYdtSales(BigInteger ydtSales) {
        BigInteger oldYdtSales = this.ydtSales;
        this.ydtSales = ydtSales;
        changeSupport.firePropertyChange("ydtSales", oldYdtSales, ydtSales);
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        String oldNote = this.note;
        this.note = note;
        changeSupport.firePropertyChange("note", oldNote, note);
    }

    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        Date oldPubdate = this.pubdate;
        this.pubdate = pubdate;
        changeSupport.firePropertyChange("pubdate", oldPubdate, pubdate);
    }

    public List<Titleauthor> getTitleauthorList() {
        return titleauthorList;
    }

    public void setTitleauthorList(List<Titleauthor> titleauthorList) {
        this.titleauthorList = titleauthorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (titleId != null ? titleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Titles)) {
            return false;
        }
        Titles other = (Titles) object;
        if ((this.titleId == null && other.titleId != null) || (this.titleId != null && !this.titleId.equals(other.titleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presentacion.catalogos.Titles[ titleId=" + titleId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
