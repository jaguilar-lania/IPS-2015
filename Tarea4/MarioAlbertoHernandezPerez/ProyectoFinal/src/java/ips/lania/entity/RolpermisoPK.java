/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ips.lania.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Frost
 */
@Embeddable
public class RolpermisoPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDROL")
    private int idrol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPERMISO")
    private int idpermiso;

    public RolpermisoPK() {
    }

    public RolpermisoPK(int idrol, int idpermiso) {
        this.idrol = idrol;
        this.idpermiso = idpermiso;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public int getIdpermiso() {
        return idpermiso;
    }

    public void setIdpermiso(int idpermiso) {
        this.idpermiso = idpermiso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idrol;
        hash += (int) idpermiso;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolpermisoPK)) {
            return false;
        }
        RolpermisoPK other = (RolpermisoPK) object;
        if (this.idrol != other.idrol) {
            return false;
        }
        if (this.idpermiso != other.idpermiso) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ips.lania.entityobjects.RolpermisoPK[ idrol=" + idrol + ", idpermiso=" + idpermiso + " ]";
    }
    
}
