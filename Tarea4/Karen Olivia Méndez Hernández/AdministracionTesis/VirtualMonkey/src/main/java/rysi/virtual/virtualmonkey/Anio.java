/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.virtual.virtualmonkey;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author user
 */
@Entity
@Table(name = "ANIO")
public class Anio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDANIO")
    private Integer idanio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ANIO")
    private int anio;
    @Size(max = 100)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Anio() {
    }

    public Anio(Integer idanio) {
        this.idanio = idanio;
    }

    public Anio(Integer idanio, int anio) {
        this.idanio = idanio;
        this.anio = anio;
    }

    public Integer getIdanio() {
        return idanio;
    }

    public void setIdanio(Integer idanio) {
        this.idanio = idanio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idanio != null ? idanio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Anio)) {
            return false;
        }
        Anio other = (Anio) object;
        if ((this.idanio == null && other.idanio != null) || (this.idanio != null && !this.idanio.equals(other.idanio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.virtual.virtualmonkey.Anio[ idanio=" + idanio + " ]";
    }
    
}
