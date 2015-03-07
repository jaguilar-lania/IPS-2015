/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.articulos.inecolprimefinal;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Subli
 */
@Entity
@Table(name = "SUGERENCIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sugerencia.findAll", query = "SELECT s FROM Sugerencia s"),
    @NamedQuery(name = "Sugerencia.findByIdsugerencia", query = "SELECT s FROM Sugerencia s WHERE s.idsugerencia = :idsugerencia"),
    @NamedQuery(name = "Sugerencia.findBySugerencia", query = "SELECT s FROM Sugerencia s WHERE s.sugerencia = :sugerencia"),
    @NamedQuery(name = "Sugerencia.findByFechacreacion", query = "SELECT s FROM Sugerencia s WHERE s.fechacreacion = :fechacreacion")})
public class Sugerencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSUGERENCIA")
    private Integer idsugerencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "SUGERENCIA")
    private String sugerencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHACREACION")
    @Temporal(TemporalType.DATE)
    private Date fechacreacion;
    @JoinColumn(name = "IDUSUARIO", referencedColumnName = "IDUSUARIO")
    @ManyToOne
    private Usuario idusuario;

    public Sugerencia() {
    }

    public Sugerencia(Integer idsugerencia) {
        this.idsugerencia = idsugerencia;
    }

    public Sugerencia(Integer idsugerencia, String sugerencia, Date fechacreacion) {
        this.idsugerencia = idsugerencia;
        this.sugerencia = sugerencia;
        this.fechacreacion = fechacreacion;
    }

    public Integer getIdsugerencia() {
        return idsugerencia;
    }

    public void setIdsugerencia(Integer idsugerencia) {
        this.idsugerencia = idsugerencia;
    }

    public String getSugerencia() {
        return sugerencia;
    }

    public void setSugerencia(String sugerencia) {
        this.sugerencia = sugerencia;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Usuario getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Usuario idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsugerencia != null ? idsugerencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sugerencia)) {
            return false;
        }
        Sugerencia other = (Sugerencia) object;
        if ((this.idsugerencia == null && other.idsugerencia != null) || (this.idsugerencia != null && !this.idsugerencia.equals(other.idsugerencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rgomez.articulos.inecolprimefinal.Sugerencia[ idsugerencia=" + idsugerencia + " ]";
    }
    
}
