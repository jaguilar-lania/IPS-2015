/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.virtual.virtualmonkey;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "CALIFICACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Calificacion.findAll", query = "SELECT c FROM Calificacion c"),
    @NamedQuery(name = "Calificacion.findByIdcalificacion", query = "SELECT c FROM Calificacion c WHERE c.idcalificacion = :idcalificacion"),
    @NamedQuery(name = "Calificacion.findByIdtesis", query = "SELECT c FROM Calificacion c WHERE c.idtesis = :idtesis"),
    @NamedQuery(name = "Calificacion.findByCalificacion", query = "SELECT c FROM Calificacion c WHERE c.calificacion = :calificacion"),
    @NamedQuery(name = "Calificacion.findByIdusuario", query = "SELECT c FROM Calificacion c WHERE c.idusuario = :idusuario")})
public class Calificacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCALIFICACION")
    private Integer idcalificacion;
    @Column(name = "IDTESIS")
    private Integer idtesis;
    @Column(name = "CALIFICACION")
    private Integer calificacion;
    @Column(name = "IDUSUARIO")
    private Integer idusuario;

    public Calificacion() {
    }

    public Calificacion(Integer idcalificacion) {
        this.idcalificacion = idcalificacion;
    }

    public Integer getIdcalificacion() {
        return idcalificacion;
    }

    public void setIdcalificacion(Integer idcalificacion) {
        this.idcalificacion = idcalificacion;
    }

    public Integer getIdtesis() {
        return idtesis;
    }

    public void setIdtesis(Integer idtesis) {
        this.idtesis = idtesis;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcalificacion != null ? idcalificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calificacion)) {
            return false;
        }
        Calificacion other = (Calificacion) object;
        if ((this.idcalificacion == null && other.idcalificacion != null) || (this.idcalificacion != null && !this.idcalificacion.equals(other.idcalificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.articulos.articulosweb.Calificacion[ idcalificacion=" + idcalificacion + " ]";
    }
    
}
