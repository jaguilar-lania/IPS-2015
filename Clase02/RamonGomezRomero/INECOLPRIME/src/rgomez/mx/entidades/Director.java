/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.mx.entidades;

import java.io.Serializable;
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

/**
 *
 * @author Subli
 */
@Entity
@Table(name = "DIRECTOR")
@NamedQueries({
    @NamedQuery(name = "Director.findAll", query = "SELECT d FROM Director d")})
public class Director implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDDIRECTOR")
    private Integer iddirector;
    @JoinColumn(name = "IDPERSONA", referencedColumnName = "IDPERSONA")
    @ManyToOne
    private Persona idpersona;
    @JoinColumn(name = "IDINSTITUCION", referencedColumnName = "IDINSTITUCION")
    @ManyToOne
    private Institucion idinstitucion;
    @JoinColumn(name = "IDGRADOACADEMICO", referencedColumnName = "IDGRADOACADEMICO")
    @ManyToOne
    private Gradoacademico idgradoacademico;
    @OneToMany(mappedBy = "iddirector")
    private List<Tesis> tesisList;

    public Director() {
    }

    public Director(Integer iddirector) {
        this.iddirector = iddirector;
    }

    public Integer getIddirector() {
        return iddirector;
    }

    public void setIddirector(Integer iddirector) {
        this.iddirector = iddirector;
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

    public List<Tesis> getTesisList() {
        return tesisList;
    }

    public void setTesisList(List<Tesis> tesisList) {
        this.tesisList = tesisList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddirector != null ? iddirector.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Director)) {
            return false;
        }
        Director other = (Director) object;
        if ((this.iddirector == null && other.iddirector != null) || (this.iddirector != null && !this.iddirector.equals(other.iddirector))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rgomez.mx.entidades.Director[ iddirector=" + iddirector + " ]";
    }
    
}
