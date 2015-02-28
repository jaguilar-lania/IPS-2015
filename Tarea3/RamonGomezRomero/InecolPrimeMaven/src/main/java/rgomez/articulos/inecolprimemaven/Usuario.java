/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.articulos.inecolprimemaven;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Subli
 */
@Entity
@Table(name = "USUARIO")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDUSUARIO")
    private Integer idusuario;
    @Column(name = "FECHAREGISTRO")
    @Temporal(TemporalType.DATE)
    private Date fecharegistro;
    @OneToMany(mappedBy = "idusuario")
    private List<ContadorVisitas> contadorVisitasList;
    @OneToMany(mappedBy = "idusuario")
    private List<Comentario> comentarioList;
    @JoinColumn(name = "IDROL", referencedColumnName = "IDROL")
    @ManyToOne
    private Rol idrol;
    @JoinColumn(name = "IDPERSONA", referencedColumnName = "IDPERSONA")
    @ManyToOne
    private Persona idpersona;
    @OneToMany(mappedBy = "idusuario")
    private List<Calificacion> calificacionList;
    @OneToMany(mappedBy = "idusuario")
    private List<Sugerencia> sugerenciaList;

    public Usuario() {
    }

    public Usuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Date getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    public List<ContadorVisitas> getContadorVisitasList() {
        return contadorVisitasList;
    }

    public void setContadorVisitasList(List<ContadorVisitas> contadorVisitasList) {
        this.contadorVisitasList = contadorVisitasList;
    }

    public List<Comentario> getComentarioList() {
        return comentarioList;
    }

    public void setComentarioList(List<Comentario> comentarioList) {
        this.comentarioList = comentarioList;
    }

    public Rol getIdrol() {
        return idrol;
    }

    public void setIdrol(Rol idrol) {
        this.idrol = idrol;
    }

    public Persona getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Persona idpersona) {
        this.idpersona = idpersona;
    }

    public List<Calificacion> getCalificacionList() {
        return calificacionList;
    }

    public void setCalificacionList(List<Calificacion> calificacionList) {
        this.calificacionList = calificacionList;
    }

    public List<Sugerencia> getSugerenciaList() {
        return sugerenciaList;
    }

    public void setSugerenciaList(List<Sugerencia> sugerenciaList) {
        this.sugerenciaList = sugerenciaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuario != null ? idusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idusuario == null && other.idusuario != null) || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rgomez.articulos.inecolprimemaven.Usuario[ idusuario=" + idusuario + " ]";
    }
    
}
