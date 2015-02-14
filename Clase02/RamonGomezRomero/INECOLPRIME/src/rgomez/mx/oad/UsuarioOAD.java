/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.mx.oad;

import java.util.Date;
import java.util.List;
import rgomez.mx.entidades.Usuario;

/**
 *
 * @author Subli
 */
public interface UsuarioOAD {
 
     public void actualizar(Usuario usu);

    public void borrar(Usuario usu);

    public int crear(Usuario usu);

    public Usuario getById(int idUsuario);

    public List<Usuario> getAll();
    
    public long getCountUsuarios();
}
