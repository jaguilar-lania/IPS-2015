/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Anny
 */
@Entity
@Table(name = "SUBDISCIPLINA")
@NamedQueries({
    @NamedQuery(name = "Subdisciplina.findAll", query = "SELECT s FROM Subdisciplina s")})
public class Subdisciplina implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SubdisciplinaPK subdisciplinaPK;
    @Column(name = "NOMBRE")
    private String nombre;

    public Subdisciplina() {
    }

    public Subdisciplina(SubdisciplinaPK subdisciplinaPK) {
        this.subdisciplinaPK = subdisciplinaPK;
    }

    public Subdisciplina(int iddisciplina, int id) {
        this.subdisciplinaPK = new SubdisciplinaPK(iddisciplina, id);
    }

    public SubdisciplinaPK getSubdisciplinaPK() {
        return subdisciplinaPK;
    }

    public void setSubdisciplinaPK(SubdisciplinaPK subdisciplinaPK) {
        this.subdisciplinaPK = subdisciplinaPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subdisciplinaPK != null ? subdisciplinaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subdisciplina)) {
            return false;
        }
        Subdisciplina other = (Subdisciplina) object;
        if ((this.subdisciplinaPK == null && other.subdisciplinaPK != null) || (this.subdisciplinaPK != null && !this.subdisciplinaPK.equals(other.subdisciplinaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.tesis.entidades.Subdisciplina[ subdisciplinaPK=" + subdisciplinaPK + " ]";
    }
    
}
