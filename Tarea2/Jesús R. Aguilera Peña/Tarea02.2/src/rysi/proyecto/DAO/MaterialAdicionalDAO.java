package rysi.proyecto.DAO;

import java.util.List;
import rysi.proyecto.entidades.Materialadicional;

/**
 * @author jaguilera
 * @version 1.0
 * @created 19-feb.-2015 21:01:44
 */
public interface MaterialAdicionalDAO {

	public List<Materialadicional> getTodos();

	/**
	 * 
	 * @param idmaterial
	 */
	public Materialadicional getPorIdComentario(int idmaterial);

	/**
	 * 
	 * @param IdTesis
	 */
	public List<Materialadicional> buscarPorIdTesis(int idtesis);

	/**
	 * 
	 * @param idmaterial
	 */
	public void borrar(int idmaterial);

	/**
	 * 
	 * @param mad
	 */
	public void actualizar(Materialadicional mad);

	/**
	 * 
	 * @param mad
	 */
	public void borrar(Materialadicional mad);

	/**
	 * 
	 * @param mad
	 */
	public int crear(Materialadicional mad);

}