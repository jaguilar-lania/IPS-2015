/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.oad;

import biblioteca.entidades.Estado;
import java.util.List;

/**
 *
 * @author Chrys
 */
public interface estadoOAD {
    
          /**
     *
     * @param edo
     */
    public void actualizar(Estado edo);

    /**
     *
     * @param edo
     */
    public void borrar(Estado edo);

    /**
     *
     * @param idEstado
     */
    public void borrar(int IdEstado);

    /**
     *
     * @param nombre
     */
    public List<Estado> buscarPorNombre(String nombre);

    /**
     *
     * @param edo
     */
    public int crear(Estado edo);

    /**
     *
     * @param idEstado
     */
    public Estado getPorId(int idEstado);

    public List<Estado> getTodos();
    
    public long getConteoEstado();
    
}
