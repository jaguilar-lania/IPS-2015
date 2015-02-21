/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Chrys
 */
@Entity
@Table(name = "PAIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pais.findAll", query = "SELECT p FROM Pais p"),
    @NamedQuery(name = "Pais.findByNomPais", query = "SELECT p FROM Pais p WHERE p.nomPais = :nomPais"),
    @NamedQuery(name = "Pais.findByIdPais", query = "SELECT p FROM Pais p WHERE p.idPais = :idPais")})
public class Pais implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "NOM_PAIS")
    private String nomPais;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PAIS")
    private Integer idPais;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idPais")
    private Estado estado;
    @OneToMany(mappedBy = "idPais")
    private Collection<Usuario> usuarioCollection;

    public Pais() {
    }

    public Pais(Integer idPais) {
        this.idPais = idPais;
    }

    public Pais(Integer idPais, String nomPais) {
        this.idPais = idPais;
        this.nomPais = nomPais;
    }

    public String getNomPais() {
        return nomPais;
    }

    public void setNomPais(String nomPais) {
        this.nomPais = nomPais;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPais != null ? idPais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pais)) {
            return false;
        }
        Pais other = (Pais) object;
        if ((this.idPais == null && other.idPais != null) || (this.idPais != null && !this.idPais.equals(other.idPais))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "biblioteca.entidades.Pais[ idPais=" + idPais + " ]";
    }
    
}
