/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lania.rysi.inecolprimeweb.EO;

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

/**
 *
 * @author Frost
 */
@Entity
@Table(name = "MUNICIPIO")
@NamedQueries({
    @NamedQuery(name = "Municipio.findAll", query = "SELECT m FROM Municipio m")})
public class Municipio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDMUNICIPIO")
    private Integer idmunicipio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDENTIDADFEDERATIVA")
    private int identidadfederativa;
    @Size(max = 60)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 5)
    @Column(name = "CLAVE")
    private String clave;

    public Municipio() {
    }

    public Municipio(Integer idmunicipio) {
        this.idmunicipio = idmunicipio;
    }

    public Municipio(Integer idmunicipio, int identidadfederativa) {
        this.idmunicipio = idmunicipio;
        this.identidadfederativa = identidadfederativa;
    }

    public Integer getIdmunicipio() {
        return idmunicipio;
    }

    public void setIdmunicipio(Integer idmunicipio) {
        this.idmunicipio = idmunicipio;
    }

    public int getIdentidadfederativa() {
        return identidadfederativa;
    }

    public void setIdentidadfederativa(int identidadfederativa) {
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
        hash += (idmunicipio != null ? idmunicipio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Municipio)) {
            return false;
        }
        Municipio other = (Municipio) object;
        if ((this.idmunicipio == null && other.idmunicipio != null) || (this.idmunicipio != null && !this.idmunicipio.equals(other.idmunicipio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lania.rysi.inecolprimeweb.EO.Municipio[ idmunicipio=" + idmunicipio + " ]";
    }
    
}
