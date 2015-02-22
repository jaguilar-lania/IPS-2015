/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lania.rysy.ips2015.bibliotecavirtualweb.entidades;

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
 * @author miguel
 */
@Entity
@Table(name = "INSTITUCION_ADSCRIPCION")
@NamedQueries({
    @NamedQuery(name = "InstitucionAdscripcion.findAll", query = "SELECT i FROM InstitucionAdscripcion i")})
public class InstitucionAdscripcion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDINSTITUCION_ADSCRIPCION")
    private Integer idinstitucionAdscripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "NOMBRE")
    private String nombre;

    public InstitucionAdscripcion() {
    }

    public InstitucionAdscripcion(Integer idinstitucionAdscripcion) {
        this.idinstitucionAdscripcion = idinstitucionAdscripcion;
    }

    public InstitucionAdscripcion(Integer idinstitucionAdscripcion, String nombre) {
        this.idinstitucionAdscripcion = idinstitucionAdscripcion;
        this.nombre = nombre;
    }

    public Integer getIdinstitucionAdscripcion() {
        return idinstitucionAdscripcion;
    }

    public void setIdinstitucionAdscripcion(Integer idinstitucionAdscripcion) {
        this.idinstitucionAdscripcion = idinstitucionAdscripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idinstitucionAdscripcion != null ? idinstitucionAdscripcion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InstitucionAdscripcion)) {
            return false;
        }
        InstitucionAdscripcion other = (InstitucionAdscripcion) object;
        if ((this.idinstitucionAdscripcion == null && other.idinstitucionAdscripcion != null) || (this.idinstitucionAdscripcion != null && !this.idinstitucionAdscripcion.equals(other.idinstitucionAdscripcion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lania.rysy.ips2015.bibliotecavirtualweb.entidades.InstitucionAdscripcion[ idinstitucionAdscripcion=" + idinstitucionAdscripcion + " ]";
    }
    
}
