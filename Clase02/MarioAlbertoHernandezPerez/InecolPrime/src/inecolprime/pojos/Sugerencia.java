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
@Table(name = "SUGERENCIA")
@NamedQueries({
    @NamedQuery(name = "Sugerencia.findAll", query = "SELECT s FROM Sugerencia s")})
public class Sugerencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDSUGERENCIA")
    private Integer idsugerencia;
    @Column(name = "SUGERENCIA")
    private String sugerencia;
    @Column(name = "TIEMPOCREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tiempocreacion;
    @JoinColumn(name = "IDUSUARIO", referencedColumnName = "IDUSUARIO")
    @ManyToOne
    private Usuario usuario;

    public Sugerencia() {
    }

    public Sugerencia(Integer idsugerencia) {
        this.idsugerencia = idsugerencia;
    }

    public Integer getIdsugerencia() {
        return idsugerencia;
    }

    public void setIdsugerencia(Integer idsugerencia) {
        this.idsugerencia = idsugerencia;
    }

    public String getSugerencia() {
        return sugerencia;
    }

    public void setSugerencia(String sugerencia) {
        this.sugerencia = sugerencia;
    }

    public Date getTiempocreacion() {
        return tiempocreacion;
    }

    public void setTiempocreacion(Date tiempocreacion) {
        this.tiempocreacion = tiempocreacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsugerencia != null ? idsugerencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sugerencia)) {
            return false;
        }
        Sugerencia other = (Sugerencia) object;
        if ((this.idsugerencia == null && other.idsugerencia != null) || (this.idsugerencia != null && !this.idsugerencia.equals(other.idsugerencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inecolprime.pojos.Sugerencia[ idsugerencia=" + idsugerencia + " ]";
    }
    
}
