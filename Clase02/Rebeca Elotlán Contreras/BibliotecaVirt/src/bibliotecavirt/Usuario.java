/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecavirt;

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
 * @author REBECA
 */
@Entity
@Table(name = "USUARIO")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_USUARIO")
    private String idUsuario;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "PAIS")
    private String pais;
    @Basic(optional = false)
    @Column(name = "CORREOELEC")
    private String correoelec;
    @Basic(optional = false)
    @Column(name = "FACEBOOK")
    private String facebook;
    @Basic(optional = false)
    @Column(name = "ROL")
    private String rol;

    public Usuario() {
    }

    public Usuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(String idUsuario, String nombre, String pais, String correoelec, String facebook, String rol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.pais = pais;
        this.correoelec = correoelec;
        this.facebook = facebook;
        this.rol = rol;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCorreoelec() {
        return correoelec;
    }

    public void setCorreoelec(String correoelec) {
        this.correoelec = correoelec;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bibliotecavirt.Usuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
