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
public class RetroalimentacionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "IDUSUARIO")
    private int idusuario;
    @Basic(optional = false)
    @Column(name = "IDTESIS")
    private int idtesis;

    public RetroalimentacionPK() {
    }

    public RetroalimentacionPK(int idusuario, int idtesis) {
        this.idusuario = idusuario;
        this.idtesis = idtesis;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdtesis() {
        return idtesis;
    }

    public void setIdtesis(int idtesis) {
        this.idtesis = idtesis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idusuario;
        hash += (int) idtesis;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetroalimentacionPK)) {
            return false;
        }
        RetroalimentacionPK other = (RetroalimentacionPK) object;
        if (this.idusuario != other.idusuario) {
            return false;
        }
        if (this.idtesis != other.idtesis) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.tesis.entidades.RetroalimentacionPK[ idusuario=" + idusuario + ", idtesis=" + idtesis + " ]";
    }
    
}
