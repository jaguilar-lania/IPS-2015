/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.monos.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author miguel
 */
@Entity
@Table(name = "MATERIAL_ADICIONAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MaterialAdicional.findAll", query = "SELECT m FROM MaterialAdicional m")})
public class MaterialAdicional implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDMATERIAL_ADICIONAL")
    private Integer idmaterialAdicional;
    @Basic(optional = false)
    @Column(name = "ARCHIVO")
    private String archivo;
    @Basic(optional = false)
    @Column(name = "TIPO_ARCHIVO")
    private int tipoArchivo;
    @JoinColumn(name = "IDTESIS", referencedColumnName = "IDTESIS")
    @ManyToOne(optional = false)
    private Tesis tesis;

    public MaterialAdicional() {
    }

    public MaterialAdicional(Integer idmaterialAdicional) {
        this.idmaterialAdicional = idmaterialAdicional;
    }

    public MaterialAdicional(Integer idmaterialAdicional, String archivo, int tipoArchivo) {
        this.idmaterialAdicional = idmaterialAdicional;
        this.archivo = archivo;
        this.tipoArchivo = tipoArchivo;
    }

    public Integer getIdmaterialAdicional() {
        return idmaterialAdicional;
    }

    public void setIdmaterialAdicional(Integer idmaterialAdicional) {
        this.idmaterialAdicional = idmaterialAdicional;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public int getTipoArchivo() {
        return tipoArchivo;
    }

    public void setTipoArchivo(int tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    public Tesis getTesis() {
        return tesis;
    }

    public void setTesis(Tesis tesis) {
        this.tesis = tesis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmaterialAdicional != null ? idmaterialAdicional.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MaterialAdicional)) {
            return false;
        }
        MaterialAdicional other = (MaterialAdicional) object;
        if ((this.idmaterialAdicional == null && other.idmaterialAdicional != null) || (this.idmaterialAdicional != null && !this.idmaterialAdicional.equals(other.idmaterialAdicional))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.monos.entity.MaterialAdicional[ idmaterialAdicional=" + idmaterialAdicional + " ]";
    }
    
}
