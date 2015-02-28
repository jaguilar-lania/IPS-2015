/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesis.atesis.oad;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import tesis.atesis.entidades.Pais;

/**
 *
 * @author Chrys
 */

public interface PaisOad extends JpaRepository<Pais, Integer> {
    
    List<Pais> findAll(Pais pais);
    
    List<Pais> findByNombreContaining(String cadena);
    
    List<Pais> findByNombreStartingWith(String cadena);
    
}
