/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.mx.ips2015;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author miguel
 */
public class Orden {
    
    public Orden()
    {
        
    }
    
    public void despachar(List<Item> lista)
    {
        DistribuidorEspecial distribuidorEspecial = new DistribuidorEspecial();
        Distribuidor distribuidor =  new Distribuidor();
        for(Item item:lista)
        {
            if(item.getValue() > 10000)
            {
               distribuidorEspecial.enviar(item);
            }
            else
            {
                distribuidor.enviar(item);
            }  
        }
    }
    
}
