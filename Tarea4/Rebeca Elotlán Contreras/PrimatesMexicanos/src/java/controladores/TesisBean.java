/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import accesoaDatos.DisciplinaOAD;
import accesoaDatos.PrimatesOAD;
import accesoaDatos.TesisOAD;
import clasePrimate.Disciplina;
import clasePrimate.Especieprimate;
import clasePrimate.Tesis;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author REBECA
 */
@ManagedBean(name="tesisBean")
@SessionScoped
public class TesisBean {
    
    private List<Tesis> listaTesis;
    private boolean vistaformulario;
    private Tesis formuladioTes;
    private boolean tipoOperacion; // true = nuevo  false = Actualizar
    private List<SelectItem> listDisciplinas;
    private List<SelectItem> listEspecieprimates;
    
    
    @PostConstruct 
    public void iniciarCont(){
        listaTesis = new TesisOAD().getTodos();
    }
    
    public String agregar(){
        setVistaformulario(true);
        setTipoOperacion(true);
        formuladioTes = new Tesis();
        return "tesis";
    }
    
    public String editar(){
        setVistaformulario(true);
        setTipoOperacion(false);
        return "tesis";
    }
    
    public String guardar(){
        TesisOAD b = new TesisOAD();
        
        if(b.guardar(formuladioTes)){
          listaTesis = new TesisOAD().getTodos();
        }
        setVistaformulario(false);
        return "tesis";
    }
    
     public String actualizar(){
        TesisOAD b = new TesisOAD();
        
        if(b.actualizar(formuladioTes)){
          listaTesis = new TesisOAD().getTodos();
        }
        setVistaformulario(false);
        return "tesis";
    }
    
     public String eliminar(){
        TesisOAD b = new TesisOAD();
        
        if(b.eliminar(formuladioTes)){
          listaTesis = new TesisOAD().getTodos();
        }
        setVistaformulario(false);
        return "tesis";
    }
     
    public String cancelar(){
        setVistaformulario(false);
        return "tesis";
    }

    /**
     * @return the listaTesis
     */
    public List<Tesis> getListaTesis() {
        return listaTesis;
    }

    /**
     * @param listaTesis the listaTesis to set
     */
    public void setListaTesis(List<Tesis> listaTesis) {
        this.listaTesis = listaTesis;
    }

    /**
     * @return the vistaformulario
     */
    public boolean isVistaformulario() {
        return vistaformulario;
    }

    /**
     * @param vistaformulario the vistaformulario to set
     */
    public void setVistaformulario(boolean vistaformulario) {
        this.vistaformulario = vistaformulario;
    }

    /**
     * @return the formuladioTes
     */
    public Tesis getFormuladioTes() {
        return formuladioTes;
    }

    /**
     * @param formuladioTes the formuladioTes to set
     */
    public void setFormuladioTes(Tesis formuladioTes) {
        this.formuladioTes = formuladioTes;
    }

    /**
     * @return the tipoOperacion
     */
    public boolean isTipoOperacion() {
        return tipoOperacion;
    }

    /**
     * @param tipoOperacion the tipoOperacion to set
     */
    public void setTipoOperacion(boolean tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    /**
     * @return the listDisciplinas
     */
    public List<SelectItem> getListDisciplinas() {
        listDisciplinas = new ArrayList<SelectItem>();
        List<Disciplina> listdis = new DisciplinaOAD().getTodos();
        for(Disciplina d:listdis){
            listDisciplinas.add(new SelectItem(d.getIdDisciplina(),d.getDescripcion()));
        }
        return listDisciplinas;
    }

    /**
     * @param listDisciplinas the listDisciplinas to set
     */
    public void setListDisciplinas(List<SelectItem> listDisciplinas) {
        this.listDisciplinas = listDisciplinas;
    }

    /**
     * @return the listEspecieprimate
     */
    public List<SelectItem> getListEspecieprimate() {
        setListEspecieprimates(new ArrayList<SelectItem>());
        List<Especieprimate> listprim = new PrimatesOAD().getTodos();
        for(Especieprimate d:listprim){
            listEspecieprimates.add(new SelectItem(d.getIdPrimate(),d.getNombre()));
        }
        return listEspecieprimates;
    }

    /**
     * @param listEspecieprimates the listEspecieprimate to set
     **/
    public void setListEspecieprimate(List<SelectItem> listEspecieprimates) {
        this.setListEspecieprimates(listEspecieprimates);
    }

    /**
     * @return the listEspecieprimates
     */
    public List<SelectItem> getListEspecieprimates() {
        return listEspecieprimates;
    }

    /**
     * @param listEspecieprimates the listEspecieprimates to set
     */
    public void setListEspecieprimates(List<SelectItem> listEspecieprimates) {
        this.listEspecieprimates = listEspecieprimates;
    }

    
}
