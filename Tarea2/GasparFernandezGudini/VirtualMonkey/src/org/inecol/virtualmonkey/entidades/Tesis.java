/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inecol.virtualmonkey.entidades;

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

/**
 *
 * @author Gudini
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
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "ID_AUTOR")
    private Integer idAutor;
    @Column(name = "ID_DISCIPLINA")
    private Integer idDisciplina;
    @Column(name = "ID_SUBDISCIPLINA")
    private Integer idSubdisciplina;
    @Column(name = "ID_DIRECTOR_TESIS")
    private Integer idDirectorTesis;
    @Column(name = "ID_PRIMATE")
    private Integer idPrimate;
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "ANEXOS")
    private Short anexos;

    public Tesis() {
    }

    public Tesis(Integer idTesis) {
        this.idTesis = idTesis;
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

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public Integer getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(Integer idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public Integer getIdSubdisciplina() {
        return idSubdisciplina;
    }

    public void setIdSubdisciplina(Integer idSubdisciplina) {
        this.idSubdisciplina = idSubdisciplina;
    }

    public Integer getIdDirectorTesis() {
        return idDirectorTesis;
    }

    public void setIdDirectorTesis(Integer idDirectorTesis) {
        this.idDirectorTesis = idDirectorTesis;
    }

    public Integer getIdPrimate() {
        return idPrimate;
    }

    public void setIdPrimate(Integer idPrimate) {
        this.idPrimate = idPrimate;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Short getAnexos() {
        return anexos;
    }

    public void setAnexos(Short anexos) {
        this.anexos = anexos;
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
        return "org.inecol.virtualmonkey.entidades.Tesis[ idTesis=" + idTesis + " ]";
    }
    
}
