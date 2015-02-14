package rysi.articulos;

import java.math.BigDecimal;
import rysi.articulos.entidades.Articulo;
import rysi.articulos.oad.ArticulosOAD;
import rysi.articulos.oad.ArticulosOADJPA;

/**
 *
 * @author jaguilar
 */
public class TestArticulosOAD {
    public static void main(String[] args) {
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







