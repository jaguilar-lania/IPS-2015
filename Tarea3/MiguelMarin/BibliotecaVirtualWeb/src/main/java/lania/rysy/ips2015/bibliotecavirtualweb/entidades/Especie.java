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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author miguel
 */
@Entity
@Table(name = "ESPECIE")
@NamedQueries({
    @NamedQuery(name = "Especie.findAll", query = "SELECT e FROM Especie e")})
public class Especie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDESPECIE")
    private Integer idespecie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "especie")
    private List<EspecieTesis> especieTesisList;

    public Especie() {
    }

    public Especie(Integer idespecie) {
        this.idespecie = idespecie;
    }

    public Especie(Integer idespecie, String nombre) {
        this.idespecie = idespecie;
        this.nombre = nombre;
    }

    public Integer getIdespecie() {
        return idespecie;
    }

    public void setIdespecie(Integer idespecie) {
        this.idespecie = idespecie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<EspecieTesis> getEspecieTesisList() {
        return especieTesisList;
    }

    public void setEspecieTesisList(List<EspecieTesis> especieTesisList) {
        this.especieTesisList = especieTesisList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idespecie != null ? idespecie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Especie)) {
            return false;
        }
        Especie other = (Especie) object;
        if ((this.idespecie == null && other.idespecie != null) || (this.idespecie != null && !this.idespecie.equals(other.idespecie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lania.rysy.ips2015.bibliotecavirtualweb.entidades.Especie[ idespecie=" + idespecie + " ]";
    }
    
}
