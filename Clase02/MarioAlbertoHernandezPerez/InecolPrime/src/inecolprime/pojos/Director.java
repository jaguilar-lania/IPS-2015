/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inecolprime.pojos;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Frost
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
    @JoinColumn(name = "IDDIRECTOR", referencedColumnName = "IDPERSONA", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Persona persona;
    @JoinColumn(name = "IDINSTITUCION", referencedColumnName = "IDCATALOGO")
    @ManyToOne
    private Catalogo catalogo;
    @JoinColumn(name = "IDGRADOACADEMICO", referencedColumnName = "IDCATALOGO")
    @ManyToOne
    private Catalogo catalogo1;
    @JoinColumn(name = "IDPROFESION", referencedColumnName = "IDCATALOGO")
    @ManyToOne
    private Catalogo catalogo2;
    @OneToMany(mappedBy = "director")
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

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public Catalogo getCatalogo1() {
        return catalogo1;
    }

    public void setCatalogo1(Catalogo catalogo1) {
        this.catalogo1 = catalogo1;
    }

    public Catalogo getCatalogo2() {
        return catalogo2;
    }

    public void setCatalogo2(Catalogo catalogo2) {
        this.catalogo2 = catalogo2;
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
        return "inecolprime.pojos.Director[ iddirector=" + iddirector + " ]";
    }
    
}
