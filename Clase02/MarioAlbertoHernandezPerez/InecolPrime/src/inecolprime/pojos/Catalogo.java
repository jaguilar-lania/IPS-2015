/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inecolprime.pojos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "CATALOGO")
@NamedQueries({
    @NamedQuery(name = "Catalogo.findAll", query = "SELECT c FROM Catalogo c")})
public class Catalogo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDCATALOGO")
    private Integer idcatalogo;
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(mappedBy = "catalogo")
    private List<Autor> autorList;
    @OneToMany(mappedBy = "catalogo1")
    private List<Autor> autorList1;
    @OneToMany(mappedBy = "catalogo2")
    private List<Autor> autorList2;
    @OneToMany(mappedBy = "catalogo")
    private List<Director> directorList;
    @OneToMany(mappedBy = "catalogo1")
    private List<Director> directorList1;
    @OneToMany(mappedBy = "catalogo2")
    private List<Director> directorList2;
    @OneToMany(mappedBy = "catalogo")
    private List<Catalogo> catalogoList;
    @JoinColumn(name = "IDCATEGORIA", referencedColumnName = "IDCATALOGO")
    @ManyToOne
    private Catalogo catalogo;
    @OneToMany(mappedBy = "catalogo")
    private List<Menu> menuList;
    @OneToMany(mappedBy = "catalogo")
    private List<Parametro> parametroList;
    @OneToMany(mappedBy = "catalogo")
    private List<Tesis> tesisList;
    @OneToMany(mappedBy = "catalogo1")
    private List<Tesis> tesisList1;
    @OneToMany(mappedBy = "catalogo2")
    private List<Tesis> tesisList2;
    @OneToMany(mappedBy = "catalogo3")
    private List<Tesis> tesisList3;
    @OneToMany(mappedBy = "catalogo4")
    private List<Tesis> tesisList4;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catalogo")
    private List<Rol> rolList;

    public Catalogo() {
    }

    public Catalogo(Integer idcatalogo) {
        this.idcatalogo = idcatalogo;
    }

    public Integer getIdcatalogo() {
        return idcatalogo;
    }

    public void setIdcatalogo(Integer idcatalogo) {
        this.idcatalogo = idcatalogo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Autor> getAutorList() {
        return autorList;
    }

    public void setAutorList(List<Autor> autorList) {
        this.autorList = autorList;
    }

    public List<Autor> getAutorList1() {
        return autorList1;
    }

    public void setAutorList1(List<Autor> autorList1) {
        this.autorList1 = autorList1;
    }

    public List<Autor> getAutorList2() {
        return autorList2;
    }

    public void setAutorList2(List<Autor> autorList2) {
        this.autorList2 = autorList2;
    }

    public List<Director> getDirectorList() {
        return directorList;
    }

    public void setDirectorList(List<Director> directorList) {
        this.directorList = directorList;
    }

    public List<Director> getDirectorList1() {
        return directorList1;
    }

    public void setDirectorList1(List<Director> directorList1) {
        this.directorList1 = directorList1;
    }

    public List<Director> getDirectorList2() {
        return directorList2;
    }

    public void setDirectorList2(List<Director> directorList2) {
        this.directorList2 = directorList2;
    }

    public List<Catalogo> getCatalogoList() {
        return catalogoList;
    }

    public void setCatalogoList(List<Catalogo> catalogoList) {
        this.catalogoList = catalogoList;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public List<Parametro> getParametroList() {
        return parametroList;
    }

    public void setParametroList(List<Parametro> parametroList) {
        this.parametroList = parametroList;
    }

    public List<Tesis> getTesisList() {
        return tesisList;
    }

    public void setTesisList(List<Tesis> tesisList) {
        this.tesisList = tesisList;
    }

    public List<Tesis> getTesisList1() {
        return tesisList1;
    }

    public void setTesisList1(List<Tesis> tesisList1) {
        this.tesisList1 = tesisList1;
    }

    public List<Tesis> getTesisList2() {
        return tesisList2;
    }

    public void setTesisList2(List<Tesis> tesisList2) {
        this.tesisList2 = tesisList2;
    }

    public List<Tesis> getTesisList3() {
        return tesisList3;
    }

    public void setTesisList3(List<Tesis> tesisList3) {
        this.tesisList3 = tesisList3;
    }

    public List<Tesis> getTesisList4() {
        return tesisList4;
    }

    public void setTesisList4(List<Tesis> tesisList4) {
        this.tesisList4 = tesisList4;
    }

    public List<Rol> getRolList() {
        return rolList;
    }

    public void setRolList(List<Rol> rolList) {
        this.rolList = rolList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcatalogo != null ? idcatalogo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catalogo)) {
            return false;
        }
        Catalogo other = (Catalogo) object;
        if ((this.idcatalogo == null && other.idcatalogo != null) || (this.idcatalogo != null && !this.idcatalogo.equals(other.idcatalogo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inecolprime.pojos.Catalogo[ idcatalogo=" + idcatalogo + " ]";
    }
    
}
