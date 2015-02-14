/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.mx.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Subli
 */
@Entity
@Table(name = "CATALOGO")
@NamedQueries({
    @NamedQuery(name = "Catalogo.findAll", query = "SELECT c FROM Catalogo c")})
public class Catalogo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDCATALOGO")
    private Integer idcatalogo;
    @Column(name = "IDCATEGORIA")
    private Integer idcategoria;
    @Column(name = "NOMBRE")
    private String nombre;

    public Catalogo() {
    }

    public Catalogo(Integer idcatalogo) {
        this.idcatalogo = idcatalogo;
    }

    public Integer getIdcatalogo() {
        return idcatalogo;
    }

    public void setIdcatalogo(Integer idcatalogo) {
        this.idcatalogo = idcatalogo;
    }

    public Integer getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Integer idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcatalogo != null ? idcatalogo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catalogo)) {
            return false;
        }
        Catalogo other = (Catalogo) object;
        if ((this.idcatalogo == null && other.idcatalogo != null) || (this.idcatalogo != null && !this.idcatalogo.equals(other.idcatalogo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rgomez.mx.entidades.Catalogo[ idcatalogo=" + idcatalogo + " ]";
    }
    
}
