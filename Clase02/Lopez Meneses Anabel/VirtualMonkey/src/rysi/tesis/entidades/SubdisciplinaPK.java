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
public class SubdisciplinaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "IDDISCIPLINA")
    private int iddisciplina;
    @Basic(optional = false)
    @Column(name = "ID")
    private int id;

    public SubdisciplinaPK() {
    }

    public SubdisciplinaPK(int iddisciplina, int id) {
        this.iddisciplina = iddisciplina;
        this.id = id;
    }

    public int getIddisciplina() {
        return iddisciplina;
    }

    public void setIddisciplina(int iddisciplina) {
        this.iddisciplina = iddisciplina;
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
        hash += (int) iddisciplina;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubdisciplinaPK)) {
            return false;
        }
        SubdisciplinaPK other = (SubdisciplinaPK) object;
        if (this.iddisciplina != other.iddisciplina) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.tesis.entidades.SubdisciplinaPK[ iddisciplina=" + iddisciplina + ", id=" + id + " ]";
    }
    
}
