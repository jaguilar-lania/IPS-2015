/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.mx.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Subli
 */
public class Orden {
 
    public static void main(String[] args){
        Orden orden = new Orden();
        List<Item> listaElementos = new ArrayList<>();
        listaElementos = orden.llenaLista();
        orden.despachar(listaElementos);
    }
    
    public List<Item> llenaLista(){
        List<Item> aux = new ArrayList<>();
        Random rand = new Random();
        for(int i = 1; i<=10; i++){
            aux.add(new Item("Elemento "+i, rand.nextInt(25000)));
        }
        return aux;
    }
    
    public void despachar(List<Item> lista){
         for(int i = 0; i<lista.size(); i++){
            Item aux = lista.get(i);
            if(aux.getValue()>10000){
                DistribuidorEspecial.enviar(aux);
            }else{
                Distribuidor.enviar(aux);
            }
        }
    }
    
}
