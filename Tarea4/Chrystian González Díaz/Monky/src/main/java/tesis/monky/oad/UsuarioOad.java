/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesis.monky.oad;

import org.springframework.data.jpa.repository.JpaRepository;
import tesis.monky.entidades.Usuario;

/**
 *
 * @author Chrys
 */
public interface UsuarioOad extends JpaRepository<Usuario, Integer>{
    
}
