/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.virtualMonkey.oad;
import rysi.virtualMonkey.entidades.Usuario; 
/**
 *
 * @author user
 */
public interface OADUsuarios {

    /**
     *
     * @param usr
     */
    public abstract void registrar(Usuario usr);

    /**
     *
     * @param usr
     */
    public abstract void editar(Usuario usr);

    /**
     *
     * @param idUsuario
     */
    public abstract void eliminar(int idUsuario);

    
    /**
     *
     * @param usr
     */
    public abstract void cambiarContrasena(Usuario usr);

    
}//end OADUsuarios

