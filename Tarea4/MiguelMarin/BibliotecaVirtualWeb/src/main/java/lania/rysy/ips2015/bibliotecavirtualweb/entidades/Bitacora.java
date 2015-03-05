/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lania.rysy.ips2015.bibliotecavirtualweb.entidades;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author miguel
 */
@Entity
@Table(name = "BITACORA")
@NamedQueries({
    @NamedQuery(name = "Bitacora.findAll", query = "SELECT b FROM Bitacora b")})
public class Bitacora implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDBITACORA")
    private Integer idbitacora;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "IP")
    private String ip;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_REG")
    @Temporal(TemporalType.DATE)
    private Date fechaReg;
    @Column(name = "IDTESIS")
    private Integer idtesis;
    @JoinColumn(name = "IDPAIS", referencedColumnName = "IDPAIS")
    @ManyToOne(optional = false)
    private Pais pais;
    @JoinColumn(name = "IDUSUARIO", referencedColumnName = "IDUSUARIO")
    @ManyToOne
    private Usuario usuario;

    public Bitacora() {
    }

    public Bitacora(Integer idbitacora) {
        this.idbitacora = idbitacora;
    }

    public Bitacora(Integer idbitacora, String ip, Date fechaReg) {
        this.idbitacora = idbitacora;
        this.ip = ip;
        this.fechaReg = fechaReg;
    }

    public Integer getIdbitacora() {
        return idbitacora;
    }

    public void setIdbitacora(Integer idbitacora) {
        this.idbitacora = idbitacora;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    public Integer getIdtesis() {
        return idtesis;
    }

    public void setIdtesis(Integer idtesis) {
        this.idtesis = idtesis;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
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
        hash += (idbitacora != null ? idbitacora.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bitacora)) {
            return false;
        }
        Bitacora other = (Bitacora) object;
        if ((this.idbitacora == null && other.idbitacora != null) || (this.idbitacora != null && !this.idbitacora.equals(other.idbitacora))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lania.rysy.ips2015.bibliotecavirtualweb.entidades.Bitacora[ idbitacora=" + idbitacora + " ]";
    }
    
}
