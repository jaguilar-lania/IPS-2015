/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis.virtualmonkeyweb;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Anny
 */
@Embeddable
public class ConsultaPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDUSUARIO")
    private int idusuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTESIS")
    private int idtesis;

    public ConsultaPK() {
    }

    public ConsultaPK(int idusuario, int idtesis) {
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
        if (!(object instanceof ConsultaPK)) {
            return false;
        }
        ConsultaPK other = (ConsultaPK) object;
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
        return "rysi.tesis.virtualmonkeyweb.ConsultaPK[ idusuario=" + idusuario + ", idtesis=" + idtesis + " ]";
    }
    
}
