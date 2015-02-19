/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Esqueleto.Item;
import Esqueleto.Orden;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jaguilera
 */
public class TestOrden {
    public static void main(String[] args) {
        List<Item> lista = new ArrayList<Item>();
        Item item1 = new Item();
        item1.setValue(1890);
        item1.setDescripcion("Item1");
        lista.add(item1);

        Item item2 = new Item();
        item2.setValue(189093);
        item2.setDescripcion("Item2");
        lista.add(item2);
        
        Orden orden = new Orden();
        orden.despachar(lista);
        
        
    }
}
