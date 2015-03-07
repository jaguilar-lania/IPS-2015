/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.articulos.inecolprimefinal;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Subli
 */
@Entity
@Table(name = "ENTIDADFEDERATIVA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EntidadFederativa.findAll", query = "SELECT e FROM EntidadFederativa e"),
    @NamedQuery(name = "EntidadFederativa.findByIdentidadfederativa", query = "SELECT e FROM EntidadFederativa e WHERE e.identidadfederativa = :identidadfederativa"),
    @NamedQuery(name = "EntidadFederativa.findByNombre", query = "SELECT e FROM EntidadFederativa e WHERE e.nombre = :nombre")})
public class EntidadFederativa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDENTIDADFEDERATIVA")
    private Integer identidadfederativa;
    @Size(max = 70)
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(mappedBy = "identidadfederativa")
    private List<Persona> personaList;

    public EntidadFederativa() {
    }

    public EntidadFederativa(Integer identidadfederativa) {
        this.identidadfederativa = identidadfederativa;
    }

    public Integer getIdentidadfederativa() {
        return identidadfederativa;
    }

    public void setIdentidadfederativa(Integer identidadfederativa) {
        this.identidadfederativa = identidadfederativa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<Persona> getPersonaList() {
        return personaList;
    }

    public void setPersonaList(List<Persona> personaList) {
        this.personaList = personaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identidadfederativa != null ? identidadfederativa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntidadFederativa)) {
            return false;
        }
        EntidadFederativa other = (EntidadFederativa) object;
        if ((this.identidadfederativa == null && other.identidadfederativa != null) || (this.identidadfederativa != null && !this.identidadfederativa.equals(other.identidadfederativa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rgomez.articulos.inecolprimefinal.EntidadFederativa[ identidadfederativa=" + identidadfederativa + " ]";
    }
    
}
