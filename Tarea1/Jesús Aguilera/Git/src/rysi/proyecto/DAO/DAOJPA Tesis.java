
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



/**
 * @author jaguilera
 * @version 1.0
 * @created 14-feb.-2015 14:35:37
 */
public class DAOJPA Tesis implements DAO Tesis {

        private EntityManagerFactory emf;
        
	public DAOJPA Tesis(){
            emf = Persistence.createEntityManagerFactory("TesisDatosPU");
	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param titulo
	 */
	public List<Tesis> buscarNombre(String titulo){
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT tes FROM Tesis art WHERE nombre LIKE :nombre")
                .setParameter("nombre", "%" + titulo + "%")
                .getResultList();
	}

	/**
	 * 
	 * @param idTesis
	 */
	public void deleteTesis(int idTesis){

	}

	/**
	 * 
	 * @param tes
	 */
	public void deleteTesis(Tesis tes){
            EntityManager em = emf.createEntityManager();
            em.remove(tes);
	}

	/**
	 * 
	 * @param idTesis
	 */
	public Tesis getIdTesis(int idTesis){
		return null;
	}

	public List<Tesis> getTodos(){
		return null;
	}

	/**
	 * 
	 * @param tes
	 */
	public void updateTesis(Tesis tes){
            EntityManager em = emf.createEntityManager();
            em.merge(tes);
	}

	/**
	 * 
	 * @param tes
	 */
	public void addTesis(Tesis tes){
            EntityManager em = emf.createEntityManager();
            EntityTransaction trans = em.getTransaction();
            trans.begin();
            try {
                em.persist(tes);
                trans.commit();
                return tes.getIdTesis();
            } catch (Exception ex) {
                trans.rollback();
                throw new RuntimeException("Error al crear tesis");
            }
	}

}