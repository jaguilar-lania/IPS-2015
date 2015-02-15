/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.virtualMonkey.oad;
import rysi.virtualMonkey.entidades.Materialextra; 
/**
 *
 * @author mat
 */
public interface OADMatExtra {

    /**
     *
     * @param mat
     */
    public abstract void registrar(Materialextra art);

    /**
     *
     * @param mat
     */
    public abstract void editar(Materialextra mat);

    /**
     *
     * @param idMatExtra
     */
    public abstract void eliminar(int idMatExtra);

    
   

    
}//end OADUsuarios

