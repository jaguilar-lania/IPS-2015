/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omarprueba.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author rterr_000
 */
@Entity
@Table(name = "VISITAS")
@NamedQueries({
    @NamedQuery(name = "Visitas.findAll", query = "SELECT v FROM Visitas v")})
public class Visitas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDVISITA")
    private Integer idvisita;
    @Basic(optional = false)
    @Column(name = "FVISITA")
    @Temporal(TemporalType.DATE)
    private Date fvisita;
    @Basic(optional = false)
    @Column(name = "IDTESIS")
    private int idtesis;
    @Basic(optional = false)
    @Column(name = "IDPAIS")
    private int idpais;
    @Basic(optional = false)
    @Column(name = "IDUSUARIO")
    private int idusuario;

    public Visitas() {
    }

    public Visitas(Integer idvisita) {
        this.idvisita = idvisita;
    }

    public Visitas(Integer idvisita, Date fvisita, int idtesis, int idpais, int idusuario) {
        this.idvisita = idvisita;
        this.fvisita = fvisita;
        this.idtesis = idtesis;
        this.idpais = idpais;
        this.idusuario = idusuario;
    }

    public Integer getIdvisita() {
        return idvisita;
    }

    public void setIdvisita(Integer idvisita) {
        this.idvisita = idvisita;
    }

    public Date getFvisita() {
        return fvisita;
    }

    public void setFvisita(Date fvisita) {
        this.fvisita = fvisita;
    }

    public int getIdtesis() {
        return idtesis;
    }

    public void setIdtesis(int idtesis) {
        this.idtesis = idtesis;
    }

    public int getIdpais() {
        return idpais;
    }

    public void setIdpais(int idpais) {
        this.idpais = idpais;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
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
        if (!(object instanceof Visitas)) {
            return false;
        }
        Visitas other = (Visitas) object;
        if ((this.idvisita == null && other.idvisita != null) || (this.idvisita != null && !this.idvisita.equals(other.idvisita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "omarprueba.entidades.Visitas[ idvisita=" + idvisita + " ]";
    }
    
}
