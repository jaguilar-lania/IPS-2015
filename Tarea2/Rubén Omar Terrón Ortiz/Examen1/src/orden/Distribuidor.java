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
public class Distribuidor {
    
    public static void enviar(Item a){
        
        System.out.println(String.format("Item: %s Valor (%s) ----> Distribuidor", a.TomaNombre(), a.TomaValor()));
    }
    
}
