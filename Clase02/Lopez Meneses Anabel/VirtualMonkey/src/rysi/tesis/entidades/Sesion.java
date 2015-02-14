/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Anny
 */
@Entity
@Table(name = "SESION")
@NamedQueries({
    @NamedQuery(name = "Sesion.findAll", query = "SELECT s FROM Sesion s")})
public class Sesion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SesionPK sesionPK;
    @Column(name = "FECHAINGRESO")
    @Temporal(TemporalType.DATE)
    private Date fechaingreso;
    @Column(name = "HORAINGRESO")
    @Temporal(TemporalType.TIME)
    private Date horaingreso;
    @Column(name = "FECHASALIDA")
    @Temporal(TemporalType.DATE)
    private Date fechasalida;
    @Column(name = "HORASALIDA")
    @Temporal(TemporalType.DATE)
    private Date horasalida;

    public Sesion() {
    }

    public Sesion(SesionPK sesionPK) {
        this.sesionPK = sesionPK;
    }

    public Sesion(int idusuario, int id) {
        this.sesionPK = new SesionPK(idusuario, id);
    }

    public SesionPK getSesionPK() {
        return sesionPK;
    }

    public void setSesionPK(SesionPK sesionPK) {
        this.sesionPK = sesionPK;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public Date getHoraingreso() {
        return horaingreso;
    }

    public void setHoraingreso(Date horaingreso) {
        this.horaingreso = horaingreso;
    }

    public Date getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(Date fechasalida) {
        this.fechasalida = fechasalida;
    }

    public Date getHorasalida() {
        return horasalida;
    }

    public void setHorasalida(Date horasalida) {
        this.horasalida = horasalida;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sesionPK != null ? sesionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sesion)) {
            return false;
        }
        Sesion other = (Sesion) object;
        if ((this.sesionPK == null && other.sesionPK != null) || (this.sesionPK != null && !this.sesionPK.equals(other.sesionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.tesis.entidades.Sesion[ sesionPK=" + sesionPK + " ]";
    }
    
}
