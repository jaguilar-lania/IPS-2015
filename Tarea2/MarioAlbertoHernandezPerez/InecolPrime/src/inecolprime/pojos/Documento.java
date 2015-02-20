/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inecolprime.pojos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Frost
 */
@Entity
@Table(name = "DOCUMENTO")
@NamedQueries({
    @NamedQuery(name = "Documento.findAll", query = "SELECT d FROM Documento d")})
public class Documento implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DocumentoPK documentoPK;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "URL")
    private String url;
    @JoinColumn(name = "IDTIPODOCUMENTO", referencedColumnName = "IDTIPODOCUMENTO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Tipodocumento tipodocumento;
    @JoinColumn(name = "IDTESIS", referencedColumnName = "IDTESIS", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Tesis tesis;

    public Documento() {
    }

    public Documento(DocumentoPK documentoPK) {
        this.documentoPK = documentoPK;
    }

    public Documento(int idtesis, int idtipodocumento) {
        this.documentoPK = new DocumentoPK(idtesis, idtipodocumento);
    }

    public DocumentoPK getDocumentoPK() {
        return documentoPK;
    }

    public void setDocumentoPK(DocumentoPK documentoPK) {
        this.documentoPK = documentoPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Tipodocumento getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(Tipodocumento tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public Tesis getTesis() {
        return tesis;
    }

    public void setTesis(Tesis tesis) {
        this.tesis = tesis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (documentoPK != null ? documentoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Documento)) {
            return false;
        }
        Documento other = (Documento) object;
        if ((this.documentoPK == null && other.documentoPK != null) || (this.documentoPK != null && !this.documentoPK.equals(other.documentoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inecolprime.pojos.Documento[ documentoPK=" + documentoPK + " ]";
    }
    
}
