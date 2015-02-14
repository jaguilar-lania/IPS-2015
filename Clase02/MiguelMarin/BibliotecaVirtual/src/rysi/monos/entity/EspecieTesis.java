/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.monos.entity;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author miguel
 */
@Entity
@Table(name = "ESPECIE_TESIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EspecieTesis.findAll", query = "SELECT e FROM EspecieTesis e")})
public class EspecieTesis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDESPECIE_TESIS")
    private Integer idespecieTesis;
    @JoinColumn(name = "IDESPACIE", referencedColumnName = "IDESPECIE")
    @ManyToOne(optional = false)
    private Especie especie;
    @JoinColumn(name = "IDTESIS", referencedColumnName = "IDTESIS")
    @ManyToOne(optional = false)
    private Tesis tesis;

    public EspecieTesis() {
    }

    public EspecieTesis(Integer idespecieTesis) {
        this.idespecieTesis = idespecieTesis;
    }

    public Integer getIdespecieTesis() {
        return idespecieTesis;
    }

    public void setIdespecieTesis(Integer idespecieTesis) {
        this.idespecieTesis = idespecieTesis;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Tesis getTesis() {
        return tesis;
    }

    public void setTesis(Tesis tesis) {
        this.tesis = tesis;
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
        return "rysi.monos.entity.EspecieTesis[ idespecieTesis=" + idespecieTesis + " ]";
    }
    
}
