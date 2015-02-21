package org.inecol.virtualmonkey.oad;

import java.util.List;
import org.inecol.virtualmonkey.entidades.Primate;

/**
 * @author Gudini
 * @version 1.0
 * @created 14-feb-2015 02:35:59 p.m.
 */
public abstract class PrimateOAD {

	public PrimateOAD(){

	}

	/**
	 * @param pri
	 */
	public abstract void actualizar(Primate pri);

	/**
	 * @param pri
	 */
	public abstract void borrar(Primate pri);

	/**
	 * @param int
	 */
	public abstract Primate consultarPorId(int IdPrimate);

	/**
	 * @param nombre
	 */
	public abstract List<Primate> consultarPorNombre(String nombre);

	/**
	 * @param pri
	 */
	public abstract List<Primate> consultarTodos(Primate pri);

	/**
	 * @param pri
	 */
	public abstract int crear(Primate pri);
        
        public abstract long contarPrimate();

}