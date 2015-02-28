package mrysi.proyecto.web.oad;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import mrysi.proyecto.web.entidades.Disciplina;

/**
 *
 * @author jaguilera
 */
public interface WebDisciplinaOad extends JpaRepository<Disciplina, Integer> {
    
    List<Disciplina> findByDisciplinaContaining(String cadena);
    
    List<Disciplina> findByDisciplinaStartingWith(String cadena);
}