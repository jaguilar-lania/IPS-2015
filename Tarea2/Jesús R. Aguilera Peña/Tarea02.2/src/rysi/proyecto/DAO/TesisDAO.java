package rysi.proyecto.DAO;

import java.util.List;
import rysi.proyecto.entidades.Tesis;

/**
 * @author jaguilera
 * @version 1.0
 * @created 15-feb.-2015 16:50:32
 */
public interface TesisDAO {

	public List<Tesis> getTodos();

	/**
	 * 
	 * @param idTesis
	 */
	public Tesis getPorId(int idTesis);

	/**
	 * 
	 * @param Titulo
	 */
	public List<Tesis> buscarPorTitulo(String Titulo);

	/**
	 * 
	 * @param idTesis
	 */
	public void borrar(int idTesis);

	/**
	 * 
	 * @param tes
	 */
	public void actualizar(Tesis tes);

	/**
	 * 
	 * @param tes
	 */
	public void borrar(Tesis tes);

	/**
	 * 
	 * @param tes
	 */
	public int crear(Tesis tes);

}