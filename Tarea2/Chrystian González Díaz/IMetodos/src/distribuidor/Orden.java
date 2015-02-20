/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuidor;

import java.util.List;

/**
 *
 * @author Chrys
 */
public class Orden {
    
    public void despachar(List<Item> lista){
        System.out.println("Despachar lista");
        for(Item i1:lista){
            if(i1.getValor()>10000){
                DistribuidorEspecial.enviar(i1);
            }else{
                Distribuidor.enviar(i1);
            }
        }
    }
          
    
}
