/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.proyecto.entidades;

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

/**
 *
 * @author jaguilera
 */
@Entity
@Table(name = "MATERIALADICIONAL")
@NamedQueries({
    @NamedQuery(name = "Materialadicional.findAll", query = "SELECT m FROM Materialadicional m")})
public class Materialadicional implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDMATERIAL")
    private Integer idmaterial;
    @Basic(optional = false)
    @Column(name = "IDTESIS")
    private int idtesis;
    @Basic(optional = false)
    @Column(name = "ARCHIVO")
    private String archivo;

    public Materialadicional() {
    }

    public Materialadicional(Integer idmaterial) {
        this.idmaterial = idmaterial;
    }

    public Materialadicional(Integer idmaterial, int idtesis, String archivo) {
        this.idmaterial = idmaterial;
        this.idtesis = idtesis;
        this.archivo = archivo;
    }

    public Integer getIdmaterial() {
        return idmaterial;
    }

    public void setIdmaterial(Integer idmaterial) {
        this.idmaterial = idmaterial;
    }

    public int getIdtesis() {
        return idtesis;
    }

    public void setIdtesis(int idtesis) {
        this.idtesis = idtesis;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmaterial != null ? idmaterial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materialadicional)) {
            return false;
        }
        Materialadicional other = (Materialadicional) object;
        if ((this.idmaterial == null && other.idmaterial != null) || (this.idmaterial != null && !this.idmaterial.equals(other.idmaterial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.proyecto.entidades.Materialadicional[ idmaterial=" + idmaterial + " ]";
    }
    
}
