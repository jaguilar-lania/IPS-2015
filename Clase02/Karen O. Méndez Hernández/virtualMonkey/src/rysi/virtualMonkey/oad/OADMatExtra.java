package System;

/**
 * @version 1.0
 * @created 14-feb-2015 02:35:52 p.m.
 */
public interface OADMatExtra {

	/**
	 * 
	 * @param idMatExtra
	 */
	public abstract void eliminar(int idMatExtra);

	/**
	 * 
	 * @param idmatExtra
	 */
	public abstract void registrar(int idmatExtra);

}

/**
 * @author user
 * @version 1.0
 * @updated 14-feb-2015 03:04:47 p.m.
 */
public abstract class UsuarioOAD {

	public UsuarioOAD(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param int
	 * @param string
	 */
	public abstract void cambiarContraseña(idUsuario int, contraseña string);

	/**
	 * 
	 * @param idUsuario
	 * @param nombre
	 * @param correo
	 */
	public abstract void editar(int idUsuario, string nombre, string correo);

	/**
	 * 
	 * @param idUsuario
	 */
	public abstract void eliminar(int idUsuario);

	/**
	 * 
	 * @param idUsuario
	 * @param nombre
	 * @param correo
	 * @param edad
	 * @param genero
	 */
	public abstract void registrar(int idUsuario, string nombre, string correo, int edad, string genero);

}