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
public class DistribuidorEspecial {
    
    
    public DistribuidorEspecial(){
        
    }
    
    
    public static void enviar(Item item){
        System.out.println("Clase Distribuidor Especial");
        System.out.println(item.getName() + " valor: "+item.getValue());
    }
}
