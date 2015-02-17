/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.virtualMonkey.entidades;

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

/**
 *
 * @author user
 */
@Entity
@Table(name = "MATERIALEXTRA")

public class Materialextra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Basic(optional = false)
    @Column(name = "IDMATERIALEXTRA")
    private Integer idmaterialextra;
    
    @Basic(optional = false)
    @Column(name = "TITULO")
    private String titulo;
    
    @Basic(optional = false)
    @Column(name = "IDTESIS")
    private Integer idtesis;
    
//    @JoinColumn(name = "IDTESIS", referencedColumnName = "IDTESIS")
//    @ManyToOne
//    private Catalogotesis catalogotesis;
    

    public Materialextra() {
    }

    public Materialextra(Integer idmaterialextra) {
        this.idmaterialextra = idmaterialextra;
    }

    public Materialextra(Integer idmaterialextra, String titulo, Integer idtesis) {
        this.idmaterialextra = idmaterialextra;
        this.titulo = titulo;
        this.idtesis = idtesis;
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

//    public Catalogotesis getCatalogotesis() {
//        return catalogotesis;
//    }
   
//    public void setCatalogotesis(Catalogotesis catalogotesis) {
//        this.catalogotesis = catalogotesis;
//    }

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
        return "rysi.virtualMonkey.entidades.Materialextra[ idmaterialextra=" + idmaterialextra + " ]";
    }
    
}
