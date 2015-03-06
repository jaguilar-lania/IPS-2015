/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lania.rysy.ips2015.bibliotecavirtualweb.entidades;

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
import javax.validation.constraints.NotNull;

/**
 *
 * @author miguel
 */
@Entity
@Table(name = "ESPECIE_TESIS")
@NamedQueries({
    @NamedQuery(name = "EspecieTesis.findAll", query = "SELECT e FROM EspecieTesis e")})
public class EspecieTesis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDESPECIE_TESIS")
    private Integer idespecieTesis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTESIS")
    private int idtesis;
    @JoinColumn(name = "IDESPACIE", referencedColumnName = "IDESPECIE")
    @ManyToOne(optional = false)
    private Especie especie;

    public EspecieTesis() {
    }

    public EspecieTesis(Integer idespecieTesis) {
        this.idespecieTesis = idespecieTesis;
    }

    public EspecieTesis(Integer idespecieTesis, int idtesis) {
        this.idespecieTesis = idespecieTesis;
        this.idtesis = idtesis;
    }

    public Integer getIdespecieTesis() {
        return idespecieTesis;
    }

    public void setIdespecieTesis(Integer idespecieTesis) {
        this.idespecieTesis = idespecieTesis;
    }

    public int getIdtesis() {
        return idtesis;
    }

    public void setIdtesis(int idtesis) {
        this.idtesis = idtesis;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idespecieTesis != null ? idespecieTesis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EspecieTesis)) {
            return false;
        }
        EspecieTesis other = (EspecieTesis) object;
        if ((this.idespecieTesis == null && other.idespecieTesis != null) || (this.idespecieTesis != null && !this.idespecieTesis.equals(other.idespecieTesis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lania.rysy.ips2015.bibliotecavirtualweb.entidades.EspecieTesis[ idespecieTesis=" + idespecieTesis + " ]";
    }
    
}
