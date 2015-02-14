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
@Table(name = "CATPRIMATES")
@NamedQueries({
    @NamedQuery(name = "Primate.findAll", query = "SELECT p FROM Primate p")})
public class Primate implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PRIMATES")
    private Integer idPrimates;
    @Column(name = "NOMBRE_COMUN")
    private String nombreComun;
    @Column(name = "NOMBRE_CIENTIFICO")
    private String nombreCientifico;

    public Primate() {
    }

    public Primate(Integer idPrimates) {
        this.idPrimates = idPrimates;
    }

    public Integer getIdPrimates() {
        return idPrimates;
    }

    public void setIdPrimates(Integer idPrimates) {
        this.idPrimates = idPrimates;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrimates != null ? idPrimates.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Primate)) {
            return false;
        }
        Primate other = (Primate) object;
        if ((this.idPrimates == null && other.idPrimates != null) || (this.idPrimates != null && !this.idPrimates.equals(other.idPrimates))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.inecol.virtualmonkey.entidades.Primate[ idPrimates=" + idPrimates + " ]";
    }
    
}
