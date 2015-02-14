

/**
 * @author jaguilera
 * @version 1.0
 * @created 14-feb.-2015 14:35:31
 */
public class DAO Comentarios {

	public Comentarios m_Comentarios;

	public DAO Comentarios(){

	}

	public void finalize() throws Throwable {

	}

	public abstract List<Comentario> getTodos();

	/**
	 * 
	 * @param com
	 */
	public abstract void updateComentarios(Comentario com);

	/**
	 * 
	 * @param com
	 */
	public abstract void deleteComentarios(Comentario com);

	/**
	 * 
	 * @param com
	 */
	public abstract void addComentarios(Comentario com);

	/**
	 * 
	 * @param idComentario
	 */
	public abstract void deleteComentarios(int idComentario);

	/**
	 * 
	 * @param comentario
	 */
	public abstract List<Comentario> buscarPorComentario(String comentario);

	/**
	 * 
	 * @param idComentario
	 */
	public abstract Comentario getId(int idComentario);

}