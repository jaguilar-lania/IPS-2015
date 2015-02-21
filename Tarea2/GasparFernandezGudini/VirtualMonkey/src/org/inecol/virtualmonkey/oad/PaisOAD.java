package org.inecol.virtualmonkey.oad;

import java.util.List;
import org.inecol.virtualmonkey.entidades.Pais;

/**
 * @author Gudini
 * @version 1.0
 * @created 14-feb-2015 02:35:59 p.m.
 */
public abstract class PaisOAD {

	public PaisOAD(){

	}

	/**
	 * @param pais
	 */
	public abstract void actualizar(Pais pais);

	/**
	 * @param pais
	 */
	public abstract void borrar(Pais pais);

	/**
	 * @param int
	 */
	public abstract Pais consultarPorId(int IdPais);

	/**
	 * @param nombre
	 */
	public abstract List<Pais> consultarPorNombre(String nombre);

	/**
	 * @param pais
	 */
	public abstract List<Pais> consultarTodos(Pais pais);

	/**
	 * @param pais
	 */
	public abstract int crear(Pais pais);
        
        public abstract long contarPais();

}