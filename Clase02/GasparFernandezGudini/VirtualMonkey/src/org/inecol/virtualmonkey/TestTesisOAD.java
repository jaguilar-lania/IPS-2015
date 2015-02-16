/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inecol.virtualmonkey;

import java.util.Date;
import org.inecol.virtualmonkey.entidades.Tesis;
import org.inecol.virtualmonkey.oad.TesisOAD;
import org.inecol.virtualmonkey.oad.TesisOADJPA;

/**
 *
 * @author Gudini
 */
public class TestTesisOAD {
    public static void main(String args[]){
        
        Tesis tes1 = new Tesis();
        tes1.setNombre("Respuestas de Comportamiento y Fisiologicas del Mono Aullador");
        tes1.setIdAutor(1);
        tes1.setIdDisciplina(1);
        tes1.setIdSubdisciplina(1);
        tes1.setIdDirectorTesis(1);
        tes1.setIdPrimate(1);
        tes1.setFechaRegistro(new Date());
        tes1.setAnexos(null);

        TesisOAD tesisOAD = new TesisOADJPA();
        tesisOAD.crear(tes1);
        
        System.out.println(String.format("Hay %d artículos", 
                tesisOAD.contarTesis()));
    }
}
