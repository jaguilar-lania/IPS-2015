/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis.virtualmonkeyweb;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Anny
 */
@Entity
@Table(name = "MATERIALEXTRA")
@NamedQueries({
    @NamedQuery(name = "Materialextra.findAll", query = "SELECT m FROM Materialextra m")})
public class Materialextra implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MaterialextraPK materialextraPK;
    @Size(max = 250)
    @Column(name = "ARCHIVO")
    private String archivo;
    @Column(name = "TIPO")
    private Integer tipo;

    public Materialextra() {
    }

    public Materialextra(MaterialextraPK materialextraPK) {
        this.materialextraPK = materialextraPK;
    }

    public Materialextra(int id, long idtesis) {
        this.materialextraPK = new MaterialextraPK(id, idtesis);
    }

    public MaterialextraPK getMaterialextraPK() {
        return materialextraPK;
    }

    public void setMaterialextraPK(MaterialextraPK materialextraPK) {
        this.materialextraPK = materialextraPK;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (materialextraPK != null ? materialextraPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materialextra)) {
            return false;
        }
        Materialextra other = (Materialextra) object;
        if ((this.materialextraPK == null && other.materialextraPK != null) || (this.materialextraPK != null && !this.materialextraPK.equals(other.materialextraPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.tesis.virtualmonkeyweb.Materialextra[ materialextraPK=" + materialextraPK + " ]";
    }
    
}
