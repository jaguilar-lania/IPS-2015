/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesis.atesis.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Chrys
 */
@Entity
@Table(name = "ADICIONAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Adicional.findAll", query = "SELECT a FROM Adicional a"),
    @NamedQuery(name = "Adicional.findByIdMaterial", query = "SELECT a FROM Adicional a WHERE a.idMaterial = :idMaterial"),
    @NamedQuery(name = "Adicional.findByRuta", query = "SELECT a FROM Adicional a WHERE a.ruta = :ruta"),
    @NamedQuery(name = "Adicional.findByIdTesis", query = "SELECT a FROM Adicional a WHERE a.idTesis = :idTesis")})
public class Adicional implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_MATERIAL")
    private Integer idMaterial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "RUTA")
    private String ruta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_TESIS")
    private int idTesis;

    public Adicional() {
    }

    public Adicional(Integer idMaterial) {
        this.idMaterial = idMaterial;
    }

    public Adicional(Integer idMaterial, String ruta, int idTesis) {
        this.idMaterial = idMaterial;
        this.ruta = ruta;
        this.idTesis = idTesis;
    }

    public Integer getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Integer idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getIdTesis() {
        return idTesis;
    }

    public void setIdTesis(int idTesis) {
        this.idTesis = idTesis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMaterial != null ? idMaterial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adicional)) {
            return false;
        }
        Adicional other = (Adicional) object;
        if ((this.idMaterial == null && other.idMaterial != null) || (this.idMaterial != null && !this.idMaterial.equals(other.idMaterial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tesis.atesis.entidades.Adicional[ idMaterial=" + idMaterial + " ]";
    }
    
}
