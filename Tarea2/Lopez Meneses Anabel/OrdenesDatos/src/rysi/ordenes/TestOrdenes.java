/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.ordenes;


import java.util.ArrayList;

import java.util.List;
import rysi.ordenes.entidades.Item;
import rysi.ordenes.entidades.Orden;

/**
 *
 * @author Anny
 */
public class TestOrdenes {
    
    public static void main(String[] args) {
               
        List<Item> lista1= new ArrayList<Item>();
        lista1.add(new Item(10));
        lista1.add(new Item(1000000));
        lista1.add(new Item(20));
        lista1.add(new Item(500000));
        lista1.add(new Item(92));
        lista1.add(new Item(365988));
        
        Orden orden1= new Orden();
        orden1.despachar(lista1);
        
        
        
    }
    
}
