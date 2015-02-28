/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose  Tools | Templates
 * and open the template in the editor.
 */
package rysi.virtual.virtualmonkey.oad;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import rysi.virtual.virtualmonkey.Catalogotesis;

/**
 *
 * @author user
 */
public interface TesisOad extends JpaRepository<Catalogotesis, Integer>{
    
     List<Catalogotesis> findByTituloContaining(String cadena);
    
    List<Catalogotesis> findByTituloStartingWith(String cadena);
       

}
