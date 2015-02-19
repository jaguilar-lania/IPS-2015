/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esqueleto;

import java.util.List;

/**
 *
 * @author jaguilera
 */
public class Orden {
    public void despachar(List<Item> lista){
        DistribuidorEspecial dE = new DistribuidorEspecial();
        Distribuidor d = new Distribuidor();
        
        for (Item i:lista){
            if (i.value() > 10000){
                dE.enviar(i);            
            }
            else
                d.enviar(i);
        }
    }
}
