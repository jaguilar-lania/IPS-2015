/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.articulos.inecolprimefinal.src;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import rgomez.articulos.inecolprimefinal.Disciplina;

/**
 *
 * @author Subli
 */
public interface DisciplinasOad extends JpaRepository<Disciplina, Integer>{
    
    List<Disciplina> findByNombreContaining(String cadena);
    
    List<Disciplina> findByNombreStartingWith(String cadena);
}
