/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inecolprime.pojos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Frost
 */
@Entity
@Table(name = "VISITA")
@NamedQueries({
    @NamedQuery(name = "Visita.findAll", query = "SELECT v FROM Visita v")})
public class Visita implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDVISITA")
    private Integer idvisita;
    @Column(name = "TIEMPOVISITA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tiempovisita;
    @JoinColumn(name = "IDUSUARIO", referencedColumnName = "IDUSUARIO")
    @ManyToOne
    private Usuario usuario;
    @JoinColumn(name = "IDTESIS", referencedColumnName = "IDTESIS")
    @ManyToOne
    private Tesis tesis;
    @JoinColumn(name = "IDPAIS", referencedColumnName = "IDPAIS")
    @ManyToOne
    private Pais pais;

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

    public Date getTiempovisita() {
        return tiempovisita;
    }

    public void setTiempovisita(Date tiempovisita) {
        this.tiempovisita = tiempovisita;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Tesis getTesis() {
        return tesis;
    }

    public void setTesis(Tesis tesis) {
        this.tesis = tesis;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
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
        return "inecolprime.pojos.Visita[ idvisita=" + idvisita + " ]";
    }
    
}
