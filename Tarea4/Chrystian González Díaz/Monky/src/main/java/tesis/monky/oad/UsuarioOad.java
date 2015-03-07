/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesis.monky.oad;

import java.util.List;
import tesis.monky.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Chrys
 */
public interface UsuarioOad extends JpaRepository<Usuario, Integer>{
       
    List<Usuario> findAll(Usuario usuario);
    
}
