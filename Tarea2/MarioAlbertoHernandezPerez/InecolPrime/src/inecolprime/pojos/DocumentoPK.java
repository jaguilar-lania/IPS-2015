/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inecolprime.pojos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Frost
 */
@Embeddable
public class DocumentoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "IDTESIS")
    private int idtesis;
    @Basic(optional = false)
    @Column(name = "IDTIPODOCUMENTO")
    private int idtipodocumento;

    public DocumentoPK() {
    }

    public DocumentoPK(int idtesis, int idtipodocumento) {
        this.idtesis = idtesis;
        this.idtipodocumento = idtipodocumento;
    }

    public int getIdtesis() {
        return idtesis;
    }

    public void setIdtesis(int idtesis) {
        this.idtesis = idtesis;
    }

    public int getIdtipodocumento() {
        return idtipodocumento;
    }

    public void setIdtipodocumento(int idtipodocumento) {
        this.idtipodocumento = idtipodocumento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idtesis;
        hash += (int) idtipodocumento;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocumentoPK)) {
            return false;
        }
        DocumentoPK other = (DocumentoPK) object;
        if (this.idtesis != other.idtesis) {
            return false;
        }
        if (this.idtipodocumento != other.idtipodocumento) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inecolprime.pojos.DocumentoPK[ idtesis=" + idtesis + ", idtipodocumento=" + idtipodocumento + " ]";
    }
    
}
