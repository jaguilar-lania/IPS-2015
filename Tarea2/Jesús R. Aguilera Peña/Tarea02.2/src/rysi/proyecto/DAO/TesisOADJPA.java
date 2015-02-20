package rysi.proyecto.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import rysi.proyecto.entidades.Tesis;

/**
 * @author jaguilera
 * @version 1.0
 * @created 15-feb.-2015 16:50:31
 */
public class TesisOADJPA implements TesisDAO {
    
        private EntityManagerFactory emf;

	public TesisOADJPA(){
            emf = Persistence.createEntityManagerFactory("ExamenPU");
	}

	/**
	 * 
	 * @param tes
	 */
	public void actualizar(Tesis tes){
            EntityManager em = emf.createEntityManager();
            em.merge(tes);
	}

	/**
	 * 
	 * @param idTesis
	 */
	public void borrar(int idTesis){
            EntityManager em = emf.createEntityManager();
            em.remove(idTesis);
	}

	/**
	 * 
	 * @param tes
	 */
	public void borrar(Tesis tes){
            EntityManager em = emf.createEntityManager();
            em.remove(tes);
	}

	/**
	 * 
	 * @param tes
	 */
	public int crear(Tesis tes){
            EntityManager em = emf.createEntityManager();
            EntityTransaction trans = em.getTransaction();
            trans.begin();
            try {
                em.persist(tes);
                trans.commit();
                return tes.getIdtesis();
            } catch (Exception ex) {
                trans.rollback();
                throw new RuntimeException("Error al crear Tesis");
            }         
	}

	/**
	 * 
	 * @param idTesis
	 */
	public Tesis getPorId(int idTesis){
            EntityManager em = emf.createEntityManager();
            return em.find(Tesis.class, idTesis);
	}

	public List<Tesis> getTodos(){
            EntityManager em = emf.createEntityManager();
            return em.createQuery("SELECT tes FROM Tesis tes").getResultList();
	}

	/**
	 * 
	 * @param Titulo
	 */
	public List<Tesis> buscarPorTitulo(String Titulo){
            EntityManager em = emf.createEntityManager();            
            return em.createQuery("SELECT tes FROM Tesis tes WHERE titulo LIKE :titulo")
                    .setParameter("titulo", "%" + Titulo + "%")
                    .getResultList();
	}

}