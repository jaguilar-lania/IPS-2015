/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.articulos.inecolprimemaven;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
    @NotNull
    @Column(name = "IDTESIS")
    private Integer idtesis;
    
    @Size(max = 100)
    @Column(name = "TITULO")
    private String titulo;
    
    @Column(name = "ANIO")
    private Integer anio;
    
    @Size(max = 50)
    @Column(name = "CONDICIONES")
    private String condiciones;
    
    @OneToMany(mappedBy = "idtesis")
    private List<DocumentoMultimedia> documentoMultimediaList;
    
    @OneToMany(mappedBy = "idtesis")
    private List<ContadorVisitas> contadorVisitasList;
    
    @OneToMany(mappedBy = "idtesis")
    private List<Comentario> comentarioList;
    
    @OneToMany(mappedBy = "idtesis")
    private List<Calificacion> calificacionList;
    
    @JoinColumn(name = "IDSUBDISCIPLINA", referencedColumnName = "IDSUBDISCIPLINA")
    @ManyToOne
    private Integer idsubdisciplina;
    
    @JoinColumn(name = "IDPAIS", referencedColumnName = "IDPAIS")
    @ManyToOne
    private Integer idpais;
    
    @JoinColumn(name = "IDINSTITUCION", referencedColumnName = "IDINSTITUCION")
    @ManyToOne
    private Integer idinstitucion;
    
    @JoinColumn(name = "IDGRADOACADEMICO", referencedColumnName = "IDGRADOACADEMICO")
    @ManyToOne
    private Integer idgradoacademico;
    
    @JoinColumn(name = "IDESPECIE", referencedColumnName = "IDESPECIE")
    @ManyToOne
    private Integer idespecie;
    
    @JoinColumn(name = "IDENTIDADFEDERATIVA", referencedColumnName = "IDENTIDADFEDERATIVA")
    @ManyToOne
    private Integer identidadfederativa;
    
    @JoinColumn(name = "IDDISCIPLINA", referencedColumnName = "IDDISCIPLINA")
    @ManyToOne
    private Integer iddisciplina;
    
    @JoinColumn(name = "IDDIRECTOR", referencedColumnName = "IDDIRECTOR")
    @ManyToOne
    private Integer iddirector;

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

    public List<DocumentoMultimedia> getDocumentoMultimediaList() {
        return documentoMultimediaList;
    }

    public void setDocumentoMultimediaList(List<DocumentoMultimedia> documentoMultimediaList) {
        this.documentoMultimediaList = documentoMultimediaList;
    }

    public List<ContadorVisitas> getContadorVisitasList() {
        return contadorVisitasList;
    }

    public void setContadorVisitasList(List<ContadorVisitas> contadorVisitasList) {
        this.contadorVisitasList = contadorVisitasList;
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

    public Integer getIdsubdisciplina() {
        return idsubdisciplina;
    }

    public void setIdsubdisciplina(Integer idsubdisciplina) {
        this.idsubdisciplina = idsubdisciplina;
    }

    public Integer getIdpais() {
        return idpais;
    }

    public void setIdpais(Integer idpais) {
        this.idpais = idpais;
    }

    public Integer getIdinstitucion() {
        return idinstitucion;
    }

    public void setIdinstitucion(Integer idinstitucion) {
        this.idinstitucion = idinstitucion;
    }

    public Integer getIdgradoacademico() {
        return idgradoacademico;
    }

    public void setIdgradoacademico(Integer idgradoacademico) {
        this.idgradoacademico = idgradoacademico;
    }

    public Integer getIdespecie() {
        return idespecie;
    }

    public void setIdespecie(Integer idespecie) {
        this.idespecie = idespecie;
    }

    public Integer getIdentidadfederativa() {
        return identidadfederativa;
    }

    public void setIdentidadfederativa(Integer identidadfederativa) {
        this.identidadfederativa = identidadfederativa;
    }

    public Integer getIddisciplina() {
        return iddisciplina;
    }

    public void setIddisciplina(Integer iddisciplina) {
        this.iddisciplina = iddisciplina;
    }

    public Integer getIddirector() {
        return iddirector;
    }

    public void setIddirector(Integer iddirector) {
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
        return "rgomez.articulos.inecolprimemaven.Tesis[ idtesis=" + idtesis + " ]";
    }
    
}
