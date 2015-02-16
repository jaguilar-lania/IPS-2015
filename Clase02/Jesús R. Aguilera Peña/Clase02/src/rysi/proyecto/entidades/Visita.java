/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.proyecto.entidades;

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

/**
 *
 * @author jaguilera
 */
@Entity
@Table(name = "VISITAS")
@NamedQueries({
    @NamedQuery(name = "Visita.findAll", query = "SELECT v FROM Visita v")})
public class Visita implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDVISITA")
    private Integer idvisita;
    @Column(name = "ORIGENVISITA")
    private String origenvisita;

    public Visita() {
    }

    public Visita(Integer idvisita) {
        this.idvisita = idvisita;
    }

    public Integer getIdvisita() {
        return idvisita;
    }

    public void setIdvisita(Integer idvisita) {
        this.idvisita = idvisita;
    }

    public String getOrigenvisita() {
        return origenvisita;
    }

    public void setOrigenvisita(String origenvisita) {
        this.origenvisita = origenvisita;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvisita != null ? idvisita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Visita)) {
            return false;
        }
        Visita other = (Visita) object;
        if ((this.idvisita == null && other.idvisita != null) || (this.idvisita != null && !this.idvisita.equals(other.idvisita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.proyecto.entidades.Visita[ idvisita=" + idvisita + " ]";
    }
    
}
