/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.articulos.inecolprimefinal;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Subli
 */
@Entity
@Table(name = "PERMISO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Permiso.findAll", query = "SELECT p FROM Permiso p"),
    @NamedQuery(name = "Permiso.findByIdpermiso", query = "SELECT p FROM Permiso p WHERE p.idpermiso = :idpermiso"),
    @NamedQuery(name = "Permiso.findByNombre", query = "SELECT p FROM Permiso p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Permiso.findByCrear", query = "SELECT p FROM Permiso p WHERE p.crear = :crear"),
    @NamedQuery(name = "Permiso.findByEditar", query = "SELECT p FROM Permiso p WHERE p.editar = :editar"),
    @NamedQuery(name = "Permiso.findByEliminar", query = "SELECT p FROM Permiso p WHERE p.eliminar = :eliminar"),
    @NamedQuery(name = "Permiso.findByBuscar", query = "SELECT p FROM Permiso p WHERE p.buscar = :buscar")})
public class Permiso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPERMISO")
    private Integer idpermiso;
    @Size(max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "CREAR")
    private Integer crear;
    @Column(name = "EDITAR")
    private Integer editar;
    @Column(name = "ELIMINAR")
    private Integer eliminar;
    @Column(name = "BUSCAR")
    private Integer buscar;
    @OneToMany(mappedBy = "idpermiso")
    private List<Rol> rolList;

    public Permiso() {
    }

    public Permiso(Integer idpermiso) {
        this.idpermiso = idpermiso;
    }

    public Integer getIdpermiso() {
        return idpermiso;
    }

    public void setIdpermiso(Integer idpermiso) {
        this.idpermiso = idpermiso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCrear() {
        return crear;
    }

    public void setCrear(Integer crear) {
        this.crear = crear;
    }

    public Integer getEditar() {
        return editar;
    }

    public void setEditar(Integer editar) {
        this.editar = editar;
    }

    public Integer getEliminar() {
        return eliminar;
    }

    public void setEliminar(Integer eliminar) {
        this.eliminar = eliminar;
    }

    public Integer getBuscar() {
        return buscar;
    }

    public void setBuscar(Integer buscar) {
        this.buscar = buscar;
    }

    @XmlTransient
    public List<Rol> getRolList() {
        return rolList;
    }

    public void setRolList(List<Rol> rolList) {
        this.rolList = rolList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpermiso != null ? idpermiso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permiso)) {
            return false;
        }
        Permiso other = (Permiso) object;
        if ((this.idpermiso == null && other.idpermiso != null) || (this.idpermiso != null && !this.idpermiso.equals(other.idpermiso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rgomez.articulos.inecolprimefinal.Permiso[ idpermiso=" + idpermiso + " ]";
    }
    
}
