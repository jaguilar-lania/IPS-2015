/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esqueletos;

import java.util.List;

/**
 *
 * @author REBECA
 */
public class Orden {


    
    public void despachar(List<Item> lista){
        
        DistribuidorEspecial DE = new DistribuidorEspecial();
        Distribuidor Dis =  new Distribuidor();
        
        for(Item item:lista)
        {
            if(item.getVal() > 10000)
            {
               DE.enviar(item);
            }
            else
            {
                Dis.enviar(item);
            }  
        }
    }
}
