package rysi.tesis.dao;

import java.util.List;
import javax.persistence.EntityManager;
import rysi.tesis.entidades.Retroalimentacion;
import rysi.tesis.entidades.Usuario;

/**
 * @author Anny
 * @version 1.0
 * @created 14-feb.-2015 02:38:22 p. m.
 */
public interface RetroalimentacionDAO {


	/**
	 * 
	 * @param art
	 */
	public abstract void publicarComentario(Retroalimentacion art);

	/**
	 * 
	 * @param art
	 */
	public abstract void registrarRetroalimentacion(Retroalimentacion art);
        
        /**
	 * 
	 * @param idComentario
	 */
        public Retroalimentacion getComentarioPorId(int idComentario);
        
              

}