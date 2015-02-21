/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis.dao;

import java.util.List;
import rysi.tesis.entidades.Usuario;

/**
 *
 * @author Anny
 */
public interface UsuarioDAO {
    
    public void crearUsuario(Usuario art);
    
    public void modificarUsuario(Usuario art);
    
    public void eliminarUsuario(Usuario art);
    
    public Usuario getUsuarioPorId(int IdUsuario);
    
    public List<Usuario> ValidaUsuarioPassword (String usuario, String password);
    
}
