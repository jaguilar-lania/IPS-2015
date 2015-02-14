

/**
 * @author Anny
 * @version 1.0
 * @created 14-feb.-2015 02:38:14 p. m.
 */
public class SesionDAO {

	public SesionDAO(){

	}

	public void finalize() throws Throwable {

	}

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