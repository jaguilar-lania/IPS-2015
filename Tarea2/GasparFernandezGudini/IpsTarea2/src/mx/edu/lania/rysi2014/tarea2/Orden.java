/*
 * Copyright(C) Gudini 2015
 */
package mx.edu.lania.rysi2014.tarea2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Gudini
 */
public class Orden {
    
    public Orden() {
        
    }
    
    public void despachar(List<Item> lista){
        Distribuidor dis = new Distribuidor();
        DistribuidorEspecial de = new DistribuidorEspecial();
        for(Item item: lista){
            if(item.value > 10000){
                de.enviar(item);
            }
            else
            {
                dis.enviar(item);
            }
        }
    }
}
