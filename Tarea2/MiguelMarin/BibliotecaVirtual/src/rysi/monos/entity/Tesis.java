/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.monos.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author miguel
 */
@Entity
@Table(name = "TESIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tesis.findAll", query = "SELECT t FROM Tesis t")})
public class Tesis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDTESIS")
    private Integer idtesis;
    @Basic(optional = false)
    @Column(name = "TITULO")
    private String titulo;
    @Basic(optional = false)
    @Column(name = "AUTOR_TESIS")
    private String autorTesis;
    @Column(name = "GRADO_OBTENIDO")
    private Integer gradoObtenido;
    @Basic(optional = false)
    @Column(name = "ANIO_TITULACION")
    private long anioTitulacion;
    @Basic(optional = false)
    @Column(name = "DIRECTOR_TESIS")
    private String directorTesis;
    @Basic(optional = false)
    @Column(name = "CONDICION_SITIO")
    private String condicionSitio;
    @Basic(optional = false)
    @Column(name = "IDESTADO")
    private int idestado;
    @Basic(optional = false)
    @Column(name = "ARCHIVO_TESIS")
    private String archivoTesis;
    @Basic(optional = false)
    @Column(name = "ESTATUS")
    private int estatus;
    @Basic(optional = false)
    @Column(name = "FECHA_REG")
    @Temporal(TemporalType.DATE)
    private Date fechaReg;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tesis")
//    private List<Calificacion> calificacionList;
    @JoinColumn(name = "IDDISCIPLINA", referencedColumnName = "IDDISCIPLINA")
    @ManyToOne(optional = false)
    private Disciplina disciplina;
    @JoinColumn(name = "IDINSTITUCION_ADSCRIPCION", referencedColumnName = "IDISTITUCION_ADSCRIPCION")
    @ManyToOne(optional = true)
    private InstitucionAdscripcion institucionAdscripcion;
   @JoinColumn(name = "IDSUBDISCIPLINA", referencedColumnName = "IDSUBDISCIPLINA")
   @ManyToOne(optional = false)
    private Subdisciplina subdisciplina;
//    @OneToMany(mappedBy = "tesis")
//    private List<Bitacora> bitacoraList;
//    @OneToMany(mappedBy = "tesis")
//    private List<Comentario> comentarioList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tesis")
//    private List<MaterialAdicional> materialAdicionalList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tesis")
//    private List<EspecieTesis> especieTesisList;

    public Tesis() {
    }

    public Tesis(Integer idtesis) {
        this.idtesis = idtesis;
    }

    public Tesis(Integer idtesis, String titulo, String autorTesis, long anioTitulacion, String directorTesis, String condicionSitio, int idestado, String archivoTesis, int estatus, Date fechaReg) {
        this.idtesis = idtesis;
        this.titulo = titulo;
        this.autorTesis = autorTesis;
        this.anioTitulacion = anioTitulacion;
        this.directorTesis = directorTesis;
        this.condicionSitio = condicionSitio;
        this.idestado = idestado;
        this.archivoTesis = archivoTesis;
        this.estatus = estatus;
        this.fechaReg = fechaReg;
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

    public String getAutorTesis() {
        return autorTesis;
    }

    public void setAutorTesis(String autorTesis) {
        this.autorTesis = autorTesis;
    }

    public Integer getGradoObtenido() {
        return gradoObtenido;
    }

    public void setGradoObtenido(Integer gradoObtenido) {
        this.gradoObtenido = gradoObtenido;
    }

    public long getAnioTitulacion() {
        return anioTitulacion;
    }

    public void setAnioTitulacion(long anioTitulacion) {
        this.anioTitulacion = anioTitulacion;
    }

    public String getDirectorTesis() {
        return directorTesis;
    }

    public void setDirectorTesis(String directorTesis) {
        this.directorTesis = directorTesis;
    }

    public String getCondicionSitio() {
        return condicionSitio;
    }

    public void setCondicionSitio(String condicionSitio) {
        this.condicionSitio = condicionSitio;
    }

    public int getIdestado() {
        return idestado;
    }

    public void setIdestado(int idestado) {
        this.idestado = idestado;
    }

    public String getArchivoTesis() {
        return archivoTesis;
    }

    public void setArchivoTesis(String archivoTesis) {
        this.archivoTesis = archivoTesis;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

//    @XmlTransient
//    public List<Calificacion> getCalificacionList() {
//        return calificacionList;
//    }
//
//    public void setCalificacionList(List<Calificacion> calificacionList) {
//        this.calificacionList = calificacionList;
//    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public InstitucionAdscripcion getInstitucionAdscripcion() {
        return institucionAdscripcion;
    }

    public void setInstitucionAdscripcion(InstitucionAdscripcion institucionAdscripcion) {
        this.institucionAdscripcion = institucionAdscripcion;
    }

    public Subdisciplina getSubdisciplina() {
        return subdisciplina;
    }

    public void setSubdisciplina(Subdisciplina subdisciplina) {
        this.subdisciplina = subdisciplina;
    }

//    @XmlTransient
//    public List<Bitacora> getBitacoraList() {
//        return bitacoraList;
//    }
//
//    public void setBitacoraList(List<Bitacora> bitacoraList) {
//        this.bitacoraList = bitacoraList;
//    }
//
//    @XmlTransient
//    public List<Comentario> getComentarioList() {
//        return comentarioList;
//    }
//
//    public void setComentarioList(List<Comentario> comentarioList) {
//        this.comentarioList = comentarioList;
//    }
//
//    @XmlTransient
//    public List<MaterialAdicional> getMaterialAdicionalList() {
//        return materialAdicionalList;
//    }
//
//    public void setMaterialAdicionalList(List<MaterialAdicional> materialAdicionalList) {
//        this.materialAdicionalList = materialAdicionalList;
//    }
//
//    @XmlTransient
//    public List<EspecieTesis> getEspecieTesisList() {
//        return especieTesisList;
//    }
//
//    public void setEspecieTesisList(List<EspecieTesis> especieTesisList) {
//        this.especieTesisList = especieTesisList;
//    }

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
        return "rysi.monos.entity.Tesis[ idtesis=" + idtesis + " ]";
    }
    
}
