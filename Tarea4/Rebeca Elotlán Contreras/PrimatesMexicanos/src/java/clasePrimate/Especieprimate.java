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
@Table(name = "ESPECIEPRIMATE")
@NamedQueries({
    @NamedQuery(name = "Especieprimate.findAll", query = "SELECT e FROM Especieprimate e")})
public class Especieprimate implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PRIMATE")
    private Integer idPrimate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 30)
    @Column(name = "PAIS")
    private String pais;

    public Especieprimate() {
    }

    public Especieprimate(Integer idPrimate) {
        this.idPrimate = idPrimate;
    }

    public Especieprimate(Integer idPrimate, String nombre) {
        this.idPrimate = idPrimate;
        this.nombre = nombre;
    }

    public Integer getIdPrimate() {
        return idPrimate;
    }

    public void setIdPrimate(Integer idPrimate) {
        this.idPrimate = idPrimate;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrimate != null ? idPrimate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Especieprimate)) {
            return false;
        }
        Especieprimate other = (Especieprimate) object;
        if ((this.idPrimate == null && other.idPrimate != null) || (this.idPrimate != null && !this.idPrimate.equals(other.idPrimate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clasePrimate.Especieprimate[ idPrimate=" + idPrimate + " ]";
    }
    
}
