/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis.virtualmonkeyweb;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDUSUARIO")
    private int idusuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTESIS")
    private int idtesis;
    @Column(name = "CALIFICACION")
    private Integer calificacion;
    @Size(max = 250)
    @Column(name = "COMENTARIO")
    private String comentario;
    @Column(name = "PUBLICAR")
    private Boolean publicar;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Boolean getPublicar() {
        return publicar;
    }

    public void setPublicar(Boolean publicar) {
        this.publicar = publicar;
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
        return "rysi.tesis.virtualmonkeyweb.Retroalimentacion[ id=" + id + " ]";
    }
    
}
