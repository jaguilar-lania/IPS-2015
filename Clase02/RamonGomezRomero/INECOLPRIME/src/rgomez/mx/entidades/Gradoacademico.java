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
@Table(name = "GRADOACADEMICO")
@NamedQueries({
    @NamedQuery(name = "Gradoacademico.findAll", query = "SELECT g FROM Gradoacademico g")})
public class Gradoacademico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDGRADOACADEMICO")
    private Integer idgradoacademico;
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(mappedBy = "idgradoacademico")
    private List<Autor> autorList;
    @OneToMany(mappedBy = "idgradoacademico")
    private List<Director> directorList;
    @OneToMany(mappedBy = "idgradoacademico")
    private List<Tesis> tesisList;

    public Gradoacademico() {
    }

    public Gradoacademico(Integer idgradoacademico) {
        this.idgradoacademico = idgradoacademico;
    }

    public Integer getIdgradoacademico() {
        return idgradoacademico;
    }

    public void setIdgradoacademico(Integer idgradoacademico) {
        this.idgradoacademico = idgradoacademico;
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
        hash += (idgradoacademico != null ? idgradoacademico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gradoacademico)) {
            return false;
        }
        Gradoacademico other = (Gradoacademico) object;
        if ((this.idgradoacademico == null && other.idgradoacademico != null) || (this.idgradoacademico != null && !this.idgradoacademico.equals(other.idgradoacademico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rgomez.mx.entidades.Gradoacademico[ idgradoacademico=" + idgradoacademico + " ]";
    }
    
}
