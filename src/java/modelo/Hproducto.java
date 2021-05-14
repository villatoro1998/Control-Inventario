/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author William Villatoro
 */
@Entity
@Table(name = "hproducto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hproducto.findAll", query = "SELECT h FROM Hproducto h")
    , @NamedQuery(name = "Hproducto.findByIdhProducto", query = "SELECT h FROM Hproducto h WHERE h.idhProducto = :idhProducto")
    , @NamedQuery(name = "Hproducto.findByCantidad", query = "SELECT h FROM Hproducto h WHERE h.cantidad = :cantidad")
    , @NamedQuery(name = "Hproducto.findByFecha", query = "SELECT h FROM Hproducto h WHERE h.fecha = :fecha")})
public class Hproducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idhProducto")
    private Integer idhProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Size(max = 45)
    @Column(name = "fecha")
    private String fecha;
    @JoinColumn(name = "idProducto", referencedColumnName = "idProducto")
    @ManyToOne(optional = false)
    private Producto idProducto;

    public Hproducto() {
    }

    public Hproducto(Integer idhProducto) {
        this.idhProducto = idhProducto;
    }

    public Hproducto(Integer idhProducto, int cantidad) {
        this.idhProducto = idhProducto;
        this.cantidad = cantidad;
    }

    public Integer getIdhProducto() {
        return idhProducto;
    }

    public void setIdhProducto(Integer idhProducto) {
        this.idhProducto = idhProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhProducto != null ? idhProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hproducto)) {
            return false;
        }
        Hproducto other = (Hproducto) object;
        if ((this.idhProducto == null && other.idhProducto != null) || (this.idhProducto != null && !this.idhProducto.equals(other.idhProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Hproducto[ idhProducto=" + idhProducto + " ]";
    }
    
}
