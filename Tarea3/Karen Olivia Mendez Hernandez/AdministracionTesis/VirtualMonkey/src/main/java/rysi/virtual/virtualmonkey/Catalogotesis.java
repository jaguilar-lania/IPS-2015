/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.virtual.virtualmonkey;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "CATALOGOTESIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Catalogotesis.findAll", query = "SELECT c FROM Catalogotesis c"),
    @NamedQuery(name = "Catalogotesis.findByIdtesis", query = "SELECT c FROM Catalogotesis c WHERE c.idtesis = :idtesis"),
    @NamedQuery(name = "Catalogotesis.findByTitulo", query = "SELECT c FROM Catalogotesis c WHERE c.titulo = :titulo"),
    @NamedQuery(name = "Catalogotesis.findByAutor", query = "SELECT c FROM Catalogotesis c WHERE c.autor = :autor"),
    @NamedQuery(name = "Catalogotesis.findByDisciplina", query = "SELECT c FROM Catalogotesis c WHERE c.disciplina = :disciplina"),
    @NamedQuery(name = "Catalogotesis.findByEspecie", query = "SELECT c FROM Catalogotesis c WHERE c.especie = :especie"),
    @NamedQuery(name = "Catalogotesis.findBySubdisciplina", query = "SELECT c FROM Catalogotesis c WHERE c.subdisciplina = :subdisciplina")})
public class Catalogotesis implements Serializable {
    @Lob
    @Column(name = "ARCHIVO")
    private Serializable archivo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "GRADO")
    private String grado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ANIO")
    private String anio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "INSTITUCION")
    private String institucion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DIRECTOR")
    private String director;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "CONDICION")
    private String condicion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ESTADO")
    private String estado;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDTESIS")
    private Integer idtesis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "TITULO")
    private String titulo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "AUTOR")
    private String autor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "DISCIPLINA")
    private String disciplina;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ESPECIE")
    private String especie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
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
        return "rysi.articulos.articulosweb.Catalogotesis[ idtesis=" + idtesis + " ]";
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Serializable getArchivo() {
        return archivo;
    }

    public void setArchivo(Serializable archivo) {
        this.archivo = archivo;
    }
    
}
