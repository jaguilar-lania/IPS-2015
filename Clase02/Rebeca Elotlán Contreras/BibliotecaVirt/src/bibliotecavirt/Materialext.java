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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author REBECA
 */
@Entity
@Table(name = "MATERIALEXT")
@NamedQueries({
    @NamedQuery(name = "Materialext.findAll", query = "SELECT m FROM Materialext m")})
public class Materialext implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_MAT")
    private String idMat;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @JoinColumn(name = "ID_TESIS", referencedColumnName = "ID_TESIS")
    @ManyToOne(optional = false)
    private Tesis idTesis;

    public Materialext() {
    }

    public Materialext(String idMat) {
        this.idMat = idMat;
    }

    public Materialext(String idMat, String nombre) {
        this.idMat = idMat;
        this.nombre = nombre;
    }

    public String getIdMat() {
        return idMat;
    }

    public void setIdMat(String idMat) {
        this.idMat = idMat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tesis getIdTesis() {
        return idTesis;
    }

    public void setIdTesis(Tesis idTesis) {
        this.idTesis = idTesis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMat != null ? idMat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materialext)) {
            return false;
        }
        Materialext other = (Materialext) object;
        if ((this.idMat == null && other.idMat != null) || (this.idMat != null && !this.idMat.equals(other.idMat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bibliotecavirt.Materialext[ idMat=" + idMat + " ]";
    }
    
}
