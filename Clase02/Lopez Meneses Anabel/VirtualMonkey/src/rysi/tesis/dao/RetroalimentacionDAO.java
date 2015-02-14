package rysi.tesis.dao;

import java.util.List;
import rysi.tesis.entidades.Retroalimentacion;

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

}