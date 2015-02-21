/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.articulosweb.entidades;

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
 * @author miguel
 */
@Entity
@Table(name = "COMPRAS_DETALLES")
@NamedQueries({
    @NamedQuery(name = "ComprasDetalles.findAll", query = "SELECT c FROM ComprasDetalles c")})
public class ComprasDetalles implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ComprasDetallesPK comprasDetallesPK;
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
    @JoinColumn(name = "ID_ARTICULO", referencedColumnName = "ID_ARTICULO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Articulo articulo;
    @JoinColumn(name = "ID_COMPRA", referencedColumnName = "ID_COMPRA", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Compra compra;

    public ComprasDetalles() {
    }

    public ComprasDetalles(ComprasDetallesPK comprasDetallesPK) {
        this.comprasDetallesPK = comprasDetallesPK;
    }

    public ComprasDetalles(ComprasDetallesPK comprasDetallesPK, BigDecimal precioUnitario, int cantidad, BigDecimal precio) {
        this.comprasDetallesPK = comprasDetallesPK;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public ComprasDetalles(int idCompra, int idArticulo) {
        this.comprasDetallesPK = new ComprasDetallesPK(idCompra, idArticulo);
    }

    public ComprasDetallesPK getComprasDetallesPK() {
        return comprasDetallesPK;
    }

    public void setComprasDetallesPK(ComprasDetallesPK comprasDetallesPK) {
        this.comprasDetallesPK = comprasDetallesPK;
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
        hash += (comprasDetallesPK != null ? comprasDetallesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComprasDetalles)) {
            return false;
        }
        ComprasDetalles other = (ComprasDetalles) object;
        if ((this.comprasDetallesPK == null && other.comprasDetallesPK != null) || (this.comprasDetallesPK != null && !this.comprasDetallesPK.equals(other.comprasDetallesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.articulosweb.entidades.ComprasDetalles[ comprasDetallesPK=" + comprasDetallesPK + " ]";
    }
    
}
