/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omarprueba.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author rterr_000
 */
@Entity
@Table(name = "DIRECTOR")
@NamedQueries({
    @NamedQuery(name = "Director.findAll", query = "SELECT d FROM Director d")})
public class Director implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDDIRECTOR")
    private Integer iddirector;
    @Basic(optional = false)
    @Column(name = "PROFESION")
    private String profesion;
    @Basic(optional = false)
    @Column(name = "IDUSUARIO")
    private int idusuario;
    @Basic(optional = false)
    @Column(name = "IDGRADO")
    private int idgrado;

    public Director() {
    }

    public Director(Integer iddirector) {
        this.iddirector = iddirector;
    }

    public Director(Integer iddirector, String profesion, int idusuario, int idgrado) {
        this.iddirector = iddirector;
        this.profesion = profesion;
        this.idusuario = idusuario;
        this.idgrado = idgrado;
    }

    public Integer getIddirector() {
        return iddirector;
    }

    public void setIddirector(Integer iddirector) {
        this.iddirector = iddirector;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdgrado() {
        return idgrado;
    }

    public void setIdgrado(int idgrado) {
        this.idgrado = idgrado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddirector != null ? iddirector.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Director)) {
            return false;
        }
        Director other = (Director) object;
        if ((this.iddirector == null && other.iddirector != null) || (this.iddirector != null && !this.iddirector.equals(other.iddirector))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "omarprueba.entidades.Director[ iddirector=" + iddirector + " ]";
    }
    
}
