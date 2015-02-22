/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lania.rysy.ips2015.bibliotecavirtualweb.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author miguel
 */
@MappedSuperclass
@Table(name = "CONTADOR")
public class Contador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCONTADOR")
    private Integer idcontador;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMERO_VISITAS")
    private long numeroVisitas;

    public Contador() {
    }

    public Contador(Integer idcontador) {
        this.idcontador = idcontador;
    }

    public Contador(Integer idcontador, long numeroVisitas) {
        this.idcontador = idcontador;
        this.numeroVisitas = numeroVisitas;
    }

    public Integer getIdcontador() {
        return idcontador;
    }

    public void setIdcontador(Integer idcontador) {
        this.idcontador = idcontador;
    }

    public long getNumeroVisitas() {
        return numeroVisitas;
    }

    public void setNumeroVisitas(long numeroVisitas) {
        this.numeroVisitas = numeroVisitas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcontador != null ? idcontador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contador)) {
            return false;
        }
        Contador other = (Contador) object;
        if ((this.idcontador == null && other.idcontador != null) || (this.idcontador != null && !this.idcontador.equals(other.idcontador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lania.rysy.ips2015.bibliotecavirtualweb.entidades.Contador[ idcontador=" + idcontador + " ]";
    }
    
}
