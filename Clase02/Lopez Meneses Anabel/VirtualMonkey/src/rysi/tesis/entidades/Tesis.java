/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

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
    @Column(name = "ARCHIVO")
    private String archivo;
    @Column(name = "IDAUTOR")
    private Integer idautor;
    @Column(name = "IDCONDICIONSITIO")
    private Integer idcondicionsitio;
    @Column(name = "IDDIRECTORTESIS")
    private Integer iddirectortesis;
    @Column(name = "IDESPECIEPRIMATE")
    private Integer idespecieprimate;
    @Column(name = "IDESTADO")
    private Integer idestado;
    @Column(name = "IDGRADOOBTENIDO")
    private Integer idgradoobtenido;
    @Column(name = "IDINSTITUCION")
    private Integer idinstitucion;
    @Column(name = "IDSUBDISCIPLINA")
    private Integer idsubdisciplina;
    @Column(name = "TITULO")
    private String titulo;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;

    public Tesis() {
    }

    public Tesis(Integer id) {
        this.id = id;
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

    public Integer getIdautor() {
        return idautor;
    }

    public void setIdautor(Integer idautor) {
        this.idautor = idautor;
    }

    public Integer getIdcondicionsitio() {
        return idcondicionsitio;
    }

    public void setIdcondicionsitio(Integer idcondicionsitio) {
        this.idcondicionsitio = idcondicionsitio;
    }

    public Integer getIddirectortesis() {
        return iddirectortesis;
    }

    public void setIddirectortesis(Integer iddirectortesis) {
        this.iddirectortesis = iddirectortesis;
    }

    public Integer getIdespecieprimate() {
        return idespecieprimate;
    }

    public void setIdespecieprimate(Integer idespecieprimate) {
        this.idespecieprimate = idespecieprimate;
    }

    public Integer getIdestado() {
        return idestado;
    }

    public void setIdestado(Integer idestado) {
        this.idestado = idestado;
    }

    public Integer getIdgradoobtenido() {
        return idgradoobtenido;
    }

    public void setIdgradoobtenido(Integer idgradoobtenido) {
        this.idgradoobtenido = idgradoobtenido;
    }

    public Integer getIdinstitucion() {
        return idinstitucion;
    }

    public void setIdinstitucion(Integer idinstitucion) {
        this.idinstitucion = idinstitucion;
    }

    public Integer getIdsubdisciplina() {
        return idsubdisciplina;
    }

    public void setIdsubdisciplina(Integer idsubdisciplina) {
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
        return "rysi.tesis.entidades.Tesis[ id=" + id + " ]";
    }
    
}
