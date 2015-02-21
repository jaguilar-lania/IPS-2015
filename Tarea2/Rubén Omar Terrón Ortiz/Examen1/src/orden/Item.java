/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orden;

/**
 *
 * @author rterr_000
 */
public class Item {
    private String Nombre;
    private Integer Valor;
    
    public Item(){
    
}

    public Item(String Nombre, Integer Valor){
        this.Nombre = Nombre;
        this.Valor = Valor;
    }
    
    public String TomaNombre(){
        return Nombre;
    }
    
    public void GNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    public Integer TomaValor(){
        return Valor;
    }
    
    public void GValor(Integer Valor){
        this.Valor = Valor;
    }
    
}