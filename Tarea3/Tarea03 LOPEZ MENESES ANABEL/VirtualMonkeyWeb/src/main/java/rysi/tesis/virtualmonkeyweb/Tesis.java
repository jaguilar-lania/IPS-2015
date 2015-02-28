/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis.virtualmonkeyweb;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Anny
 */
@Entity
@Table(name = "TESIS")
@NamedQueries({
    @NamedQuery(name = "Tesis.findAll", query = "SELECT t FROM Tesis t")})
public class Tesis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "A\u00d1O")
    private Integer año;
    @Size(max = 200)
    @Column(name = "ARCHIVO")
    private String archivo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDAUTOR")
    private int idautor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCONDICIONSITIO")
    private int idcondicionsitio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDIRECTORTESIS")
    private int iddirectortesis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDESPECIEPRIMATE")
    private int idespecieprimate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDESTADO")
    private int idestado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGRADOOBTENIDO")
    private int idgradoobtenido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDINSTITUCION")
    private int idinstitucion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSUBDISCIPLINA")
    private int idsubdisciplina;
    @Size(max = 500)
    @Column(name = "TITULO")
    private String titulo;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;

    public Tesis() {
    }

    public Tesis(Integer id) {
        this.id = id;
    }

    public Tesis(Integer id, int idautor, int idcondicionsitio, int iddirectortesis, int idespecieprimate, int idestado, int idgradoobtenido, int idinstitucion, int idsubdisciplina) {
        this.id = id;
        this.idautor = idautor;
        this.idcondicionsitio = idcondicionsitio;
        this.iddirectortesis = iddirectortesis;
        this.idespecieprimate = idespecieprimate;
        this.idestado = idestado;
        this.idgradoobtenido = idgradoobtenido;
        this.idinstitucion = idinstitucion;
        this.idsubdisciplina = idsubdisciplina;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public int getIdautor() {
        return idautor;
    }

    public void setIdautor(int idautor) {
        this.idautor = idautor;
    }

    public int getIdcondicionsitio() {
        return idcondicionsitio;
    }

    public void setIdcondicionsitio(int idcondicionsitio) {
        this.idcondicionsitio = idcondicionsitio;
    }

    public int getIddirectortesis() {
        return iddirectortesis;
    }

    public void setIddirectortesis(int iddirectortesis) {
        this.iddirectortesis = iddirectortesis;
    }

    public int getIdespecieprimate() {
        return idespecieprimate;
    }

    public void setIdespecieprimate(int idespecieprimate) {
        this.idespecieprimate = idespecieprimate;
    }

    public int getIdestado() {
        return idestado;
    }

    public void setIdestado(int idestado) {
        this.idestado = idestado;
    }

    public int getIdgradoobtenido() {
        return idgradoobtenido;
    }

    public void setIdgradoobtenido(int idgradoobtenido) {
        this.idgradoobtenido = idgradoobtenido;
    }

    public int getIdinstitucion() {
        return idinstitucion;
    }

    public void setIdinstitucion(int idinstitucion) {
        this.idinstitucion = idinstitucion;
    }

    public int getIdsubdisciplina() {
        return idsubdisciplina;
    }

    public void setIdsubdisciplina(int idsubdisciplina) {
        this.idsubdisciplina = idsubdisciplina;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tesis)) {
            return false;
        }
        Tesis other = (Tesis) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.tesis.virtualmonkeyweb.Tesis[ id=" + id + " ]";
    }
    
}
