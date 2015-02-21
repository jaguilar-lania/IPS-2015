/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.ordenes.entidades;

/**
 *
 * @author Anny
 */
public class Distribuidor {
    
    public static void enviar(Item item){
        System.out.println(String.format(" %d : se envió el item al distibuidor",
                item.getValue()));
    
    }
    
}
