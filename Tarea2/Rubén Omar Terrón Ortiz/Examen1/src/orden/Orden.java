/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orden;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author rterr_000
 */
public class Orden {
    
    public static void main(String[] arg){
        
        Orden b = new Orden();
        List<Item> c = new ArrayList<Item>();
        Random d = new Random();
        int rep = d.nextInt(10);
        System.out.println("Despachar");
        for(int e = 1; e<=rep; e++){
            c.add(new Item("Numero "+e, d.nextInt(120)*190));
            
        }
        b.Despachar(c);
        
    }

    private void Despachar(List<Item> c) {
        
        System.out.println("En Proceso");
        for(Item f:c){
            if(f.TomaValor()>10000){
                DistribuidorEspecial.Enviar(f);
            }
            else{
                Distribuidor.enviar(f);
            }
            }
        }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
