package org.inecol.virtualmonkey.oad;

import java.util.List;
import org.inecol.virtualmonkey.entidades.Disciplina;

/**
 * @author Gudini
 * @version 1.0
 * @created 14-feb-2015 02:35:59 p.m.
 */
public abstract class DisciplinaOAD {

	public DisciplinaOAD(){

	}

	/**
	 * @param dis
	 */
	public abstract void actualizar(Disciplina dis);

	/**
	 * @param dis
	 */
	public abstract void borrar(Disciplina dis);

	/**
	 * @param int
	 */
	public abstract Disciplina consultarPorId(int IdDisciplina);

	/**
	 * @param nombre
	 */
	public abstract List<Disciplina> consultarPorNombre(String nombre);

	/**
	 * @param dis
	 */
	public abstract List<Disciplina> consultarTodos(Disciplina dis);

	/**
	 * @param dis
	 */
	public abstract int crear(Disciplina dis);
        
        public abstract long contarDisciplina();

}