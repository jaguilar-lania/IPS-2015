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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Frost
 */
@Entity
@Table(name = "DIRECTOR")
@NamedQueries({
    @NamedQuery(name = "Director.findAll", query = "SELECT d FROM Director d")})
public class Director implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDIRECTOR")
    private Integer iddirector;
    @Column(name = "IDINSTITUCION")
    private Integer idinstitucion;
    @Column(name = "IDGRADOACADEMICO")
    private Integer idgradoacademico;
    @Column(name = "IDPROFESION")
    private Integer idprofesion;

    public Director() {
    }

    public Director(Integer iddirector) {
        this.iddirector = iddirector;
    }

    public Integer getIddirector() {
        return iddirector;
    }

    public void setIddirector(Integer iddirector) {
        this.iddirector = iddirector;
    }

    public Integer getIdinstitucion() {
        return idinstitucion;
    }

    public void setIdinstitucion(Integer idinstitucion) {
        this.idinstitucion = idinstitucion;
    }

    public Integer getIdgradoacademico() {
        return idgradoacademico;
    }

    public void setIdgradoacademico(Integer idgradoacademico) {
        this.idgradoacademico = idgradoacademico;
    }

    public Integer getIdprofesion() {
        return idprofesion;
    }

    public void setIdprofesion(Integer idprofesion) {
        this.idprofesion = idprofesion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddirector != null ? iddirector.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Director)) {
            return false;
        }
        Director other = (Director) object;
        if ((this.iddirector == null && other.iddirector != null) || (this.iddirector != null && !this.iddirector.equals(other.iddirector))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lania.rysi.inecolprimeweb.EO.Director[ iddirector=" + iddirector + " ]";
    }
    
}
