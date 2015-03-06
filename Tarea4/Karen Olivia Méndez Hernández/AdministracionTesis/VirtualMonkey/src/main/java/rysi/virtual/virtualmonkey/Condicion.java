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
@Table(name = "CONDICION")
public class Condicion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCONDICION")
    private Integer idcondicion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "CONDICION")
    private String condicion;
    @Size(max = 100)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Condicion() {
    }

    public Condicion(Integer idcondicion) {
        this.idcondicion = idcondicion;
    }

    public Condicion(Integer idcondicion, String condicion) {
        this.idcondicion = idcondicion;
        this.condicion = condicion;
    }

    public Integer getIdcondicion() {
        return idcondicion;
    }

    public void setIdcondicion(Integer idcondicion) {
        this.idcondicion = idcondicion;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
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
        hash += (idcondicion != null ? idcondicion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Condicion)) {
            return false;
        }
        Condicion other = (Condicion) object;
        if ((this.idcondicion == null && other.idcondicion != null) || (this.idcondicion != null && !this.idcondicion.equals(other.idcondicion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.virtual.virtualmonkey.Condicion[ idcondicion=" + idcondicion + " ]";
    }
    
}
