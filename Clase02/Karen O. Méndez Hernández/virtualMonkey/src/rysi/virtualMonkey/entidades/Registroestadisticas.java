/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.virtualMonkey.entidades;

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
 * @author user
 */
@Entity
@Table(name = "REGISTROESTADISTICAS")
@NamedQueries({
    @NamedQuery(name = "Registroestadisticas.findAll", query = "SELECT r FROM Registroestadisticas r")})
public class Registroestadisticas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDREGISTRO")
    private Integer idregistro;
    @Basic(optional = false)
    @Column(name = "FECHAVISITA")
    @Temporal(TemporalType.DATE)
    private Date fechavisita;
    @Column(name = "IDMATERIALEXTRA")
    private Integer idmaterialextra;
    @Column(name = "IP")
    private Integer ip;
    @JoinColumn(name = "IDTESIS", referencedColumnName = "IDTESIS")
    @ManyToOne
    private Catalogotesis catalogotesis;
    @JoinColumn(name = "IDUSUARIO", referencedColumnName = "IDUSUARIO")
    @ManyToOne(optional = false)
    private Usuario usuario;

    public Registroestadisticas() {
    }

    public Registroestadisticas(Integer idregistro) {
        this.idregistro = idregistro;
    }

    public Registroestadisticas(Integer idregistro, Date fechavisita) {
        this.idregistro = idregistro;
        this.fechavisita = fechavisita;
    }

    public Integer getIdregistro() {
        return idregistro;
    }

    public void setIdregistro(Integer idregistro) {
        this.idregistro = idregistro;
    }

    public Date getFechavisita() {
        return fechavisita;
    }

    public void setFechavisita(Date fechavisita) {
        this.fechavisita = fechavisita;
    }

    public Integer getIdmaterialextra() {
        return idmaterialextra;
    }

    public void setIdmaterialextra(Integer idmaterialextra) {
        this.idmaterialextra = idmaterialextra;
    }

    public Integer getIp() {
        return ip;
    }

    public void setIp(Integer ip) {
        this.ip = ip;
    }

    public Catalogotesis getCatalogotesis() {
        return catalogotesis;
    }

    public void setCatalogotesis(Catalogotesis catalogotesis) {
        this.catalogotesis = catalogotesis;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idregistro != null ? idregistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registroestadisticas)) {
            return false;
        }
        Registroestadisticas other = (Registroestadisticas) object;
        if ((this.idregistro == null && other.idregistro != null) || (this.idregistro != null && !this.idregistro.equals(other.idregistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.virtualMonkey.entidades.Registroestadisticas[ idregistro=" + idregistro + " ]";
    }
    
}
