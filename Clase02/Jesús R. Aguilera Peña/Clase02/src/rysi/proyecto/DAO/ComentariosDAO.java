package rysi.proyecto.DAO;

import java.util.List;
import rysi.proyecto.entidades.Comentario;
import rysi.proyecto.entidades.Tesis;

/**
 * @author jaguilera
 * @version 1.0
 * @created 15-feb.-2015 20:26:33
 */
public interface ComentariosDAO {

	public List<Comentario> getTodos();

	/**
	 * 
	 * @param idComentario
	 */
	public Comentario getPorIdComentario(int idComentario);

	/**
	 * 
	 * @param IdTesis
	 */
	public Comentario buscarPorIdTesis(int IdTesis);

	/**
	 * 
	 * @param idComentario
	 */
	public void borrar(int idComentario);

	/**
	 * 
	 * @param com
	 */
	public void actualizar(Comentario com);

	/**
	 * 
	 * @param com
	 */
	public void borrar(Comentario com);

	/**
	 * 
	 * @param com
	 */
	public int crear(Comentario com);

}