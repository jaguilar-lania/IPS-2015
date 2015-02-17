/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.virtualMonkey.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "CATALOGOTESIS")

public class Catalogotesis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDTESIS")
    private Integer idtesis;
    @Basic(optional = false)
    @Column(name = "TITULO")
    private String titulo;
    @Basic(optional = false)
    @Column(name = "AUTOR")
    private String autor;
    @Basic(optional = false)
    @Column(name = "DISCIPLINA")
    private String disciplina;
    @Basic(optional = false)
    @Column(name = "ESPECIE")
    private String especie;
    @Basic(optional = false)
    @Column(name = "SUBDISCIPLINA")
    private String subdisciplina;
    
    public Catalogotesis() {
    }

    public Catalogotesis(Integer idtesis) {
        this.idtesis = idtesis;
    }

    public Catalogotesis(Integer idtesis, String titulo, String autor, String disciplina, String especie, String subdisciplina) {
        this.idtesis = idtesis;
        this.titulo = titulo;
        this.autor = autor;
        this.disciplina = disciplina;
        this.especie = especie;
        this.subdisciplina = subdisciplina;
    }

    public Integer getIdtesis() {
        return idtesis;
    }

    public void setIdtesis(Integer idtesis) {
        this.idtesis = idtesis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSubdisciplina() {
        return subdisciplina;
    }

    public void setSubdisciplina(String subdisciplina) {
        this.subdisciplina = subdisciplina;
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
        if (!(object instanceof Catalogotesis)) {
            return false;
        }
        Catalogotesis other = (Catalogotesis) object;
        if ((this.idtesis == null && other.idtesis != null) || (this.idtesis != null && !this.idtesis.equals(other.idtesis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.virtualMonkey.entidades.Catalogotesis[ idtesis=" + idtesis + " ]";
    }
    
}
