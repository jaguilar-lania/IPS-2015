

/**
 * @author jaguilera
 * @version 1.0
 * @created 14-feb.-2015 15:04:26
 */
public interface DAO Tesis {

	public Tesis m_Tesis;

	public DAO Tesis(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param titulo
	 */
	public abstract List<Tesis> buscarNombre(String titulo);

	/**
	 * 
	 * @param tes
	 */
	public abstract void updateTesis(Tesis tes);

	/**
	 * 
	 * @param tes
	 */
	public void deleteTesis(Tesis tes){

	}

	/**
	 * 
	 * @param tes
	 */
	public abstract void addTesis(Tesis tes);

	/**
	 * 
	 * @param idTesis
	 */
	public abstract void deleteTesis(int idTesis);

	public abstract List<Tesis> getTodos();

	/**
	 * 
	 * @param idTesis
	 */
	public abstract Tesis getIdTesis(int idTesis);

}