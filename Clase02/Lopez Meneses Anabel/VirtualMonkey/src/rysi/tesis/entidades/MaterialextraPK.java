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
public class MaterialextraPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID")
    private int id;
    @Basic(optional = false)
    @Column(name = "IDTESIS")
    private long idtesis;

    public MaterialextraPK() {
    }

    public MaterialextraPK(int id, long idtesis) {
        this.id = id;
        this.idtesis = idtesis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getIdtesis() {
        return idtesis;
    }

    public void setIdtesis(long idtesis) {
        this.idtesis = idtesis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) idtesis;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MaterialextraPK)) {
            return false;
        }
        MaterialextraPK other = (MaterialextraPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.idtesis != other.idtesis) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.tesis.entidades.MaterialextraPK[ id=" + id + ", idtesis=" + idtesis + " ]";
    }
    
}
