/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
    @EmbeddedId
    protected RetroalimentacionPK retroalimentacionPK;
    @Column(name = "CALIFICACION")
    private Integer calificacion;
    @Column(name = "COMENTARIO")
    private String comentario;

    public Retroalimentacion() {
    }

    public Retroalimentacion(RetroalimentacionPK retroalimentacionPK) {
        this.retroalimentacionPK = retroalimentacionPK;
    }

    public Retroalimentacion(int idusuario, int idtesis) {
        this.retroalimentacionPK = new RetroalimentacionPK(idusuario, idtesis);
    }

    public RetroalimentacionPK getRetroalimentacionPK() {
        return retroalimentacionPK;
    }

    public void setRetroalimentacionPK(RetroalimentacionPK retroalimentacionPK) {
        this.retroalimentacionPK = retroalimentacionPK;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (retroalimentacionPK != null ? retroalimentacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Retroalimentacion)) {
            return false;
        }
        Retroalimentacion other = (Retroalimentacion) object;
        if ((this.retroalimentacionPK == null && other.retroalimentacionPK != null) || (this.retroalimentacionPK != null && !this.retroalimentacionPK.equals(other.retroalimentacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.tesis.entidades.Retroalimentacion[ retroalimentacionPK=" + retroalimentacionPK + " ]";
    }
    
}
