/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Anny
 */
@Embeddable
public class SesionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "IDUSUARIO")
    private int idusuario;
    @Basic(optional = false)
    @Column(name = "ID")
    private int id;

    public SesionPK() {
    }

    public SesionPK(int idusuario, int id) {
        this.idusuario = idusuario;
        this.id = id;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idusuario;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SesionPK)) {
            return false;
        }
        SesionPK other = (SesionPK) object;
        if (this.idusuario != other.idusuario) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.tesis.entidades.SesionPK[ idusuario=" + idusuario + ", id=" + id + " ]";
    }
    
}
