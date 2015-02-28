/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lania.rysi.inecolprimeweb.EO;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Frost
 */
@Entity
@Table(name = "ROLPERMISO")
@NamedQueries({
    @NamedQuery(name = "Rolpermiso.findAll", query = "SELECT r FROM Rolpermiso r")})
public class Rolpermiso implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RolpermisoPK rolpermisoPK;

    public Rolpermiso() {
    }

    public Rolpermiso(RolpermisoPK rolpermisoPK) {
        this.rolpermisoPK = rolpermisoPK;
    }

    public Rolpermiso(int idrol, int idpermiso) {
        this.rolpermisoPK = new RolpermisoPK(idrol, idpermiso);
    }

    public RolpermisoPK getRolpermisoPK() {
        return rolpermisoPK;
    }

    public void setRolpermisoPK(RolpermisoPK rolpermisoPK) {
        this.rolpermisoPK = rolpermisoPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolpermisoPK != null ? rolpermisoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rolpermiso)) {
            return false;
        }
        Rolpermiso other = (Rolpermiso) object;
        if ((this.rolpermisoPK == null && other.rolpermisoPK != null) || (this.rolpermisoPK != null && !this.rolpermisoPK.equals(other.rolpermisoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lania.rysi.inecolprimeweb.EO.Rolpermiso[ rolpermisoPK=" + rolpermisoPK + " ]";
    }
    
}
