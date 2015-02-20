/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordendistribuidor;

/**
 *
 * @author Frost
 */
public class Distribuidor {
    public static void enviar(Item item){
        System.out.println(String.format("Item: %s valor (%s) Enviado a Distribuidor",item.getName(),item.getValue()));
    }
}
