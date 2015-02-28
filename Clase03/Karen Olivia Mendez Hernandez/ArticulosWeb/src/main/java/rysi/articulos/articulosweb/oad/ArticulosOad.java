/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose  Tools | Templates
 * and open the template in the editor.
 */
package rysi.articulos.articulosweb.oad;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import rysi.articulos.articulosweb.Articulo;

/**
 *
 * @author user
 */
public interface ArticulosOad extends JpaRepository<Articulo, Integer>{
    
    
    List<Articulo> findByNombreContaining(String cadena);
    
    List<Articulo> findByNombreStartingWith(String cadena);
}
