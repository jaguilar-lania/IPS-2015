/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import accesoaDatos.DisciplinaOAD;
import clasePrimate.Disciplina;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



/**
 *
 * @author REBECA
 */
@ManagedBean(name="disciplinaBean")
@SessionScoped

public class DisciplinasBeans {
    private List<Disciplina> listaDisciplinas;
    private boolean vistaformulario;
    private Disciplina formuladioDis;
    private boolean tipoOperacion; // true = nuevo  false = Actualizar
    
    
    @PostConstruct 
    public void iniciarCont(){
        listaDisciplinas = new DisciplinaOAD().getTodos();
    }
    
    public String agregar(){
        vistaformulario = true;
        tipoOperacion = true;
        formuladioDis = new Disciplina();
        return "disciplinas";
    }
    
    public String editar(){
        vistaformulario = true;
        tipoOperacion = false;
        return "disciplinas";
    }
    
    public String guardar(){
        DisciplinaOAD b = new DisciplinaOAD();
        
        if(b.guardar(formuladioDis)){
          listaDisciplinas = new DisciplinaOAD().getTodos();
        }
        vistaformulario = false;
        return "disciplinas";
    }
    
     public String actualizar(){
        DisciplinaOAD b = new DisciplinaOAD();
        
        if(b.actualizar(formuladioDis)){
          listaDisciplinas = new DisciplinaOAD().getTodos();
        }
        vistaformulario = false;
        return "disciplinas";
    }
    
     public String eliminar(){
        DisciplinaOAD b = new DisciplinaOAD();
        
        if(b.eliminar(formuladioDis)){
          listaDisciplinas = new DisciplinaOAD().getTodos();
        }
        vistaformulario = false;
        return "disciplinas";
    }
     
    public String cancelar(){
        vistaformulario = false;
        return "disciplinas";
    }

    /**
     * @return the listaDisciplinas
     */
    public List<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }

    /**
     * @param listaDisciplinas the listaDisciplinas to set
     */
    public void setListaDisciplinas(List<Disciplina> listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }

    /**
     * @return the formuladioDis
     */
    public Disciplina getFormuladioDis() {
        return formuladioDis;
    }

    /**
     * @param formuladioDis the formuladioDis to set
     */
    public void setFormuladioDis(Disciplina formuladioDis) {
        this.formuladioDis = formuladioDis;
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
    
}
