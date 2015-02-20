package rysi.proyecto.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import rysi.proyecto.entidades.Comentario;



/**
 * @author jaguilera
 * @version 1.0
 * @created 15-feb.-2015 20:26:33
 */
public class ComentariosOADJPA implements ComentariosDAO {
    
        private EntityManagerFactory emf;

	public ComentariosOADJPA(){
            emf = Persistence.createEntityManagerFactory("ExamenPU");
	}

	/**
	 * 
	 * @param com
	 */
	public void actualizar(Comentario com){
            EntityManager em = emf.createEntityManager();
            em.merge(com);
	}

	/**
	 * 
	 * @param com
	 */
	public void borrar(Comentario com){
            EntityManager em = emf.createEntityManager();
            em.remove(com);
	}

	/**
	 * 
	 * @param idComentario
	 */
	public void borrar(int idComentario){
            EntityManager em = emf.createEntityManager();
            em.remove(idComentario);
	}

	/**
	 * 
	 * @param IdTesis
	 */
	public Comentario buscarPorIdTesis(int IdTesis){
            EntityManager em = emf.createEntityManager();
            return em.find(Comentario.class, IdTesis);
	}

	/**
	 * 
	 * @param com
	 */
	public int crear(Comentario com){
            EntityManager em = emf.createEntityManager();
            EntityTransaction trans = em.getTransaction();
            trans.begin();
            try {
                em.persist(com);
                trans.commit();
                return com.getIdcomentario();
            } catch (Exception ex) {
                trans.rollback();
                throw new RuntimeException("Error al crear Comentario");
            }

	}

	/**
	 * 
	 * @param idComentario
	 */
	public Comentario getPorIdComentario(int idComentario){
            EntityManager em = emf.createEntityManager();
            return em.find(Comentario.class, idComentario);
	}

	public List<Comentario> getTodos(){
            EntityManager em = emf.createEntityManager();
            return em.createQuery("SELECT com FROM Comentario com").getResultList();
	}

}