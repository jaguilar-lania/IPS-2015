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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Subli
 */
@Entity
@Table(name = "ENTIDADFEDERATIVA")
@NamedQueries({
    @NamedQuery(name = "Entidadfederativa.findAll", query = "SELECT e FROM Entidadfederativa e")})
public class Entidadfederativa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDENTIDADFEDERATIVA")
    private Integer identidadfederativa;
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(mappedBy = "identidadfederativa")
    private List<Persona> personaList;
    @OneToMany(mappedBy = "identidadfederativa")
    private List<Tesis> tesisList;

    public Entidadfederativa() {
    }

    public Entidadfederativa(Integer identidadfederativa) {
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

    public List<Persona> getPersonaList() {
        return personaList;
    }

    public void setPersonaList(List<Persona> personaList) {
        this.personaList = personaList;
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
        hash += (identidadfederativa != null ? identidadfederativa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entidadfederativa)) {
            return false;
        }
        Entidadfederativa other = (Entidadfederativa) object;
        if ((this.identidadfederativa == null && other.identidadfederativa != null) || (this.identidadfederativa != null && !this.identidadfederativa.equals(other.identidadfederativa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rgomez.mx.entidades.Entidadfederativa[ identidadfederativa=" + identidadfederativa + " ]";
    }
    
}
