/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import biblioteca.entidades.Estado;
import biblioteca.oad.estadoOAD;
import biblioteca.oad.estadoOADJPA;

/**
 *
 * @author Chrys
 */
public class TestEstado {
    
    public static void main(String[] args) {
        Estado edo1 = new Estado();
        edo1.setIdEstado(01);
        edo1.setIdPais(null);
        edo1.setNomEstado("Veracruz");
        //art1.setPrecio(new BigDecimal("349.95"));

        estadoOAD estadoOAD = new estadoOADJPA();
        estadoOAD.crear(edo1);
        
        System.out.println(String.format("Hay %d Estados", 
                estadoOAD.getConteoEstado()));
    }
    
}
