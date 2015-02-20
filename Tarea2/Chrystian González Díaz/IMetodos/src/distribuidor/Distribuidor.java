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
public class Distribuidor {
    
    public static void enviar(Item item){
        System.out.println("Enviando articulo a Distribuidor" + item.getNombre() +","+ item.getValor());
    }
    
}
