/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.clase04.testing;

import java.util.List;

/**
 *
 * @author Frost
 */
public class BuscadorSuma{
    public boolean buscarSubconjuntoConSuma(List<Integer> conjunto, Integer suma){
        if(conjunto.isEmpty() && suma.equals(0)){
            return true;
        }
        if(!conjunto.isEmpty()){
            //Evaluando suma de subconjunto vacio
            if(suma.equals(0)){
                return true;
            }
            //Evaluando valores unicos
            if(conjunto.contains(suma)){
               return true;
            }
            //Evaluando sumas de elementos del conjunto
            
        }
        return false;
    }
}
