/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inecolprime.pojos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Frost
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
    @Column(name = "IDTESIS")
    private Integer idtesis;
    @Column(name = "TITULO")
    private String titulo;
    @Column(name = "CONDICIONES")
    private String condiciones;
    @Column(name = "ANIO")
    private Integer anio;
    @Column(name = "SINTESIS")
    private String sintesis;
    @OneToMany(mappedBy = "tesis")
    private List<Comentario> comentarioList;
    @OneToMany(mappedBy = "tesis")
    private List<Visita> visitaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tesis")
    private List<Documento> documentoList;
    @OneToMany(mappedBy = "tesis")
    private List<Calificacion> calificacionList;
    @JoinColumn(name = "IDPAIS", referencedColumnName = "IDPAIS")
    @ManyToOne
    private Pais pais;
    @JoinColumn(name = "IDENTIDADFEDERATIVA", referencedColumnName = "IDENTIDADFEDERATIVA")
    @ManyToOne
    private Entidadfederativa entidadfederativa;
    @JoinColumn(name = "IDDIRECTOR", referencedColumnName = "IDDIRECTOR")
    @ManyToOne
    private Director director;
    @JoinColumn(name = "IDDISCIPLINA", referencedColumnName = "IDCATALOGO")
    @ManyToOne
    private Catalogo catalogo;
    @JoinColumn(name = "IDSUBDISCIPLINA", referencedColumnName = "IDCATALOGO")
    @ManyToOne
    private Catalogo catalogo1;
    @JoinColumn(name = "IDINSTITUCION", referencedColumnName = "IDCATALOGO")
    @ManyToOne
    private Catalogo catalogo2;
    @JoinColumn(name = "IDGRADO", referencedColumnName = "IDCATALOGO")
    @ManyToOne
    private Catalogo catalogo3;
    @JoinColumn(name = "IDESPECIE", referencedColumnName = "IDCATALOGO")
    @ManyToOne
    private Catalogo catalogo4;
    @JoinColumn(name = "IDAUTOR", referencedColumnName = "IDAUTOR")
    @ManyToOne
    private Autor autor;

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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getSintesis() {
        return sintesis;
    }

    public void setSintesis(String sintesis) {
        this.sintesis = sintesis;
    }

    public List<Comentario> getComentarioList() {
        return comentarioList;
    }

    public void setComentarioList(List<Comentario> comentarioList) {
        this.comentarioList = comentarioList;
    }

    public List<Visita> getVisitaList() {
        return visitaList;
    }

    public void setVisitaList(List<Visita> visitaList) {
        this.visitaList = visitaList;
    }

    public List<Documento> getDocumentoList() {
        return documentoList;
    }

    public void setDocumentoList(List<Documento> documentoList) {
        this.documentoList = documentoList;
    }

    public List<Calificacion> getCalificacionList() {
        return calificacionList;
    }

    public void setCalificacionList(List<Calificacion> calificacionList) {
        this.calificacionList = calificacionList;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Entidadfederativa getEntidadfederativa() {
        return entidadfederativa;
    }

    public void setEntidadfederativa(Entidadfederativa entidadfederativa) {
        this.entidadfederativa = entidadfederativa;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public Catalogo getCatalogo1() {
        return catalogo1;
    }

    public void setCatalogo1(Catalogo catalogo1) {
        this.catalogo1 = catalogo1;
    }

    public Catalogo getCatalogo2() {
        return catalogo2;
    }

    public void setCatalogo2(Catalogo catalogo2) {
        this.catalogo2 = catalogo2;
    }

    public Catalogo getCatalogo3() {
        return catalogo3;
    }

    public void setCatalogo3(Catalogo catalogo3) {
        this.catalogo3 = catalogo3;
    }

    public Catalogo getCatalogo4() {
        return catalogo4;
    }

    public void setCatalogo4(Catalogo catalogo4) {
        this.catalogo4 = catalogo4;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
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
        return "inecolprime.pojos.Tesis[ idtesis=" + idtesis + " ]";
    }
    
}
