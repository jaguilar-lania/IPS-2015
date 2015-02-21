/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import biblioteca.entidades.Pais;
import biblioteca.oad.paisOAD;
import biblioteca.oad.paisOADJPA;
import java.math.BigDecimal;


/**
 *
 * @author Chrys
 */
public class TestPais {
    
    public static void main(String[] args) {
        Pais art1 = new Pais();
        art1.setIdPais(01);
        art1.setNomPais("México");
        //art1.setPrecio(new BigDecimal("349.95"));

        paisOAD paisOAD = new paisOADJPA();
        paisOAD.crear(art1);
        
        System.out.println(String.format("Hay %d artículos", 
                paisOAD.getConteoPais()));
    }
    
}
