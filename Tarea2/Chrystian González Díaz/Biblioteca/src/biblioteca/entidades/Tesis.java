/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.entidades;

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
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_TESIS")
    private Integer idTesis;
    @Basic(optional = false)
    @Column(name = "TITULO")
    private String titulo;
    @JoinColumn(name = "ID_DISCIPLINA", referencedColumnName = "ID_DISCIPLINA")
    @ManyToOne(optional = false)
    private Disciplina idDisciplina;
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
        return "biblioteca.entidades.Tesis[ idTesis=" + idTesis + " ]";
    }
    
}
