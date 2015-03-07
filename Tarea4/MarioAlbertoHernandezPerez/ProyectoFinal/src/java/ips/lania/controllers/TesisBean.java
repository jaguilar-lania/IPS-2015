/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ips.lania.controllers;

import ips.lania.dao.CatalogoDAO;
import ips.lania.dao.TesisDAO;
import ips.lania.entity.Catalogo;
import ips.lania.entity.Tesis;
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
@ManagedBean(name="tesisBean")
@SessionScoped
public class TesisBean {
    private boolean newrow;
    private int defaultview;
    private Tesis tesis;
    private Tesis filtro_tes;
    private List<Tesis> listTesis;
    private List<SelectItem> listCatalogo01;
    private List<SelectItem> listCatalogo02;
    private List<SelectItem> listCatalogo03;
    private List<SelectItem> listCatalogo04;
    private List<SelectItem> listCatalogo05;
    private List<SelectItem> listCatalogo06;
    private List<SelectItem> listCatalogo07;
    private List<SelectItem> listCatalogo08;
    private List<SelectItem> listCatalogo09;
    
    
    @PostConstruct
    public void init(){
        setListTesis(new TesisDAO().getElementsByFilter(getFiltro_tes()));
        setFiltro_tes(new Tesis());
        refreshListCatalogos();
    }
    //--------------------------------------------------------------------//
    public String cleanFilters(){
        setFiltro_tes(new Tesis());
        return "crudTesis";
    }
    
    public String executeSearch(){
        setListTesis(new TesisDAO().getElementsByFilter(getFiltro_tes()));
        return "crudTesis";
    }
    //--------------------------------------------------------------------//
    public String initNew() {
        setNewrow(true);
        setDefaultview(1);
        setTesis(new Tesis());
        return "crudTesis";
    }
    
    public String initEdit(){
        setNewrow(false);
        if(this.getTesis()!=null){
            setDefaultview(1);
        }else{
            JSFUtils.showGlowMessage("Error", "Selecciona un elemento de la tabla");
        }
        return "crudTesis";
    }
    
    public String initDelete(){
        if(this.getTesis()!=null && this.getTesis().getIdtesis()!=null){
            if(new TesisDAO().delete(getTesis())){
                setListTesis(new TesisDAO().getElementsByFilter(getFiltro_tes()));
                JSFUtils.showGlowMessage("Confirmación", "Tesis eliminada");
            }else{
                JSFUtils.showGlowMessage("Error", "No se puede eliminar la tesis seleccionado");
            }
        }else{
            JSFUtils.showGlowMessage("Error", "Selecciona un elemento de la tabla");
        }
        return "crudTesis";
    }
    
    
    public String save(){
        setDefaultview(0);
        if(isNewrow()){
            if(new TesisDAO().create(getTesis())){
                setListTesis(new TesisDAO().getElementsByFilter(getFiltro_tes()));
                JSFUtils.showGlowMessage("Confirmación", "Tesis guardada correctamente");
            }
        }else{
            if(new TesisDAO().update(getTesis())){
                setListTesis(new TesisDAO().getElementsByFilter(getFiltro_tes()));
                JSFUtils.showGlowMessage("Confirmación", "Tesis actualizada correctamente");
            }
        }
        return "crudTesis";
    }
    
    public String cancel(){
        setDefaultview(0);
        return "crudTesis";
    }
    
    private void refreshListCatalogos(){
        setListCatalogo01(new ArrayList<SelectItem>());
        setListCatalogo02(new ArrayList<SelectItem>());
        setListCatalogo03(new ArrayList<SelectItem>());
        setListCatalogo04(new ArrayList<SelectItem>());
        setListCatalogo05(new ArrayList<SelectItem>());
        setListCatalogo06(new ArrayList<SelectItem>());
        setListCatalogo07(new ArrayList<SelectItem>());
        setListCatalogo08(new ArrayList<SelectItem>());
        setListCatalogo09(new ArrayList<SelectItem>());
        
        CatalogoDAO catdao = new CatalogoDAO();
        List<Catalogo> result = null;
        result = catdao.getElementsByIdcategoria(1);
        for(Catalogo c:result){listCatalogo01.add(new SelectItem(c.getIdcatalogo(),c.getNombre()));}
        result = catdao.getElementsByIdcategoria(2);
        for(Catalogo c:result){listCatalogo02.add(new SelectItem(c.getIdcatalogo(),c.getNombre()));}
        result = catdao.getElementsByIdcategoria(3);
        for(Catalogo c:result){listCatalogo03.add(new SelectItem(c.getIdcatalogo(),c.getNombre()));}
        result = catdao.getElementsByIdcategoria(4);
        for(Catalogo c:result){listCatalogo04.add(new SelectItem(c.getIdcatalogo(),c.getNombre()));}
        result = catdao.getElementsByIdcategoria(5);
        for(Catalogo c:result){listCatalogo05.add(new SelectItem(c.getIdcatalogo(),c.getNombre()));}
        result = catdao.getElementsByIdcategoria(6);
        for(Catalogo c:result){listCatalogo06.add(new SelectItem(c.getIdcatalogo(),c.getNombre()));}
        result = catdao.getElementsByIdcategoria(7);
        for(Catalogo c:result){listCatalogo07.add(new SelectItem(c.getIdcatalogo(),c.getNombre()));}
        result = catdao.getElementsByIdcategoria(8);
        for(Catalogo c:result){listCatalogo08.add(new SelectItem(c.getIdcatalogo(),c.getNombre()));}
        result = catdao.getElementsByIdcategoria(9);
        for(Catalogo c:result){listCatalogo09.add(new SelectItem(c.getIdcatalogo(),c.getNombre()));}
    }
    //--------------------------------------------------------------------//
    
