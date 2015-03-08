/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasePrimate;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author REBECA
 */
@Entity
@Table(name = "TESIS")
@NamedQueries({
    @NamedQuery(name = "Tesis.findAll", query = "SELECT t FROM Tesis t")})
public class Tesis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_TESIS")
    private Integer idTesis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "AUTOR")
    private String autor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHAED")
    @Temporal(TemporalType.DATE)
    private Date fechaed;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "PAIS")
    private String pais;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PRIMATE")
    private Integer idPrimate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_DISCIPLINA")
    private Integer idDisciplina;

    public Tesis() {
    }

    public Tesis(Integer idTesis) {
        this.idTesis = idTesis;
    }

    public Tesis(Integer idTesis, String nombre, String autor, Date fechaed, String pais, int idPrimate, int idDisciplina) {
        this.idTesis = idTesis;
        this.nombre = nombre;
        this.autor = autor;
        this.fechaed = fechaed;
        this.pais = pais;
        this.idPrimate = idPrimate;
        this.idDisciplina = idDisciplina;
    }

    public Integer getIdTesis() {
        return idTesis;
    }

    public void setIdTesis(Integer idTesis) {
        this.idTesis = idTesis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFechaed() {
        return fechaed;
    }

    public void setFechaed(Date fechaed) {
        this.fechaed = fechaed;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getIdPrimate() {
        return idPrimate;
    }

    public void setIdPrimate(Integer idPrimate) {
        this.idPrimate = idPrimate;
    }

    public Integer getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(Integer idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTesis != null ? idTesis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tesis)) {
            return false;
        }
        Tesis other = (Tesis) object;
        if ((this.idTesis == null && other.idTesis != null) || (this.idTesis != null && !this.idTesis.equals(other.idTesis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clasePrimate.Tesis[ idTesis=" + idTesis + " ]";
    }
    
}
