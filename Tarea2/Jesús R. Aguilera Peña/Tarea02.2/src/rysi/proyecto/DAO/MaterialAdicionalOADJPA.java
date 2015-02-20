package rysi.proyecto.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import rysi.proyecto.entidades.Materialadicional;

/**
 * @author jaguilera
 * @version 1.0
 * @created 19-feb.-2015 21:02:16
 */
public class MaterialAdicionalOADJPA implements MaterialAdicionalDAO {
    
        private EntityManagerFactory emf;

	public MaterialAdicionalOADJPA(){
            emf = Persistence.createEntityManagerFactory("ExamenPU");
	}

	/**
	 * 
	 * @param mad
	 */
	public void actualizar(Materialadicional mad){
            EntityManager em = emf.createEntityManager();
            em.merge(mad);
	}

	/**
	 * 
	 * @param idmaterial
	 */
	public void borrar(int idmaterial){
            EntityManager em = emf.createEntityManager();
            em.remove(idmaterial);
	}

	/**
	 * 
	 * @param mad
	 */
	public void borrar(Materialadicional mad){
            EntityManager em = emf.createEntityManager();
            em.remove(mad);
	}

	/**
	 * 
	 * @param IdTesis
	 */
	public List<Materialadicional> buscarPorIdTesis(int idtesis){
            EntityManager em = emf.createEntityManager();
            return em.createQuery("SELECT mad FROM Materialadicional mad WHERE idtesis LIKE :idtesis")
                    .setParameter("idtesis", "%" + idtesis + "%")
                    .getResultList();
        }

	/**
	 * 
	 * @param mad
	 */
	public int crear(Materialadicional mad){
            EntityManager em = emf.createEntityManager();
            EntityTransaction trans = em.getTransaction();
            trans.begin();
            try {
                em.persist(mad);
                trans.commit();
                return mad.getIdmaterial();
            } catch (Exception ex) {
                trans.rollback();
                throw new RuntimeException("Error al crear Material Adicional");
            }
	}

	/**
	 * 
	 * @param idmaterial
	 */
	public Materialadicional getPorIdComentario(int idmaterial){
            EntityManager em = emf.createEntityManager();
            return em.find(Materialadicional.class, idmaterial);
	}

	public List<Materialadicional> getTodos(){
            EntityManager em = emf.createEntityManager();
            return em.createQuery("SELECT mad FROM Materialadicional mad").getResultList();
	}

}