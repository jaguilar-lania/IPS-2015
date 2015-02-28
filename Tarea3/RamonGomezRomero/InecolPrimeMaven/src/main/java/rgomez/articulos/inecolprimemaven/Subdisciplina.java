/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.articulos.inecolprimemaven;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Subli
 */
@Entity
@Table(name = "SUBDISCIPLINA")
@NamedQueries({
    @NamedQuery(name = "Subdisciplina.findAll", query = "SELECT s FROM Subdisciplina s")})
public class Subdisciplina implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSUBDISCIPLINA")
    private Integer idsubdisciplina;
    
    @Size(max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    
    @JoinColumn(name = "IDDISCIPLINA", referencedColumnName = "IDDISCIPLINA")
    @ManyToOne
    private Integer iddisciplina;
    
    @OneToMany(mappedBy = "idsubdisciplina")
    private List<Tesis> tesisList;

    public Subdisciplina() {
    }

    public Subdisciplina(Integer idsubdisciplina) {
        this.idsubdisciplina = idsubdisciplina;
    }

    public Integer getIdsubdisciplina() {
        return idsubdisciplina;
    }

    public void setIdsubdisciplina(Integer idsubdisciplina) {
        this.idsubdisciplina = idsubdisciplina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIddisciplina() {
        return iddisciplina;
    }

    public void setIddisciplina(Integer iddisciplina) {
        this.iddisciplina = iddisciplina;
    }

    public List<Tesis> getTesisList() {
        return tesisList;
    }

    public void setTesisList(List<Tesis> tesisList) {
        this.tesisList = tesisList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsubdisciplina != null ? idsubdisciplina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subdisciplina)) {
            return false;
        }
        Subdisciplina other = (Subdisciplina) object;
        if ((this.idsubdisciplina == null && other.idsubdisciplina != null) || (this.idsubdisciplina != null && !this.idsubdisciplina.equals(other.idsubdisciplina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rgomez.articulos.inecolprimemaven.Subdisciplina[ idsubdisciplina=" + idsubdisciplina + " ]";
    }
    
}
