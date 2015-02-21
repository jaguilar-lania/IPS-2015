/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.oad;

import biblioteca.entidades.Pais;
import java.util.List;

/**
 *
 * @author Chrys
 */
public interface paisOAD {
    
      /**
     *
     * @param pais
     */
    public void actualizar(Pais pais);

    /**
     *
     * @param pais
     */
    public void borrar(Pais pais);

    /**
     *
     * @param idPais
     */
    public void borrar(int idPais);

    /**
     *
     * @param nombre
     */
    public List<Pais> buscarPorNombre(String nombre);

    /**
     *
     * @param art
     */
    public int crear(Pais pais);

    /**
     *
     * @param idPais
     */
    public Pais getPorId(int idPais);

    public List<Pais> getTodos();
    
    public long getConteoPais();
    
}
