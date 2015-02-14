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
@Table(name = "PROFESION")
@NamedQueries({
    @NamedQuery(name = "Profesion.findAll", query = "SELECT p FROM Profesion p")})
public class Profesion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDPROFESION")
    private Integer idprofesion;
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(mappedBy = "idprofesion")
    private List<Autor> autorList;

    public Profesion() {
    }

    public Profesion(Integer idprofesion) {
        this.idprofesion = idprofesion;
    }

    public Integer getIdprofesion() {
        return idprofesion;
    }

    public void setIdprofesion(Integer idprofesion) {
        this.idprofesion = idprofesion;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprofesion != null ? idprofesion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profesion)) {
            return false;
        }
        Profesion other = (Profesion) object;
        if ((this.idprofesion == null && other.idprofesion != null) || (this.idprofesion != null && !this.idprofesion.equals(other.idprofesion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rgomez.mx.entidades.Profesion[ idprofesion=" + idprofesion + " ]";
    }
    
}
