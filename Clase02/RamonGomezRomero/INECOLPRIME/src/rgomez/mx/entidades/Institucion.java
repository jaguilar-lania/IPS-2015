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
@Table(name = "INSTITUCION")
@NamedQueries({
    @NamedQuery(name = "Institucion.findAll", query = "SELECT i FROM Institucion i")})
public class Institucion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDINSTITUCION")
    private Integer idinstitucion;
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(mappedBy = "idinstitucion")
    private List<Autor> autorList;
    @OneToMany(mappedBy = "idinstitucion")
    private List<Director> directorList;
    @OneToMany(mappedBy = "idinstitucion")
    private List<Tesis> tesisList;

    public Institucion() {
    }

    public Institucion(Integer idinstitucion) {
        this.idinstitucion = idinstitucion;
    }

    public Integer getIdinstitucion() {
        return idinstitucion;
    }

    public void setIdinstitucion(Integer idinstitucion) {
        this.idinstitucion = idinstitucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Autor> getAutorList() {
        return autorList;
    }

    public void setAutorList(List<Autor> autorList) {
        this.autorList = autorList;
    }

    public List<Director> getDirectorList() {
        return directorList;
    }

    public void setDirectorList(List<Director> directorList) {
        this.directorList = directorList;
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
        hash += (idinstitucion != null ? idinstitucion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Institucion)) {
            return false;
        }
        Institucion other = (Institucion) object;
        if ((this.idinstitucion == null && other.idinstitucion != null) || (this.idinstitucion != null && !this.idinstitucion.equals(other.idinstitucion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rgomez.mx.entidades.Institucion[ idinstitucion=" + idinstitucion + " ]";
    }
    
}
