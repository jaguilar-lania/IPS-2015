/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis.virtualmonkeyweb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import rysi.tesis.virtualmonkeyweb.Autor;

/**
 *
 * @author Anny
 */
public interface AutorDao extends JpaRepository<Autor,Integer> {
    
}
