

/**
 * @author jaguilera
 * @version 1.0
 * @created 19-feb.-2015 21:01:44
 */
public class MaterialAdicionalDAO {

	public MaterialAdicionalDAO(){

	}

	public void finalize() throws Throwable {

	}

	public abstract List<Madicional> getTodos();

	/**
	 * 
	 * @param idmaterial
	 */
	public abstract Materialadicional getPorIdComentario(int idmaterial);

	/**
	 * 
	 * @param IdTesis
	 */
	public abstract List<Tesis> buscarPorIdTesis(int IdTesis);

	/**
	 * 
	 * @param idmaterial
	 */
	public abstract void borrar(int idmaterial);

	/**
	 * 
	 * @param mad
	 */
	public abstract void actualizar(Madicional mad);

	/**
	 * 
	 * @param mad
	 */
	public abstract void borrar(Madicional mad);

	/**
	 * 
	 * @param mad
	 */
	public abstract void crear(Madicional mad);

}