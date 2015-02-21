/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omarprueba.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author rterr_000
 */
@Entity
@Table(name = "TESIS")
@NamedQueries({
    @NamedQuery(name = "Tesis.findAll", query = "SELECT t FROM Tesis t")})
public class Tesis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDTESIS")
    private Integer idtesis;
    @Basic(optional = false)
    @Column(name = "TITULO")
    private String titulo;
    @Basic(optional = false)
    @Column(name = "FGRADO")
    @Temporal(TemporalType.DATE)
    private Date fgrado;
    @Basic(optional = false)
    @Column(name = "DISCIPLINA")
    private String disciplina;
    @Basic(optional = false)
    @Column(name = "IES")
    private String ies;
    @Basic(optional = false)
    @Column(name = "IDGRADO")
    private int idgrado;
    @Basic(optional = false)
    @Column(name = "IDAUTOR")
    private int idautor;
    @Basic(optional = false)
    @Column(name = "IDPAIS")
    private int idpais;
    @Basic(optional = false)
    @Column(name = "IDDIRECTOR")
    private int iddirector;

    public Tesis() {
    }

    public Tesis(Integer idtesis) {
        this.idtesis = idtesis;
    }

    public Tesis(Integer idtesis, String titulo, Date fgrado, String disciplina, String ies, int idgrado, int idautor, int idpais, int iddirector) {
        this.idtesis = idtesis;
        this.titulo = titulo;
        this.fgrado = fgrado;
        this.disciplina = disciplina;
        this.ies = ies;
        this.idgrado = idgrado;
        this.idautor = idautor;
        this.idpais = idpais;
        this.iddirector = iddirector;
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

    public Date getFgrado() {
        return fgrado;
    }

    public void setFgrado(Date fgrado) {
        this.fgrado = fgrado;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getIes() {
        return ies;
    }

    public void setIes(String ies) {
        this.ies = ies;
    }

    public int getIdgrado() {
        return idgrado;
    }

    public void setIdgrado(int idgrado) {
        this.idgrado = idgrado;
    }

    public int getIdautor() {
        return idautor;
    }

    public void setIdautor(int idautor) {
        this.idautor = idautor;
    }

    public int getIdpais() {
        return idpais;
    }

    public void setIdpais(int idpais) {
        this.idpais = idpais;
    }

    public int getIddirector() {
        return iddirector;
    }

    public void setIddirector(int iddirector) {
        this.iddirector = iddirector;
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
        return "omarprueba.entidades.Tesis[ idtesis=" + idtesis + " ]";
    }
    
}
