package org.inecol.virtualmonkey.oad;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.inecol.virtualmonkey.entidades.Pais;

/**
 * @author Gudini
 * @version 1.0
 * @created 14-feb-2015 02:36:03 p.m.
 */
public class PaisOADJPA extends PaisOAD {

        private EntityManagerFactory emf;
    
	public PaisOADJPA(){
            
            emf = Persistence.createEntityManagerFactory("ArticulosDatosPU");
            
	}

        @Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * @param pais
	 */
        @Override
	public void actualizar(Pais pais){
            EntityManager em = emf.createEntityManager();
            em.merge(pais);
	}

	/**
	 * @param pais
	 */
        @Override
	public void borrar(Pais pais){
            EntityManager em = emf.createEntityManager();
            em.remove(pais);
	}

	/**
	 * @param int
	 */
        @Override
	public Pais consultarPorId(int IdPais){
		EntityManager em = emf.createEntityManager();
                return em.find(Pais.class, IdPais);
	}

	/**
	 * @param nombre
	 */
        @Override
	public List<Pais> consultarPorNombre(String nombre){
		EntityManager em = emf.createEntityManager();
                return em.createQuery("SELECT pais FROM Pais pais WHERE nombre LIKE :nombre")
                    .setParameter("nombre", "%" + nombre + "%")
                    .getResultList();
	}

	/**
	 * @param pais
	 */
        @Override
	public List<Pais> consultarTodos(Pais pais){
		EntityManager em = emf.createEntityManager();
                return em.createQuery("SELECT pais FROM Pais pais").getResultList();
	}

	/**
	 * @param pais
         * @return 
	 */
        @Override
	public int crear(Pais pais){
            EntityManager em = emf.createEntityManager();
            EntityTransaction trans = em.getTransaction();
            trans.begin();
            try {
                em.persist(pais);
                trans.commit();
                return pais.getIdPais();
            } catch (Exception ex) {
                trans.rollback();
                throw new RuntimeException("Error al crear tesis");
            }
	}

    @Override
    public long contarPais() {
        EntityManager em = emf.createEntityManager();
        return (long) em.createQuery("SELECT COUNT(pais) FROM Pais pais")
                .getSingleResult();
    }

}