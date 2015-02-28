/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis.virtualmonkeyweb.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import rysi.tesis.virtualmonkeyweb.Disciplinaestudio;

/**
 *
 * @author Anny
 */
public interface DisciplinaDao extends JpaRepository<Disciplinaestudio,Integer>  {

    public List<Disciplinaestudio> findByTituloContaining(String cadena);

    public List<Disciplinaestudio> findByNombreContaining(String cadena);
    
}
