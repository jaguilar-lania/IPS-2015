/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesis.monky.oad;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import tesis.monky.entidades.Disciplina;

/**
 *
 * @author Chrys
 */
public interface DisciplinaOad extends JpaRepository<Disciplina, Integer>{
    
    List<Disciplina> findByDescripcionContaining(String cadena);
    
    List<Disciplina> findByDescripcionStartingWith(String cadena);
    
    @Override
    List<Disciplina> findAll();
}
