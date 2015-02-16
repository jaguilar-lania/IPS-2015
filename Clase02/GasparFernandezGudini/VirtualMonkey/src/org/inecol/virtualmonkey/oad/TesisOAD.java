package org.inecol.virtualmonkey.oad;

import java.util.List;
import org.inecol.virtualmonkey.entidades.Tesis;

/**
 * @author Gudini
 * @version 1.0
 * @created 14-feb-2015 02:35:59 p.m.
 */
public abstract class TesisOAD {

	public TesisOAD(){

	}

	/**
	 * @param tes
	 */
	public abstract void actualizar(Tesis tes);

	/**
	 * @param tes
	 */
	public abstract void borrar(Tesis tes);

	/**
	 * @param int
	 */
	public abstract Tesis consultarPorId(int IdTesis);

	/**
	 * @param nombre
	 */
	public abstract List<Tesis> consultarPorNombre(String nombre);

	/**
	 * @param tes
	 */
	public abstract List<Tesis> consultarTodos(Tesis tes);

	/**
	 * @param tes
	 */
	public abstract int crear(Tesis tes);
        
        public abstract long contarTesis();

}