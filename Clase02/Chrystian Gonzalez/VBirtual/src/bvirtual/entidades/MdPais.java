/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bvirtual.entidades;

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
 * @author Chrys
 */
@Entity
@Table(name = "MD_PAIS")
@NamedQueries({
    @NamedQuery(name = "MdPais.findAll", query = "SELECT m FROM MdPais m")})
public class MdPais implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID_ESTADO")
    private int idEstado;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PAIS")
    private Integer idPais;
    @Basic(optional = false)
    @Column(name = "NOM_PAIS")
    private String nomPais;

    public MdPais() {
    }

    public MdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public MdPais(Integer idPais, int idEstado, String nomPais) {
        this.idPais = idPais;
        this.idEstado = idEstado;
        this.nomPais = nomPais;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public String getNomPais() {
        return nomPais;
    }

    public void setNomPais(String nomPais) {
        this.nomPais = nomPais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPais != null ? idPais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MdPais)) {
            return false;
        }
        MdPais other = (MdPais) object;
        if ((this.idPais == null && other.idPais != null) || (this.idPais != null && !this.idPais.equals(other.idPais))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bvirtual.entidades.MdPais[ idPais=" + idPais + " ]";
    }
    
}
