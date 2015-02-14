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
@Table(name = "MD_COMENTARIOS")
@NamedQueries({
    @NamedQuery(name = "MdComentarios.findAll", query = "SELECT m FROM MdComentarios m")})
public class MdComentarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_COMENT")
    private Integer idComent;
    @Basic(optional = false)
    @Column(name = "ID_USUARIO")
    private int idUsuario;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "ID_TESIS")
    private int idTesis;

    public MdComentarios() {
    }

    public MdComentarios(Integer idComent) {
        this.idComent = idComent;
    }

    public MdComentarios(Integer idComent, int idUsuario, int idTesis) {
        this.idComent = idComent;
        this.idUsuario = idUsuario;
        this.idTesis = idTesis;
    }

    public Integer getIdComent() {
        return idComent;
    }

    public void setIdComent(Integer idComent) {
        this.idComent = idComent;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdTesis() {
        return idTesis;
    }

    public void setIdTesis(int idTesis) {
        this.idTesis = idTesis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComent != null ? idComent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MdComentarios)) {
            return false;
        }
        MdComentarios other = (MdComentarios) object;
        if ((this.idComent == null && other.idComent != null) || (this.idComent != null && !this.idComent.equals(other.idComent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bvirtual.entidades.MdComentarios[ idComent=" + idComent + " ]";
    }
    
}
