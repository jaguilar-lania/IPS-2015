/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Chrys
 */
@Entity
@Table(name = "COMENTARIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comentarios.findAll", query = "SELECT c FROM Comentarios c"),
    @NamedQuery(name = "Comentarios.findByIdComentario", query = "SELECT c FROM Comentarios c WHERE c.idComentario = :idComentario"),
    @NamedQuery(name = "Comentarios.findByIdUsuario", query = "SELECT c FROM Comentarios c WHERE c.idUsuario = :idUsuario"),
    @NamedQuery(name = "Comentarios.findByIdTesis", query = "SELECT c FROM Comentarios c WHERE c.idTesis = :idTesis"),
    @NamedQuery(name = "Comentarios.findByDescripcion", query = "SELECT c FROM Comentarios c WHERE c.descripcion = :descripcion")})
public class Comentarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_COMENTARIO")
    private Integer idComentario;
    @Basic(optional = false)
    @Column(name = "ID_USUARIO")
    private int idUsuario;
    @Basic(optional = false)
    @Column(name = "ID_TESIS")
    private int idTesis;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Comentarios() {
    }

    public Comentarios(Integer idComentario) {
        this.idComentario = idComentario;
    }

    public Comentarios(Integer idComentario, int idUsuario, int idTesis, String descripcion) {
        this.idComentario = idComentario;
        this.idUsuario = idUsuario;
        this.idTesis = idTesis;
        this.descripcion = descripcion;
    }

    public Integer getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(Integer idComentario) {
        this.idComentario = idComentario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdTesis() {
        return idTesis;
    }

    public void setIdTesis(int idTesis) {
        this.idTesis = idTesis;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComentario != null ? idComentario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comentarios)) {
            return false;
        }
        Comentarios other = (Comentarios) object;
        if ((this.idComentario == null && other.idComentario != null) || (this.idComentario != null && !this.idComentario.equals(other.idComentario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "biblioteca.entidades.Comentarios[ idComentario=" + idComentario + " ]";
    }
    
}
