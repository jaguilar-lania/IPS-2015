package rysi.virtualMonkey.oad;

import java.util.List;
import rysi.virtualMonkey.entidades.Usuario;

/**
 * @author jaguilar
 * @version 1.0
 * @created 14-feb.-2015 11:39:53
 */
public interface OADUsuarios {
 /**
     *
     * @param usr
     */
    public void registrar(Usuario usr);

/**
     *
     * @param idUsuario
     */
    public void eliminar(int idUsuario);
    
    /**
     *
     * @param usr
     */
    public void editar(Usuario usr);
}//end ArticulosOAD
