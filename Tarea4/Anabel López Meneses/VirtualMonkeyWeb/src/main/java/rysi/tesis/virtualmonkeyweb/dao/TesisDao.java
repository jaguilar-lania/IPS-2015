/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis.virtualmonkeyweb.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import rysi.tesis.virtualmonkeyweb.Tesis;

/**
 *
 * @author Anny
 */
public interface TesisDao extends JpaRepository<Tesis,Integer>{
    List<Tesis> findByIdContaining(Integer idTesis);

    

    public List<Tesis> findByTituloContaining(String cadena);
         
    /**
     *
     * @param tesis
     */
    
}

