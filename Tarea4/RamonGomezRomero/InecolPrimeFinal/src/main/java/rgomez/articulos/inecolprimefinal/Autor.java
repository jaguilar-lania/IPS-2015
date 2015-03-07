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
@Table(name = "AUTOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Autor.findAll", query = "SELECT a FROM Autor a"),
    @NamedQuery(name = "Autor.findByIdautor", query = "SELECT a FROM Autor a WHERE a.idautor = :idautor"),
    @NamedQuery(name = "Autor.findByFechadebut", query = "SELECT a FROM Autor a WHERE a.fechadebut = :fechadebut"),
    @NamedQuery(name = "Autor.findByNombreartistico", query = "SELECT a FROM Autor a WHERE a.nombreartistico = :nombreartistico")})
public class Autor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDAUTOR")
    private Integer idautor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHADEBUT")
    @Temporal(TemporalType.DATE)
    private Date fechadebut;
    @Size(max = 50)
    @Column(name = "NOMBREARTISTICO")
    private String nombreartistico;
    @JoinColumn(name = "IDPROFESION", referencedColumnName = "IDPROFESION")
    @ManyToOne
    private Profesion idprofesion;
    @JoinColumn(name = "IDPERSONA", referencedColumnName = "IDPERSONA")
    @ManyToOne
    private Persona idpersona;
    @JoinColumn(name = "IDINSTITUCION", referencedColumnName = "IDINSTITUCION")
    @ManyToOne
    private Institucion idinstitucion;
    @JoinColumn(name = "IDGRADOACADEMICO", referencedColumnName = "IDGRADOACADEMICO")
    @ManyToOne
    private GradoAcademico idgradoacademico;

    public Autor() {
    }

    public Autor(Integer idautor) {
        this.idautor = idautor;
    }

    public Autor(Integer idautor, Date fechadebut) {
        this.idautor = idautor;
        this.fechadebut = fechadebut;
    }

    public Integer getIdautor() {
        return idautor;
    }

    public void setIdautor(Integer idautor) {
        this.idautor = idautor;
    }

    public Date getFechadebut() {
        return fechadebut;
    }

    public void setFechadebut(Date fechadebut) {
        this.fechadebut = fechadebut;
    }

    public String getNombreartistico() {
        return nombreartistico;
    }

    public void setNombreartistico(String nombreartistico) {
        this.nombreartistico = nombreartistico;
    }

    public Profesion getIdprofesion() {
        return idprofesion;
    }

    public void setIdprofesion(Profesion idprofesion) {
        this.idprofesion = idprofesion;
    }

    public Persona getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Persona idpersona) {
        this.idpersona = idpersona;
    }

    public Institucion getIdinstitucion() {
        return idinstitucion;
    }

    public void setIdinstitucion(Institucion idinstitucion) {
        this.idinstitucion = idinstitucion;
    }

    public GradoAcademico getIdgradoacademico() {
        return idgradoacademico;
    }

    public void setIdgradoacademico(GradoAcademico idgradoacademico) {
        this.idgradoacademico = idgradoacademico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idautor != null ? idautor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Autor)) {
            return false;
        }
        Autor other = (Autor) object;
        if ((this.idautor == null && other.idautor != null) || (this.idautor != null && !this.idautor.equals(other.idautor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rgomez.articulos.inecolprimefinal.Autor[ idautor=" + idautor + " ]";
    }
    
}
