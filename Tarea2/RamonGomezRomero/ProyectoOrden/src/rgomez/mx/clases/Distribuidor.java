/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.mx.clases;

/**
 *
 * @author Subli
 */
public class Distribuidor {
    
    public Distribuidor(){
        
    }
    
    public static void enviar(Item item){
        System.out.println("Clase Distribuidor");
        System.out.println(item.getName() + " valor: "+item.getValue());
    }
}
