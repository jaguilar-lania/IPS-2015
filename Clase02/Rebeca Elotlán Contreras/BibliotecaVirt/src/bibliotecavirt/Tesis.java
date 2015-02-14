/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecavirt;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author REBECA
 */
@Entity
@Table(name = "TESIS")
@NamedQueries({
    @NamedQuery(name = "Tesis.findAll", query = "SELECT t FROM Tesis t")})
public class Tesis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_TESIS")
    private String idTesis;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "AUTOR")
    private long autor;
    @Basic(optional = false)
    @Column(name = "FECHAED")
    private String fechaed;
    @Basic(optional = false)
    @Column(name = "PAIS")
    private String pais;
    @Basic(optional = false)
    @Column(name = "ID_PRIMATE")
    private String idPrimate;
    @Basic(optional = false)
    @Column(name = "ID_DISIPLINA")
    private String idDisiplina;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTesis")
    private List<Materialext> materialextList;

    public Tesis() {
    }

    public Tesis(String idTesis) {
        this.idTesis = idTesis;
    }

    public Tesis(String idTesis, String nombre, long autor, String fechaed, String pais, String idPrimate, String idDisiplina) {
        this.idTesis = idTesis;
        this.nombre = nombre;
        this.autor = autor;
        this.fechaed = fechaed;
        this.pais = pais;
        this.idPrimate = idPrimate;
        this.idDisiplina = idDisiplina;
    }

    public String getIdTesis() {
        return idTesis;
    }

    public void setIdTesis(String idTesis) {
        this.idTesis = idTesis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getAutor() {
        return autor;
    }

    public void setAutor(long autor) {
        this.autor = autor;
    }

    public String getFechaed() {
        return fechaed;
    }

    public void setFechaed(String fechaed) {
        this.fechaed = fechaed;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getIdPrimate() {
        return idPrimate;
    }

    public void setIdPrimate(String idPrimate) {
        this.idPrimate = idPrimate;
    }

    public String getIdDisiplina() {
        return idDisiplina;
    }

    public void setIdDisiplina(String idDisiplina) {
        this.idDisiplina = idDisiplina;
    }

    public List<Materialext> getMaterialextList() {
        return materialextList;
    }

    public void setMaterialextList(List<Materialext> materialextList) {
        this.materialextList = materialextList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTesis != null ? idTesis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tesis)) {
            return false;
        }
        Tesis other = (Tesis) object;
        if ((this.idTesis == null && other.idTesis != null) || (this.idTesis != null && !this.idTesis.equals(other.idTesis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bibliotecavirt.Tesis[ idTesis=" + idTesis + " ]";
    }
    
}
