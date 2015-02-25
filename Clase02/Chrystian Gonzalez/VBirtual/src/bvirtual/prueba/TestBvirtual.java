/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bvirtual.prueba;

import java.math.BigDecimal;
import bvirtual.entidades.MdPais;
import bvirtual.oad.PaisOADJPA;
import bvirtual.oad.PaisOAD;

/**
 *
 * @author Chrys
 */
public class TestBvirtual {
    
    public static void main(String[] args) {
        MdPais p1 = new MdPais();
        p1.setIdPais(01);
        p1.setNomPais("México");
        
        PaisOAD paisOAD = new PaisOADJPA();
        paisOAD.crear(p1);
        
        System.out.println(String.format("Hay %d artículos", 
                paisOAD.getConteoArticulos()));
    }
    
}
