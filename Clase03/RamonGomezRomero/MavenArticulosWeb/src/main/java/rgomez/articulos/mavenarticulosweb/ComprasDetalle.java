/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.articulos.mavenarticulosweb;

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
import javax.validation.constraints.NotNull;

/**
 *
 * @author Subli
 */
@Entity
@Table(name = "COMPRAS_DETALLES")
@NamedQueries({
    @NamedQuery(name = "ComprasDetalle.findAll", query = "SELECT c FROM ComprasDetalle c")})
public class ComprasDetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ComprasDetallePK comprasDetallePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRECIO_UNITARIO")
    private BigDecimal precioUnitario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRECIO")
    private BigDecimal precio;
    @JoinColumn(name = "ID_COMPRA", referencedColumnName = "ID_COMPRA", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Compra compra;
    @JoinColumn(name = "ID_ARTICULO", referencedColumnName = "ID_ARTICULO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Articulo articulo;

    public ComprasDetalle() {
    }

    public ComprasDetalle(ComprasDetallePK comprasDetallePK) {
        this.comprasDetallePK = comprasDetallePK;
    }

    public ComprasDetalle(ComprasDetallePK comprasDetallePK, BigDecimal precioUnitario, int cantidad, BigDecimal precio) {
        this.comprasDetallePK = comprasDetallePK;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public ComprasDetalle(int idCompra, int idArticulo) {
        this.comprasDetallePK = new ComprasDetallePK(idCompra, idArticulo);
    }

    public ComprasDetallePK getComprasDetallePK() {
        return comprasDetallePK;
    }

    public void setComprasDetallePK(ComprasDetallePK comprasDetallePK) {
        this.comprasDetallePK = comprasDetallePK;
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

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (comprasDetallePK != null ? comprasDetallePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComprasDetalle)) {
            return false;
        }
        ComprasDetalle other = (ComprasDetalle) object;
        if ((this.comprasDetallePK == null && other.comprasDetallePK != null) || (this.comprasDetallePK != null && !this.comprasDetallePK.equals(other.comprasDetallePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rgomez.articulos.mavenarticulosweb.ComprasDetalle[ comprasDetallePK=" + comprasDetallePK + " ]";
    }
    
}
