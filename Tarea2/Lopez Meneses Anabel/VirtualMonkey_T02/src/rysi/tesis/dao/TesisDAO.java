/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis.dao;

import java.util.List;
import rysi.tesis.entidades.Tesis;

/**
 *
 * @author Anny
 */
public interface TesisDAO {
    
    /**
	 * 
	 * @param art
	 */
	public abstract void crearTesis(Tesis art);
        
     /**
	 * 
	 * @param art
	 */
	public abstract void modificarTesis(Tesis art);
        
        /**
	 * 
	 * @param art
	 */
	public abstract void eliminarTesis(Tesis art);
        
        
     /**
	 * 
	 * @param idTesis
	 */
	public abstract void eliminarTesis(int idTesis);
    
         public Tesis getTesisPorId(int idTesis);
    

        public List<Tesis> getTodos();
        
        //enumeracion para los campos de busqueda avanzada
        public enum campoBusqueda {
            AUTOR,
            ESPECIE_PRIMATE,
            DISCIPLINA,
            ESTADO,
            PALABRA_CLAVE 
            
        }
        
        public List<Tesis> getBusquedaAvanzada(campoBusqueda campo, String cadena);
    
}
