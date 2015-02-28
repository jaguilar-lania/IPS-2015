/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis.virtualmonkeyweb;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Anny
 */
@Entity
@Table(name = "CONSULTA")
@NamedQueries({
    @NamedQuery(name = "Consulta.findAll", query = "SELECT c FROM Consulta c")})
public class Consulta implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ConsultaPK consultaPK;

    public Consulta() {
    }

    public Consulta(ConsultaPK consultaPK) {
        this.consultaPK = consultaPK;
    }

    public Consulta(int idusuario, int idtesis) {
        this.consultaPK = new ConsultaPK(idusuario, idtesis);
    }

    public ConsultaPK getConsultaPK() {
        return consultaPK;
    }

    public void setConsultaPK(ConsultaPK consultaPK) {
        this.consultaPK = consultaPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (consultaPK != null ? consultaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consulta)) {
            return false;
        }
        Consulta other = (Consulta) object;
        if ((this.consultaPK == null && other.consultaPK != null) || (this.consultaPK != null && !this.consultaPK.equals(other.consultaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.tesis.virtualmonkeyweb.Consulta[ consultaPK=" + consultaPK + " ]";
    }
    
}
