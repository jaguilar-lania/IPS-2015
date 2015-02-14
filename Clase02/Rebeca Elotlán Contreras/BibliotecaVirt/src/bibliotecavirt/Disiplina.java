/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecavirt;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author REBECA
 */
@Entity
@Table(name = "DISIPLINA")
@NamedQueries({
    @NamedQuery(name = "Disiplina.findAll", query = "SELECT d FROM Disiplina d")})
public class Disiplina implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_DISIPLINA")
    private String idDisiplina;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Disiplina() {
    }

    public Disiplina(String idDisiplina) {
        this.idDisiplina = idDisiplina;
    }

    public Disiplina(String idDisiplina, String descripcion) {
        this.idDisiplina = idDisiplina;
        this.descripcion = descripcion;
    }

    public String getIdDisiplina() {
        return idDisiplina;
    }

    public void setIdDisiplina(String idDisiplina) {
        this.idDisiplina = idDisiplina;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDisiplina != null ? idDisiplina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Disiplina)) {
            return false;
        }
        Disiplina other = (Disiplina) object;
        if ((this.idDisiplina == null && other.idDisiplina != null) || (this.idDisiplina != null && !this.idDisiplina.equals(other.idDisiplina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bibliotecavirt.Disiplina[ idDisiplina=" + idDisiplina + " ]";
    }
    
}
