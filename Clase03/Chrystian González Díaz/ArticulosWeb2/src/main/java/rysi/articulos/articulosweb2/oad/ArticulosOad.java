package rysi.articulos.articulosweb2.oad;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import rysi.articulos.articulosweb2.entidades.Articulo;

/**
 *
 * @author jaguilar
 */
public interface ArticulosOad extends JpaRepository<Articulo, Integer> {
    
    List<Articulo> findAll(Articulo art);
    
    List<Articulo> findByNombreContaining(String cadena);
    
    List<Articulo> findByNombreStartingWith(String cadena);
}
