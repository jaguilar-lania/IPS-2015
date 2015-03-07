/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesis.monky.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Chrys
 */
@Entity
@Table(name = "TESIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tesis.findAll", query = "SELECT t FROM Tesis t"),
    @NamedQuery(name = "Tesis.findByIdTesis", query = "SELECT t FROM Tesis t WHERE t.idTesis = :idTesis"),
    @NamedQuery(name = "Tesis.findByTitulo", query = "SELECT t FROM Tesis t WHERE t.titulo = :titulo")})
public class Tesis implements Serializable {
    @Lob
    @Column(name = "ARCHIVO")
    private Serializable archivo;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_TESIS")
    private Integer idTesis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @NotEmpty
    @Column(name = "TITULO")
    private String titulo;
    @NotEmpty
    @JoinColumn(name = "ID_DISCIPLINA", referencedColumnName = "ID_DISCIPLINA")
    @ManyToOne(optional = false)
    private Disciplina idDisciplina;
    @NotEmpty
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne(optional = false)
    private Usuario idUsuario;

    public Tesis() {
    }

    public Tesis(Integer idTesis) {
        this.idTesis = idTesis;
    }

    public Tesis(Integer idTesis, String titulo) {
        this.idTesis = idTesis;
        this.titulo = titulo;
    }

    public Integer getIdTesis() {
        return idTesis;
    }

    public void setIdTesis(Integer idTesis) {
        this.idTesis = idTesis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Disciplina getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(Disciplina idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
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
        return "tesis.monky.entidades.Tesis[ idTesis=" + idTesis + " ]";
    }

    public Serializable getArchivo() {
        return archivo;
    }

    public void setArchivo(Serializable archivo) {
        this.archivo = archivo;
    }
    
}
