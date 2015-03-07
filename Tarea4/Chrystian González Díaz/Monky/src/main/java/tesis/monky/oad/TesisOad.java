/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesis.monky.oad;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import tesis.monky.entidades.Tesis;

/**
 *
 * @author Chrys
 */
public interface TesisOad extends JpaRepository<Tesis, Integer>{
    
    List<Tesis> findByTituloContaining(String cadena);
    
    List<Tesis> findByTituloStartingWith(String cadena);
    
}