    public List<Tesis> getListTesiss() {
        return getListTesis();
    }

    public void setListTesiss(List<Tesis> listTesis) {
        this.setListTesis(listTesis);
    }

    public List<SelectItem> getListCategoriasTesis() {
        return getListCatalogo01();
    }

    public void setListCategoriasTesis(List<SelectItem> listCategoriasTesis) {
        this.setListCatalogo01(listCategoriasTesis);
    }

    public int getDefaultview() {
        return defaultview;
    }

    public void setDefaultview(int defaultview) {
        this.defaultview = defaultview;
    }

    public Tesis getTesis() {
        return tesis;
    }

    public void setTesis(Tesis tesis) {
        this.tesis = tesis;
    }

    public boolean isNewrow() {
        return newrow;
    }

    public void setNewrow(boolean newrow) {
        this.newrow = newrow;
    }

    public Tesis getFiltro_cat() {
        return getFiltro_tes();
    }

    public void setFiltro_cat(Tesis filtro_cat) {
        this.setFiltro_tes(filtro_cat);
    }

    public Tesis getFiltro_tes() {
        return filtro_tes;
    }

    public void setFiltro_tes(Tesis filtro_tes) {
        this.filtro_tes = filtro_tes;
    }

    public List<Tesis> getListTesis() {
        return listTesis;
    }

    public void setListTesis(List<Tesis> listTesis) {
        this.listTesis = listTesis;
    }

    public List<SelectItem> getListCatalogo01() {
        return listCatalogo01;
    }

    public void setListCatalogo01(List<SelectItem> listCatalogo01) {
        this.listCatalogo01 = listCatalogo01;
    }

    public List<SelectItem> getListCatalogo02() {
        return listCatalogo02;
    }

    public void setListCatalogo02(List<SelectItem> listCatalogo02) {
        this.listCatalogo02 = listCatalogo02;
    }

    public List<SelectItem> getListCatalogo03() {
        return listCatalogo03;
    }

    public void setListCatalogo03(List<SelectItem> listCatalogo03) {
        this.listCatalogo03 = listCatalogo03;
    }

    public List<SelectItem> getListCatalogo04() {
        return listCatalogo04;
    }

    public void setListCatalogo04(List<SelectItem> listCatalogo04) {
        this.listCatalogo04 = listCatalogo04;
    }

    public List<SelectItem> getListCatalogo05() {
        return listCatalogo05;
    }

    public void setListCatalogo05(List<SelectItem> listCatalogo05) {
        this.listCatalogo05 = listCatalogo05;
    }

    public List<SelectItem> getListCatalogo06() {
        return listCatalogo06;
    }

    public void setListCatalogo06(List<SelectItem> listCatalogo06) {
        this.listCatalogo06 = listCatalogo06;
    }

    public List<SelectItem> getListCatalogo07() {
        return listCatalogo07;
    }

    public void setListCatalogo07(List<SelectItem> listCatalogo07) {
        this.listCatalogo07 = listCatalogo07;
    }

    public List<SelectItem> getListCatalogo08() {
        return listCatalogo08;
    }

    public void setListCatalogo08(List<SelectItem> listCatalogo08) {
        this.listCatalogo08 = listCatalogo08;
    }

    public List<SelectItem> getListCatalogo09() {
        return listCatalogo09;
    }

    public void setListCatalogo09(List<SelectItem> listCatalogo09) {
        this.listCatalogo09 = listCatalogo09;
    }
}
