/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inecolprime.pojos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Frost
 */
@Entity
@Table(name = "ENTIDADFEDERATIVA")
@NamedQueries({
    @NamedQuery(name = "Entidadfederativa.findAll", query = "SELECT e FROM Entidadfederativa e")})
public class Entidadfederativa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDENTIDADFEDERATIVA")
    private Integer identidadfederativa;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "CLAVE")
    private String clave;
    @Column(name = "IDPAIS")
    private Integer idpais;

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

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
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
        return "inecolprime.pojos.Entidadfederativa[ identidadfederativa=" + identidadfederativa + " ]";
    }

    /**
     * @return the idpais
     */
    public Integer getIdpais() {
        return idpais;
    }

    /**
     * @param idpais the idpais to set
     */
    public void setIdpais(Integer idpais) {
        this.idpais = idpais;
    }
    
}
