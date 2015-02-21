/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.ordenes.entidades;

import java.util.List;

/**
 *
 * @author Anny
 */
public class Orden {
    public void despachar(List<Item> lista){
        
        for(Item item1:lista){
            if(item1.getValue()>10000){
                DistribuidorEspecial.enviar(item1);
                
            }
            else{
                Distribuidor.enviar(item1);
            }
        }
    }
    
}
