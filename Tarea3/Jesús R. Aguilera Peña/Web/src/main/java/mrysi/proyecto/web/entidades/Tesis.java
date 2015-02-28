/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrysi.proyecto.web.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author jaguilera
 */
@Entity
@Table(name = "TESIS")
@NamedQueries({
    @NamedQuery(name = "Tesis.findAll", query = "SELECT t FROM Tesis t")})
public class Tesis implements Serializable {
    @Size(max = 40)
    @Column(name = "DISCIPLINA")
    private String disciplina;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDTESIS")
    private Integer idtesis;
    @Size(max = 40)
    @Column(name = "AUTOR")
    private String autor;
    @Size(max = 40)
    @Column(name = "TITULO")
    private String titulo;

    public Tesis() {
    }

    public Tesis(Integer idtesis) {
        this.idtesis = idtesis;
    }

    public Integer getIdtesis() {
        return idtesis;
    }

    public void setIdtesis(Integer idtesis) {
        this.idtesis = idtesis;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtesis != null ? idtesis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tesis)) {
            return false;
        }
        Tesis other = (Tesis) object;
        if ((this.idtesis == null && other.idtesis != null) || (this.idtesis != null && !this.idtesis.equals(other.idtesis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mrysi.proyecto.web.entidades.Tesis[ idtesis=" + idtesis + " ]";
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
}
