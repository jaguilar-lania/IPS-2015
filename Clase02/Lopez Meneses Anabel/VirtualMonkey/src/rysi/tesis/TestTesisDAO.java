/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis;

import java.math.BigDecimal;
import rysi.articulos.entidades.Articulo;
import rysi.articulos.oad.ArticulosOAD;
import rysi.articulos.oad.ArticulosOADJPA;
import rysi.tesis.entidades.Sesion;

/**
 *
 * @author Anny
 */
public class TestTesisDAO {
    
    public static void main(String[] args) {
        Sesion sesion1 = new sesion();
        sesion1.setFechaingreso("14/02/2015");
        sesion1.setHoraingreso("08:00:00");
        sesion1.
        
        
        Articulo art1 = new Articulo();
        art1.setNombre("Java en 21 Días");
        art1.setDescripcion("Libro para aprender Java");
        art1.setPrecio(new BigDecimal("349.95"));

        ArticulosOAD artsOAD = new ArticulosOADJPA();
        artsOAD.crear(art1);
        
        System.out.println(String.format("Hay %d artículos", 
                artsOAD.getConteoArticulos()));
    }
    
}
