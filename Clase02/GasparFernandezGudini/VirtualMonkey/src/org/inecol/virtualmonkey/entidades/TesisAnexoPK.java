/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inecol.virtualmonkey.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Gudini
 */
@Embeddable
public class TesisAnexoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID_TESIS")
    private int idTesis;
    @Basic(optional = false)
    @Column(name = "ID_ANEXO")
    private int idAnexo;

    public TesisAnexoPK() {
    }

    public TesisAnexoPK(int idTesis, int idAnexo) {
        this.idTesis = idTesis;
        this.idAnexo = idAnexo;
    }

    public int getIdTesis() {
        return idTesis;
    }

    public void setIdTesis(int idTesis) {
        this.idTesis = idTesis;
    }

    public int getIdAnexo() {
        return idAnexo;
    }

    public void setIdAnexo(int idAnexo) {
        this.idAnexo = idAnexo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idTesis;
        hash += (int) idAnexo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TesisAnexoPK)) {
            return false;
        }
        TesisAnexoPK other = (TesisAnexoPK) object;
        if (this.idTesis != other.idTesis) {
            return false;
        }
        if (this.idAnexo != other.idAnexo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.inecol.virtualmonkey.entidades.TesisAnexoPK[ idTesis=" + idTesis + ", idAnexo=" + idAnexo + " ]";
    }
    
}
