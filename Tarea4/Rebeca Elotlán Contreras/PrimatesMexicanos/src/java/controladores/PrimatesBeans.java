/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import accesoaDatos.PrimatesOAD;
import clasePrimate.Especieprimate;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author REBECA
 */
@ManagedBean(name="primatesBeans")
@SessionScoped
public class PrimatesBeans {
    private List<Especieprimate> listaEspecieprimates;
    private boolean vistaformulario;
    private Especieprimate formuladioPrim;
    private boolean tipoOperacion; // true = nuevo  false = Actualizar
    
    
    @PostConstruct 
    public void iniciarCont(){
        listaEspecieprimates = new PrimatesOAD().getTodos();
    }
    
    public String agregar(){
        setVistaformulario(true);
        setTipoOperacion(true);
        formuladioPrim = new Especieprimate();
        return "Especieprimate";
    }
    
    public String editar(){
        setVistaformulario(true);
        setTipoOperacion(false);
        return "Especieprimate";
    }
    
    public String guardar(){
        PrimatesOAD b = new PrimatesOAD();
        
        if(b.guardar(formuladioPrim)){
          listaEspecieprimates = new PrimatesOAD().getTodos();
        }
        setVistaformulario(false);
        return "Especieprimates";
    }
    
     public String actualizar(){
        PrimatesOAD b = new PrimatesOAD();
        
        if(b.actualizar(formuladioPrim)){
          listaEspecieprimates = new PrimatesOAD().getTodos();
        }
        setVistaformulario(false);
        return "Especieprimate";
    }
    
     public String eliminar(){
        PrimatesOAD b = new PrimatesOAD();
        
        if(b.eliminar(formuladioPrim)){
          listaEspecieprimates = new PrimatesOAD().getTodos();
        }
        setVistaformulario(false);
        return "Especieprimate";
    }
     
    public String cancelar(){
        setVistaformulario(false);
        return "Especieprimate";
    }

    /**
     * @return the listaEspecieprimates
     */
    public List<Especieprimate> getListaEspecieprimate() {
        return listaEspecieprimates;
    }

    /**
     * @param listaEspecieprimates the listaEspecieprimates to set
     */
    public void setListaEspecieprimate(List<Especieprimate> listaEspecieprimates) {
        this.listaEspecieprimates = listaEspecieprimates;
    }

    /**
     * @return the formuladioPrim
     */
    public Especieprimate getFormuladioPrim() {
        return formuladioPrim;
    }

    /**
     * @param formuladioPrim the formuladioPrim to set
     */
    public void setFormuladioPrim(Especieprimate formuladioPrim) {
        this.formuladioPrim = formuladioPrim;
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
     * @return the listaEspecieprimates
     */
    public List<Especieprimate> getListaEspecieprimates() {
        return listaEspecieprimates;
    }

    /**
     * @param listaEspecieprimates the listaEspecieprimates to set
     */
    public void setListaEspecieprimates(List<Especieprimate> listaEspecieprimates) {
        this.listaEspecieprimates = listaEspecieprimates;
    }

    /**
     * @return the formuladioPrim
     */
   
    
}

    

