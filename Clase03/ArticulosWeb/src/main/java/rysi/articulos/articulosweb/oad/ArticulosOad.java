package rysi.articulos.articulosweb.oad;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import rysi.articulos.articulosweb.entidades.Articulo;

/**
 *
 * @author jaguilar
 */
public interface ArticulosOad extends JpaRepository<Articulo, Integer> {
    
    List<Articulo> findByNombreContaining(String cadena);
}
