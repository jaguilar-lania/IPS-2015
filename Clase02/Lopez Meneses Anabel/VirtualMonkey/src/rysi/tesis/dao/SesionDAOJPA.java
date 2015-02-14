package rysi.tesis.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import rysi.tesis.entidades.Sesion;
import rysi.tesis.entidades.Usuario;

/**
 * @author Anny
 * @version 1.0
 * @created 14-feb.-2015 02:38:17 p. m.
 */
public class SesionDAOJPA implements SesionDAO {

	public SesionDAOJPA(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param art
	 */
	public void registrarFinal(Usuario art){

	}

	/**
	 * 
	 * @param art
	 */
	public void registrarInicio(Usuario art){

	}

	/**
	 * 
	 * @param art
	 */
	public boolean validarUsuario(Usuario art){
		return false;
	}

}