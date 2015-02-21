/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.mx.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Subli
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
    @Column(name = "TITULO")
    private String titulo;
    @Column(name = "ANIO")
    private Integer anio;
    @Column(name = "CONDICIONES")
    private String condiciones;
    @OneToMany(mappedBy = "idtesis")
    private List<Documentomultimedia> documentomultimediaList;
    @OneToMany(mappedBy = "idtesis")
    private List<Contadorvisitas> contadorvisitasList;
    @OneToMany(mappedBy = "idtesis")
    private List<Comentario> comentarioList;
    @OneToMany(mappedBy = "idtesis")
    private List<Calificacion> calificacionList;
    @JoinColumn(name = "IDSUBDISCIPLINA", referencedColumnName = "IDSUBDISCIPLINA")
    @ManyToOne
    private Subdisciplina idsubdisciplina;
    @JoinColumn(name = "IDPAIS", referencedColumnName = "IDPAIS")
    @ManyToOne
    private Pais idpais;
    @JoinColumn(name = "IDINSTITUCION", referencedColumnName = "IDINSTITUCION")
    @ManyToOne
    private Institucion idinstitucion;
    @JoinColumn(name = "IDGRADOACADEMICO", referencedColumnName = "IDGRADOACADEMICO")
    @ManyToOne
    private Gradoacademico idgradoacademico;
    @JoinColumn(name = "IDESPECIE", referencedColumnName = "IDESPECIE")
    @ManyToOne
    private Especie idespecie;
    @JoinColumn(name = "IDENTIDADFEDERATIVA", referencedColumnName = "IDENTIDADFEDERATIVA")
    @ManyToOne
    private Entidadfederativa identidadfederativa;
    @JoinColumn(name = "IDDISCIPLINA", referencedColumnName = "IDDISCIPLINA")
    @ManyToOne
    private Disciplina iddisciplina;
    @JoinColumn(name = "IDDIRECTOR", referencedColumnName = "IDDIRECTOR")
    @ManyToOne
    private Director iddirector;

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

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }

    public List<Documentomultimedia> getDocumentomultimediaList() {
        return documentomultimediaList;
    }

    public void setDocumentomultimediaList(List<Documentomultimedia> documentomultimediaList) {
        this.documentomultimediaList = documentomultimediaList;
    }

    public List<Contadorvisitas> getContadorvisitasList() {
        return contadorvisitasList;
    }

    public void setContadorvisitasList(List<Contadorvisitas> contadorvisitasList) {
        this.contadorvisitasList = contadorvisitasList;
    }

    public List<Comentario> getComentarioList() {
        return comentarioList;
    }

    public void setComentarioList(List<Comentario> comentarioList) {
        this.comentarioList = comentarioList;
    }

    public List<Calificacion> getCalificacionList() {
        return calificacionList;
    }

    public void setCalificacionList(List<Calificacion> calificacionList) {
        this.calificacionList = calificacionList;
    }

    public Subdisciplina getIdsubdisciplina() {
        return idsubdisciplina;
    }

    public void setIdsubdisciplina(Subdisciplina idsubdisciplina) {
        this.idsubdisciplina = idsubdisciplina;
    }

    public Pais getIdpais() {
        return idpais;
    }

    public void setIdpais(Pais idpais) {
        this.idpais = idpais;
    }

    public Institucion getIdinstitucion() {
        return idinstitucion;
    }

    public void setIdinstitucion(Institucion idinstitucion) {
        this.idinstitucion = idinstitucion;
    }

    public Gradoacademico getIdgradoacademico() {
        return idgradoacademico;
    }

    public void setIdgradoacademico(Gradoacademico idgradoacademico) {
        this.idgradoacademico = idgradoacademico;
    }

    public Especie getIdespecie() {
        return idespecie;
    }

    public void setIdespecie(Especie idespecie) {
        this.idespecie = idespecie;
    }

    public Entidadfederativa getIdentidadfederativa() {
        return identidadfederativa;
    }

    public void setIdentidadfederativa(Entidadfederativa identidadfederativa) {
        this.identidadfederativa = identidadfederativa;
    }

    public Disciplina getIddisciplina() {
        return iddisciplina;
    }

    public void setIddisciplina(Disciplina iddisciplina) {
        this.iddisciplina = iddisciplina;
    }

    public Director getIddirector() {
        return iddirector;
    }

    public void setIddirector(Director iddirector) {
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
        return "rgomez.mx.entidades.Tesis[ idtesis=" + idtesis + " ]";
    }
    
}
