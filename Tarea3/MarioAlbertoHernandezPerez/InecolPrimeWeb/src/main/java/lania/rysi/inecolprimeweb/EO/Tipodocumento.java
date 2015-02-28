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
import javax.validation.constraints.Size;

/**
 *
 * @author Frost
 */
@Entity
@Table(name = "TIPODOCUMENTO")
@NamedQueries({
    @NamedQuery(name = "Tipodocumento.findAll", query = "SELECT t FROM Tipodocumento t")})
public class Tipodocumento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDTIPODOCUMENTO")
    private Integer idtipodocumento;
    @Size(max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Size(max = 50)
    @Column(name = "EXTENSIONES")
    private String extensiones;

    public Tipodocumento() {
    }

    public Tipodocumento(Integer idtipodocumento) {
        this.idtipodocumento = idtipodocumento;
    }

    public Integer getIdtipodocumento() {
        return idtipodocumento;
    }

    public void setIdtipodocumento(Integer idtipodocumento) {
        this.idtipodocumento = idtipodocumento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getExtensiones() {
        return extensiones;
    }

    public void setExtensiones(String extensiones) {
        this.extensiones = extensiones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipodocumento != null ? idtipodocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipodocumento)) {
            return false;
        }
        Tipodocumento other = (Tipodocumento) object;
        if ((this.idtipodocumento == null && other.idtipodocumento != null) || (this.idtipodocumento != null && !this.idtipodocumento.equals(other.idtipodocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lania.rysi.inecolprimeweb.EO.Tipodocumento[ idtipodocumento=" + idtipodocumento + " ]";
    }
    
}
