/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.monos.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author miguel
 */
@Entity
@Table(name = "SUBDISCIPLINA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subdisciplina.findAll", query = "SELECT s FROM Subdisciplina s")})
public class Subdisciplina implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDSUBDISCIPLINA")
    private Integer idsubdisciplina;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subdisciplina")
//    private List<Tesis> tesisList;

    public Subdisciplina() {
    }

    public Subdisciplina(Integer idsubdisciplina) {
        this.idsubdisciplina = idsubdisciplina;
    }

    public Subdisciplina(Integer idsubdisciplina, String nombre) {
        this.idsubdisciplina = idsubdisciplina;
        this.nombre = nombre;
    }

    public Integer getIdsubdisciplina() {
        return idsubdisciplina;
    }

    public void setIdsubdisciplina(Integer idsubdisciplina) {
        this.idsubdisciplina = idsubdisciplina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//    @XmlTransient
//    public List<Tesis> getTesisList() {
//        return tesisList;
//    }
//
//    public void setTesisList(List<Tesis> tesisList) {
//        this.tesisList = tesisList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsubdisciplina != null ? idsubdisciplina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subdisciplina)) {
            return false;
        }
        Subdisciplina other = (Subdisciplina) object;
        if ((this.idsubdisciplina == null && other.idsubdisciplina != null) || (this.idsubdisciplina != null && !this.idsubdisciplina.equals(other.idsubdisciplina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.monos.entity.Subdisciplina[ idsubdisciplina=" + idsubdisciplina + " ]";
    }
    
}
