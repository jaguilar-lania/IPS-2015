/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.mx.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Subli
 */
@Entity
@Table(name = "CONTADORVISITAS")
@NamedQueries({
    @NamedQuery(name = "Contadorvisitas.findAll", query = "SELECT c FROM Contadorvisitas c")})
public class Contadorvisitas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDCONTADORVISITAS")
    private Integer idcontadorvisitas;
    @Column(name = "TIEMPOVISITA")
    @Temporal(TemporalType.DATE)
    private Date tiempovisita;
    @JoinColumn(name = "IDUSUARIO", referencedColumnName = "IDUSUARIO")
    @ManyToOne
    private Usuario idusuario;
    @JoinColumn(name = "IDTESIS", referencedColumnName = "IDTESIS")
    @ManyToOne
    private Tesis idtesis;
    @JoinColumn(name = "IDPAIS", referencedColumnName = "IDPAIS")
    @ManyToOne
    private Pais idpais;

    public Contadorvisitas() {
    }

    public Contadorvisitas(Integer idcontadorvisitas) {
        this.idcontadorvisitas = idcontadorvisitas;
    }

    public Integer getIdcontadorvisitas() {
        return idcontadorvisitas;
    }

    public void setIdcontadorvisitas(Integer idcontadorvisitas) {
        this.idcontadorvisitas = idcontadorvisitas;
    }

    public Date getTiempovisita() {
        return tiempovisita;
    }

    public void setTiempovisita(Date tiempovisita) {
        this.tiempovisita = tiempovisita;
    }

    public Usuario getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Usuario idusuario) {
        this.idusuario = idusuario;
    }

    public Tesis getIdtesis() {
        return idtesis;
    }

    public void setIdtesis(Tesis idtesis) {
        this.idtesis = idtesis;
    }

    public Pais getIdpais() {
        return idpais;
    }

    public void setIdpais(Pais idpais) {
        this.idpais = idpais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcontadorvisitas != null ? idcontadorvisitas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contadorvisitas)) {
            return false;
        }
        Contadorvisitas other = (Contadorvisitas) object;
        if ((this.idcontadorvisitas == null && other.idcontadorvisitas != null) || (this.idcontadorvisitas != null && !this.idcontadorvisitas.equals(other.idcontadorvisitas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rgomez.mx.entidades.Contadorvisitas[ idcontadorvisitas=" + idcontadorvisitas + " ]";
    }
    
}
