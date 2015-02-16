/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis.entidades;

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
 * @author Anny
 */
@Entity
@Table(name = "RETROALIMENTACION")
@NamedQueries({
    @NamedQuery(name = "Retroalimentacion.findAll", query = "SELECT r FROM Retroalimentacion r")})
public class Retroalimentacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "IDUSUARIO")
    private int idusuario;
    @Basic(optional = false)
    @Column(name = "IDTESIS")
    private int idtesis;
    @Column(name = "CALIFICACION")
    private Integer calificacion;
    @Column(name = "COMENTARIO")
    private String comentario;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;

    public Retroalimentacion() {
    }

    public Retroalimentacion(Integer id) {
        this.id = id;
    }

    public Retroalimentacion(Integer id, int idusuario, int idtesis) {
        this.id = id;
        this.idusuario = idusuario;
        this.idtesis = idtesis;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdtesis() {
        return idtesis;
    }

    public void setIdtesis(int idtesis) {
        this.idtesis = idtesis;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Retroalimentacion)) {
            return false;
        }
        Retroalimentacion other = (Retroalimentacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.tesis.entidades.Retroalimentacion[ id=" + id + " ]";
    }
    
}
