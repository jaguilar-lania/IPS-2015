/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inecolprime.pojos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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

/**
 *
 * @author Frost
 */
@Entity
@Table(name = "MENU")
@NamedQueries({
    @NamedQuery(name = "Menu.findAll", query = "SELECT m FROM Menu m")})
public class Menu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDMENU")
    private Integer idmenu;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "ORDEN")
    private Integer orden;
    @Column(name = "ENLACE")
    private String enlace;
    @Column(name = "IDMENUCONTENEDOR")
    private Integer idmenucontenedor;
    @Column(name = "IDTIPO")
    private Integer idtipo;
    

    public Menu() {
    }

    public Menu(Integer idmenu) {
        this.idmenu = idmenu;
    }

    public Integer getIdmenu() {
        return idmenu;
    }

    public void setIdmenu(Integer idmenu) {
        this.idmenu = idmenu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmenu != null ? idmenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.idmenu == null && other.idmenu != null) || (this.idmenu != null && !this.idmenu.equals(other.idmenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inecolprime.pojos.Menu[ idmenu=" + idmenu + " ]";
    }

    /**
     * @return the idmenucontenedor
     */
    public Integer getIdmenucontenedor() {
        return idmenucontenedor;
    }

    /**
     * @param idmenucontenedor the idmenucontenedor to set
     */
    public void setIdmenucontenedor(Integer idmenucontenedor) {
        this.idmenucontenedor = idmenucontenedor;
    }

    /**
     * @return the idtipo
     */
    public Integer getIdtipo() {
        return idtipo;
    }

    /**
     * @param idtipo the idtipo to set
     */
    public void setIdtipo(Integer idtipo) {
        this.idtipo = idtipo;
    }
    
}
