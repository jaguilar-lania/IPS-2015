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
@Table(name = "CATDIRECTORES_TESIS")
@NamedQueries({
    @NamedQuery(name = "DirectorTesis.findAll", query = "SELECT d FROM DirectorTesis d")})
public class DirectorTesis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_DIRECTOR_TESIS")
    private Integer idDirectorTesis;
    @Column(name = "NOMBRE")
    private String nombre;

    public DirectorTesis() {
    }

    public DirectorTesis(Integer idDirectorTesis) {
        this.idDirectorTesis = idDirectorTesis;
    }

    public Integer getIdDirectorTesis() {
        return idDirectorTesis;
    }

    public void setIdDirectorTesis(Integer idDirectorTesis) {
        this.idDirectorTesis = idDirectorTesis;
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
        hash += (idDirectorTesis != null ? idDirectorTesis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DirectorTesis)) {
            return false;
        }
        DirectorTesis other = (DirectorTesis) object;
        if ((this.idDirectorTesis == null && other.idDirectorTesis != null) || (this.idDirectorTesis != null && !this.idDirectorTesis.equals(other.idDirectorTesis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.inecol.virtualmonkey.entidades.DirectorTesis[ idDirectorTesis=" + idDirectorTesis + " ]";
    }
    
}
