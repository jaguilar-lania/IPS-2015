package mrysi.proyecto.web.oad;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import mrysi.proyecto.web.entidades.Tesis;

/**
 *
 * @author jaguilera
 */
public interface WebTesisOad extends JpaRepository<Tesis, Integer> {
    
    List<Tesis> findByTituloContaining(String cadena);
    
    List<Tesis> findByTituloStartingWith(String cadena);
}