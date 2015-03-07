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
@Table(name = "GRADOACADEMICO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GradoAcademico.findAll", query = "SELECT g FROM GradoAcademico g"),
    @NamedQuery(name = "GradoAcademico.findByIdgradoacademico", query = "SELECT g FROM GradoAcademico g WHERE g.idgradoacademico = :idgradoacademico"),
    @NamedQuery(name = "GradoAcademico.findByNombre", query = "SELECT g FROM GradoAcademico g WHERE g.nombre = :nombre")})
public class GradoAcademico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGRADOACADEMICO")
    private Integer idgradoacademico;
    @Size(max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(mappedBy = "idgradoacademico")
    private List<Autor> autorList;
    @OneToMany(mappedBy = "idgradoacademico")
    private List<Director> directorList;
    @OneToMany(mappedBy = "idgradoacademico")
    private List<Tesis> tesisList;

    public GradoAcademico() {
    }

    public GradoAcademico(Integer idgradoacademico) {
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

    @XmlTransient
    public List<Autor> getAutorList() {
        return autorList;
    }

    public void setAutorList(List<Autor> autorList) {
        this.autorList = autorList;
    }

    @XmlTransient
    public List<Director> getDirectorList() {
        return directorList;
    }

    public void setDirectorList(List<Director> directorList) {
        this.directorList = directorList;
    }

    @XmlTransient
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
        if (!(object instanceof GradoAcademico)) {
            return false;
        }
        GradoAcademico other = (GradoAcademico) object;
        if ((this.idgradoacademico == null && other.idgradoacademico != null) || (this.idgradoacademico != null && !this.idgradoacademico.equals(other.idgradoacademico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rgomez.articulos.inecolprimefinal.GradoAcademico[ idgradoacademico=" + idgradoacademico + " ]";
    }
    
}
