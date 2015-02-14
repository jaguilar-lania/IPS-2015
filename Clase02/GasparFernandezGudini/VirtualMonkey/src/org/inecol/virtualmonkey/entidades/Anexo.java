/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inecol.virtualmonkey.entidades;

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

/**
 *
 * @author Gudini
 */
@Entity
@Table(name = "ANEXOS")
@NamedQueries({
    @NamedQuery(name = "Anexo.findAll", query = "SELECT a FROM Anexo a")})
public class Anexo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ANEXO")
    private Integer idAnexo;
    @Column(name = "NOMBRE_ARCHIVO")
    private String nombreArchivo;
    @Column(name = "TIPO_DE_ARCHIVO")
    private String tipoDeArchivo;
    @Column(name = "URL")
    private String url;

    public Anexo() {
    }

    public Anexo(Integer idAnexo) {
        this.idAnexo = idAnexo;
    }

    public Integer getIdAnexo() {
        return idAnexo;
    }

    public void setIdAnexo(Integer idAnexo) {
        this.idAnexo = idAnexo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getTipoDeArchivo() {
        return tipoDeArchivo;
    }

    public void setTipoDeArchivo(String tipoDeArchivo) {
        this.tipoDeArchivo = tipoDeArchivo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAnexo != null ? idAnexo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Anexo)) {
            return false;
        }
        Anexo other = (Anexo) object;
        if ((this.idAnexo == null && other.idAnexo != null) || (this.idAnexo != null && !this.idAnexo.equals(other.idAnexo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.inecol.virtualmonkey.entidades.Anexo[ idAnexo=" + idAnexo + " ]";
    }
    
}
