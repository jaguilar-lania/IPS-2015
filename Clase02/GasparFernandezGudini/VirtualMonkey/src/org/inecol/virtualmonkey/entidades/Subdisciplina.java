/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inecol.virtualmonkey.entidades;

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

/**
 *
 * @author Gudini
 */
@Entity
@Table(name = "CATSUBDISCIPLINA")
@NamedQueries({
    @NamedQuery(name = "Subdisciplina.findAll", query = "SELECT s FROM Subdisciplina s")})
public class Subdisciplina implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_SUBDISCIPLINA")
    private Integer idSubdisciplina;
    @Column(name = "NOMBRE")
    private String nombre;

    public Subdisciplina() {
    }

    public Subdisciplina(Integer idSubdisciplina) {
        this.idSubdisciplina = idSubdisciplina;
    }

    public Integer getIdSubdisciplina() {
        return idSubdisciplina;
    }

    public void setIdSubdisciplina(Integer idSubdisciplina) {
        this.idSubdisciplina = idSubdisciplina;
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
        hash += (idSubdisciplina != null ? idSubdisciplina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subdisciplina)) {
            return false;
        }
        Subdisciplina other = (Subdisciplina) object;
        if ((this.idSubdisciplina == null && other.idSubdisciplina != null) || (this.idSubdisciplina != null && !this.idSubdisciplina.equals(other.idSubdisciplina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.inecol.virtualmonkey.entidades.Subdisciplina[ idSubdisciplina=" + idSubdisciplina + " ]";
    }
    
}
