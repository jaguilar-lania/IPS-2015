/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.articulos.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author jaguilar
 */
@Entity
@Table(name = "COMPRAS_DETALLES")
@NamedQueries({
    @NamedQuery(name = "DetalleCompra.findAll", query = "SELECT d FROM DetalleCompra d")})
public class DetalleCompra implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetalleCompraPK detalleCompraPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PRECIO_UNITARIO")
    private BigDecimal precioUnitario;
    @Basic(optional = false)
    @Column(name = "CANTIDAD")
    private int cantidad;
    @Basic(optional = false)
    @Column(name = "PRECIO")
    private BigDecimal precio;
    @JoinColumn(name = "ID_ARTICULO", referencedColumnName = "ID_ARTICULO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Articulo articulo;
    @JoinColumn(name = "ID_COMPRA", referencedColumnName = "ID_COMPRA", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Compra compra;

    public DetalleCompra() {
    }

    public DetalleCompra(DetalleCompraPK detalleCompraPK) {
        this.detalleCompraPK = detalleCompraPK;
    }

    public DetalleCompra(DetalleCompraPK detalleCompraPK, BigDecimal precioUnitario, int cantidad, BigDecimal precio) {
        this.detalleCompraPK = detalleCompraPK;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public DetalleCompra(int idCompra, int idArticulo) {
        this.detalleCompraPK = new DetalleCompraPK(idCompra, idArticulo);
    }

    public DetalleCompraPK getDetalleCompraPK() {
        return detalleCompraPK;
    }

    public void setDetalleCompraPK(DetalleCompraPK detalleCompraPK) {
        this.detalleCompraPK = detalleCompraPK;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleCompraPK != null ? detalleCompraPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleCompra)) {
            return false;
        }
        DetalleCompra other = (DetalleCompra) object;
        if ((this.detalleCompraPK == null && other.detalleCompraPK != null) || (this.detalleCompraPK != null && !this.detalleCompraPK.equals(other.detalleCompraPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.articulos.entidades.DetalleCompra[ detalleCompraPK=" + detalleCompraPK + " ]";
    }
    
}
