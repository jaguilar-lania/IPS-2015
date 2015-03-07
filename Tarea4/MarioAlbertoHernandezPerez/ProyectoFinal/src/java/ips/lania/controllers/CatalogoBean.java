/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ips.lania.controllers;

import ips.lania.dao.CatalogoDAO;
import ips.lania.entity.Catalogo;
import ips.lania.utils.JSFUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author Frost
 */
@ManagedBean(name="catalogoBean")
@SessionScoped
public class CatalogoBean {
    private boolean newrow;
    private int defaultview;
    private Catalogo catalogo;
    private Catalogo filtro_cat;
    private List<Catalogo> listCatalogos;
    private List<SelectItem> listCategoriasCatalogo;
    
    @PostConstruct
    public void init(){
        listCatalogos = new CatalogoDAO().getElementsByFilter(filtro_cat);
        filtro_cat = new Catalogo();
    }
    //--------------------------------------------------------------------//
    public String cleanFilters(){
        filtro_cat = new Catalogo();
        return "crudCatalogos";
    }
    
    public String executeSearch(){
        listCatalogos = new CatalogoDAO().getElementsByFilter(filtro_cat);
        return "crudCatalogos";
    }
    //--------------------------------------------------------------------//
    public String initNew() {
        newrow = true;
        defaultview = 1;
        catalogo = new Catalogo();
        return "crudCatalogos";
    }
    
    public String initEdit(){
        newrow = false;
        if(this.catalogo!=null){
            defaultview = 1;
        }else{
            JSFUtils.showGlowMessage("Error", "Selecciona un elemento de la tabla");
        }
        return "crudCatalogos";
    }
    
    public String initDelete(){
        if(this.catalogo!=null && this.catalogo.getIdcatalogo()!=null){
            if(new CatalogoDAO().delete(catalogo)){
                listCatalogos = new CatalogoDAO().getElementsByFilter(filtro_cat);
                refreshListCategorias();
                JSFUtils.showGlowMessage("Confirmación", "Catálogo eliminado");
            }else{
                JSFUtils.showGlowMessage("Error", "No se puede eliminar el catálogo seleccionado");
            }
        }else{
            JSFUtils.showGlowMessage("Error", "Selecciona un elemento de la tabla");
        }
        return "crudCatalogos";
    }
    
    
    public String save(){
        defaultview = 0;
        if(newrow){
            if(new CatalogoDAO().create(catalogo)){
                listCatalogos = new CatalogoDAO().getElementsByFilter(filtro_cat);
                refreshListCategorias();
                JSFUtils.showGlowMessage("Confirmación", "Catálogo guardado correctamente");
            }
        }else{
            if(new CatalogoDAO().update(catalogo)){
                listCatalogos = new CatalogoDAO().getElementsByFilter(filtro_cat);
                refreshListCategorias();
                JSFUtils.showGlowMessage("Confirmación", "Catálogo actualizado correctamente");
            }
        }
        return "crudCatalogos";
    }
    
    public String cancel(){
        defaultview = 0;
        return "crudCatalogos";
    }
    
    private void refreshListCategorias(){
        listCategoriasCatalogo = new ArrayList<SelectItem>();
        List<Catalogo> result = new CatalogoDAO().getCategorias();
        for(Catalogo c:result){
            listCategoriasCatalogo.add(new SelectItem(c.getIdcatalogo(),c.getNombre()));
        }
    }
    //--------------------------------------------------------------------//
    
    public List<Catalogo> getListCatalogos() {
        return listCatalogos;
    }

    public void setListCatalogos(List<Catalogo> listCatalogos) {
        this.listCatalogos = listCatalogos;
    }

    public List<SelectItem> getListCategoriasCatalogo() {
        if(listCategoriasCatalogo==null){
            this.refreshListCategorias();
        }
        return listCategoriasCatalogo;
    }

    public void setListCategoriasCatalogo(List<SelectItem> listCategoriasCatalogo) {
        this.listCategoriasCatalogo = listCategoriasCatalogo;
    }

    public int getDefaultview() {
        return defaultview;
    }

    public void setDefaultview(int defaultview) {
        this.defaultview = defaultview;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public boolean isNewrow() {
        return newrow;
    }

    public void setNewrow(boolean newrow) {
        this.newrow = newrow;
    }

    public Catalogo getFiltro_cat() {
        return filtro_cat;
    }

    public void setFiltro_cat(Catalogo filtro_cat) {
        this.filtro_cat = filtro_cat;
    }
}
