/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.mx.entidades;

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

/**
 *
 * @author Subli
 */
@Entity
@Table(name = "AUTOR")
@NamedQueries({
    @NamedQuery(name = "Autor.findAll", query = "SELECT a FROM Autor a")})
public class Autor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDAUTOR")
    private Integer idautor;
    @Basic(optional = false)
    @Column(name = "FECHADEBUT")
    @Temporal(TemporalType.DATE)
    private Date fechadebut;
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
    private Gradoacademico idgradoacademico;

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

    public Gradoacademico getIdgradoacademico() {
        return idgradoacademico;
    }

    public void setIdgradoacademico(Gradoacademico idgradoacademico) {
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
        return "rgomez.mx.entidades.Autor[ idautor=" + idautor + " ]";
    }
    
}
