/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.principal;

import java.util.Date;
import rgomez.mx.entidades.Sugerencia;
import rgomez.mx.oad.SugerenciaOAD;
import rgomez.mx.oad.SugerenciaOADJPA;

/**
 *
 * @author Subli
 */
public class PruebaOAD {
 
     public static void main(String[] args) {
        Sugerencia sug1 = new Sugerencia();
        sug1.setSugerencia("Cambiar portada");
        Date fecha = new Date();
        fecha.getDate();
        sug1.setFechacreacion(fecha);
        sug1.setIdusuario(null);

        SugerenciaOAD surOAD = new SugerenciaOADJPA();
        surOAD.crear(sug1);
        
        System.out.println(String.format("Hay %d sugerencias", 
                surOAD.getCountSugerencias()));
    }
}
