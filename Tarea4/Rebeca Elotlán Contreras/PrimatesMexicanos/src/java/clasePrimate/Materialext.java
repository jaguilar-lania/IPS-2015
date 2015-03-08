/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasePrimate;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_MAT")
    private Integer idMat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_TESIS")
    private int idTesis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NOMBRE")
    private String nombre;

    public Materialext() {
    }

    public Materialext(Integer idMat) {
        this.idMat = idMat;
    }

    public Materialext(Integer idMat, int idTesis, String nombre) {
        this.idMat = idMat;
        this.idTesis = idTesis;
        this.nombre = nombre;
    }

    public Integer getIdMat() {
        return idMat;
    }

    public void setIdMat(Integer idMat) {
        this.idMat = idMat;
    }

    public int getIdTesis() {
        return idTesis;
    }

    public void setIdTesis(int idTesis) {
        this.idTesis = idTesis;
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
        return "clasePrimate.Materialext[ idMat=" + idMat + " ]";
    }
    
}
