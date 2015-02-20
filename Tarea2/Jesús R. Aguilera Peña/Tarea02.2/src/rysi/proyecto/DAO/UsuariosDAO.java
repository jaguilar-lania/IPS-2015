package rysi.proyecto.DAO;

import java.util.List;
import rysi.proyecto.entidades.Usuario;

/**
 * @author jaguilera
 * @version 1.0
 * @created 20-feb.-2015 13:33:20
 */
public interface UsuariosDAO {

	public List<Usuario> getTodos();

	/**
	 * 
	 * @param idusuario
	 */
	public Usuario getPorIdUsuario(int idusuario);

	/**
	 * 
	 * @param nombre
	 */
	public List<Usuario> buscarPorNombre(String nombre);

	/**
	 * 
	 * @param idusuario
	 */
	public void borrar(int idusuario);

	/**
	 * 
	 * @param usr
	 */
	public void actualizar(Usuario usr);

	/**
	 * 
	 * @param usr
	 */
	public void borrar(Usuario usr);

	/**
	 * 
	 * @param usr
	 */
	public int crear(Usuario usr);

}