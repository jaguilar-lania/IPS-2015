/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuidor;

/**
 *
 * @author Chrys
 */
public class Item {
    
    String nombre;
    int valor;
    
    public Item(String nombre, int valor){
        this.nombre = nombre;
        this.valor = valor;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public int getValor(){
        return valor;
    }
}
