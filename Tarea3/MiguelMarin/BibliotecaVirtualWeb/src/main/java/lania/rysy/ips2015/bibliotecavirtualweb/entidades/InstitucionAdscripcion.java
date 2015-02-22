/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lania.rysy.ips2015.bibliotecavirtualweb.entidades;

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
@Table(name = "INSTITUCION_ADSCRIPCION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InstitucionAdscripcion.findAll", query = "SELECT i FROM InstitucionAdscripcion i")})
public class InstitucionAdscripcion implements Serializable {
    private static final long serialVersionUID = 1L;
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDISTITUCION_ADSCRIPCION")
    private Integer idistitucionAdscripcion;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "institucionAdscripcion")
//    private List<Tesis> tesisList;

    public InstitucionAdscripcion() {
    }

    public InstitucionAdscripcion(Integer idistitucionAdscripcion) {
        this.idistitucionAdscripcion = idistitucionAdscripcion;
    }

    public InstitucionAdscripcion(Integer idistitucionAdscripcion, String nombre) {
        this.idistitucionAdscripcion = idistitucionAdscripcion;
        this.nombre = nombre;
    }

    public Integer getIdistitucionAdscripcion() {
        return idistitucionAdscripcion;
    }

    public void setIdistitucionAdscripcion(Integer idistitucionAdscripcion) {
        this.idistitucionAdscripcion = idistitucionAdscripcion;
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
        hash += (idistitucionAdscripcion != null ? idistitucionAdscripcion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InstitucionAdscripcion)) {
            return false;
        }
        InstitucionAdscripcion other = (InstitucionAdscripcion) object;
        if ((this.idistitucionAdscripcion == null && other.idistitucionAdscripcion != null) || (this.idistitucionAdscripcion != null && !this.idistitucionAdscripcion.equals(other.idistitucionAdscripcion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.monos.entity.InstitucionAdscripcion[ idistitucionAdscripcion=" + idistitucionAdscripcion + " ]";
    }
    
}
