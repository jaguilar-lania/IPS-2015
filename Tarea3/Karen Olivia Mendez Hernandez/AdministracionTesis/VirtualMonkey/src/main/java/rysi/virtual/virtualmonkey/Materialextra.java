/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.virtual.virtualmonkey;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "MATERIALEXTRA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materialextra.findAll", query = "SELECT m FROM Materialextra m"),
    @NamedQuery(name = "Materialextra.findByIdmaterialextra", query = "SELECT m FROM Materialextra m WHERE m.idmaterialextra = :idmaterialextra"),
    @NamedQuery(name = "Materialextra.findByTitulo", query = "SELECT m FROM Materialextra m WHERE m.titulo = :titulo"),
    @NamedQuery(name = "Materialextra.findByIdtesis", query = "SELECT m FROM Materialextra m WHERE m.idtesis = :idtesis")})
public class Materialextra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDMATERIALEXTRA")
    private Integer idmaterialextra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "TITULO")
    private String titulo;
    @Column(name = "IDTESIS")
    private Integer idtesis;

    public Materialextra() {
    }

    public Materialextra(Integer idmaterialextra) {
        this.idmaterialextra = idmaterialextra;
    }

    public Materialextra(Integer idmaterialextra, String titulo) {
        this.idmaterialextra = idmaterialextra;
        this.titulo = titulo;
    }

    public Integer getIdmaterialextra() {
        return idmaterialextra;
    }

    public void setIdmaterialextra(Integer idmaterialextra) {
        this.idmaterialextra = idmaterialextra;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getIdtesis() {
        return idtesis;
    }

    public void setIdtesis(Integer idtesis) {
        this.idtesis = idtesis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmaterialextra != null ? idmaterialextra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materialextra)) {
            return false;
        }
        Materialextra other = (Materialextra) object;
        if ((this.idmaterialextra == null && other.idmaterialextra != null) || (this.idmaterialextra != null && !this.idmaterialextra.equals(other.idmaterialextra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.articulos.articulosweb.Materialextra[ idmaterialextra=" + idmaterialextra + " ]";
    }
    
}
