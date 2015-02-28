/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.articulos.inecolprimemaven.src;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import rgomez.articulos.inecolprimemaven.Disciplina;
import rgomez.articulos.inecolprimemaven.Tesis;

/**
 *
 * @author Subli
 */
public interface TesisOad extends JpaRepository<Tesis, Integer>{
    
     List<Tesis> findByNombreContaining(String cadena);
    
     List<Tesis> findByNombreStartingWith(String cadena);
}
