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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Subli
 */
@Entity
@Table(name = "DOCUMENTOMULTIMEDIA")
@NamedQueries({
    @NamedQuery(name = "Documentomultimedia.findAll", query = "SELECT d FROM Documentomultimedia d")})
public class Documentomultimedia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDDOCUMENTO")
    private Integer iddocumento;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "URL")
    private String url;
    @JoinColumn(name = "IDTESIS", referencedColumnName = "IDTESIS")
    @ManyToOne
    private Tesis idtesis;

    public Documentomultimedia() {
    }

    public Documentomultimedia(Integer iddocumento) {
        this.iddocumento = iddocumento;
    }

    public Integer getIddocumento() {
        return iddocumento;
    }

    public void setIddocumento(Integer iddocumento) {
        this.iddocumento = iddocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Tesis getIdtesis() {
        return idtesis;
    }

    public void setIdtesis(Tesis idtesis) {
        this.idtesis = idtesis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddocumento != null ? iddocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Documentomultimedia)) {
            return false;
        }
        Documentomultimedia other = (Documentomultimedia) object;
        if ((this.iddocumento == null && other.iddocumento != null) || (this.iddocumento != null && !this.iddocumento.equals(other.iddocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rgomez.mx.entidades.Documentomultimedia[ iddocumento=" + iddocumento + " ]";
    }
    
}
