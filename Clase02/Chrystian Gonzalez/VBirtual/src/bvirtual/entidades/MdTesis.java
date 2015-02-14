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
@Table(name = "MD_TESIS")
@NamedQueries({
    @NamedQuery(name = "MdTesis.findAll", query = "SELECT m FROM MdTesis m")})
public class MdTesis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_TESIS")
    private Integer idTesis;
    @Column(name = "AUTOR")
    private String autor;
    @Column(name = "TITULO")
    private String titulo;
    @Basic(optional = false)
    @Column(name = "ID_USUARIO")
    private int idUsuario;

    public MdTesis() {
    }

    public MdTesis(Integer idTesis) {
        this.idTesis = idTesis;
    }

    public MdTesis(Integer idTesis, int idUsuario) {
        this.idTesis = idTesis;
        this.idUsuario = idUsuario;
    }

    public Integer getIdTesis() {
        return idTesis;
    }

    public void setIdTesis(Integer idTesis) {
        this.idTesis = idTesis;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTesis != null ? idTesis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MdTesis)) {
            return false;
        }
        MdTesis other = (MdTesis) object;
        if ((this.idTesis == null && other.idTesis != null) || (this.idTesis != null && !this.idTesis.equals(other.idTesis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bvirtual.entidades.MdTesis[ idTesis=" + idTesis + " ]";
    }
    
}
