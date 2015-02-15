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
public interface DAOMatExtra {

    /**
     *
     * @param mat
     */
    public  void registrar(Materialextra mat);

    /**
     *
     * @param mat
     */
    public  void editar(Materialextra mat);

    /**
     *
     * @param idMatExtra
     */
    public  void eliminar(int idMatExtra);

    
   

    
}//end OADUsuarios

