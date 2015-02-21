package org.inecol.virtualmonkey.oad;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.inecol.virtualmonkey.entidades.Primate;

/**
 * @author Gudini
 * @version 1.0
 * @created 14-feb-2015 02:36:03 p.m.
 */
public class PrimateOADJPA extends PrimateOAD {

        private EntityManagerFactory emf;
    
	public PrimateOADJPA(){
            
            emf = Persistence.createEntityManagerFactory("ArticulosDatosPU");
            
	}

        @Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * @param pri
	 */
        @Override
	public void actualizar(Primate pri){
            EntityManager em = emf.createEntityManager();
            em.merge(pri);
	}

	/**
	 * @param pri
	 */
        @Override
	public void borrar(Primate pri){
            EntityManager em = emf.createEntityManager();
            em.remove(pri);
	}

	/**
	 * @param int
	 */
        @Override
	public Primate consultarPorId(int IdPrimate){
		EntityManager em = emf.createEntityManager();
                return em.find(Primate.class, IdPrimate);
	}

	/**
	 * @param nombre
	 */
        @Override
	public List<Primate> consultarPorNombre(String nombre){
		EntityManager em = emf.createEntityManager();
                return em.createQuery("SELECT pri FROM Primate pri WHERE nombre LIKE :nombre")
                    .setParameter("nombre", "%" + nombre + "%")
                    .getResultList();
	}

	/**
	 * @param pri
	 */
        @Override
	public List<Primate> consultarTodos(Primate pri){
		EntityManager em = emf.createEntityManager();
                return em.createQuery("SELECT pri FROM Primate pri").getResultList();
	}

	/**
	 * @param pri
         * @return 
	 */
        @Override
	public int crear(Primate pri){
            EntityManager em = emf.createEntityManager();
            EntityTransaction trans = em.getTransaction();
            trans.begin();
            try {
                em.persist(pri);
                trans.commit();
                return pri.getIdPrimates();
            } catch (Exception ex) {
                trans.rollback();
                throw new RuntimeException("Error al crear tesis");
            }
	}

    @Override
    public long contarPrimate() {
        EntityManager em = emf.createEntityManager();
        return (long) em.createQuery("SELECT COUNT(pri) FROM Primate pri")
                .getSingleResult();
    }

}