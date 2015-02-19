/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esqueleto;

/**
 *
 * @author jaguilera
 */
public class Item {
    private int valor;
    
    private String descripcion;
    
    public int value(){
        return valor;
    }
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setValue(int valor){
        this.valor = valor;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
}
