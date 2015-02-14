/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inecol.virtualmonkey.entidades;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Gudini
 */
@Entity
@Table(name = "TESIS_ANEXO")
@NamedQueries({
    @NamedQuery(name = "TesisAnexo.findAll", query = "SELECT t FROM TesisAnexo t")})
public class TesisAnexo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TesisAnexoPK tesisAnexoPK;

    public TesisAnexo() {
    }

    public TesisAnexo(TesisAnexoPK tesisAnexoPK) {
        this.tesisAnexoPK = tesisAnexoPK;
    }

    public TesisAnexo(int idTesis, int idAnexo) {
        this.tesisAnexoPK = new TesisAnexoPK(idTesis, idAnexo);
    }

    public TesisAnexoPK getTesisAnexoPK() {
        return tesisAnexoPK;
    }

    public void setTesisAnexoPK(TesisAnexoPK tesisAnexoPK) {
        this.tesisAnexoPK = tesisAnexoPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tesisAnexoPK != null ? tesisAnexoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TesisAnexo)) {
            return false;
        }
        TesisAnexo other = (TesisAnexo) object;
        if ((this.tesisAnexoPK == null && other.tesisAnexoPK != null) || (this.tesisAnexoPK != null && !this.tesisAnexoPK.equals(other.tesisAnexoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.inecol.virtualmonkey.entidades.TesisAnexo[ tesisAnexoPK=" + tesisAnexoPK + " ]";
    }
    
}
