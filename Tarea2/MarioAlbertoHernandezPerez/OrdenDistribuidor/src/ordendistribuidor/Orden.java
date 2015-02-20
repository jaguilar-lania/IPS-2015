/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordendistribuidor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Frost
 */
public class Orden {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Orden ord = new Orden();
        List<Item> list = new ArrayList<Item>();
        Random rand = new Random();
        int numit = rand.nextInt(15)+1;
        System.out.println("Iniciando programa...");
        for(int i = 1;i<=numit;i++){
            list.add(new Item("Elemento "+i, rand.nextInt(100) * 200));
        }
        ord.despachar(list);
    }
    
    public void despachar(List<Item> lista){
        System.out.println("Despachar lista");
        for(Item it:lista){
            if(it.getValue()>10000){
                DistribuidorEspecial.enviar(it);
            }else{
                Distribuidor.enviar(it);
            }
        }
    }
    
}
