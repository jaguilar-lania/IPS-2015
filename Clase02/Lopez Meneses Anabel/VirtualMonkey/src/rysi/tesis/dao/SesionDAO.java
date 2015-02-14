package rysi.tesis.dao;

import java.util.List;
import rysi.tesis.entidades.Sesion;
import rysi.tesis.entidades.Usuario;

/**
 * @author Anny
 * @version 1.0
 * @created 14-feb.-2015 02:38:14 p. m.
 */
public interface SesionDAO {

	
	/**
	 * 
	 * @param art
	 */
	public abstract void registrarFinal(Usuario art);

	/**
	 * 
	 * @param art
	 */
	public abstract void registrarInicio(Usuario art);

	/**
	 * 
	 * @param art
	 */
	public abstract boolean validarUsuario(Usuario art);

}