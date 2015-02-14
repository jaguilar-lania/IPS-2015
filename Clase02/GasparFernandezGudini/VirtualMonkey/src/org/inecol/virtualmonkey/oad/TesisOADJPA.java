package org.inecol.virtualmonkey.oad;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.inecol.virtualmonkey.entidades.Tesis;

/**
 * @author Gudini
 * @version 1.0
 * @created 14-feb-2015 02:36:03 p.m.
 */
public class TesisOADJPA extends TesisOAD {

        private EntityManagerFactory emf;
    
	public TesisOADJPA(){
            
            emf = Persistence.createEntityManagerFactory("ArticulosDatosPU");
            
	}

	public void finalize() throws Throwable {
		super.finalize();
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
	 * @param tes
	 */
	public void borrar(Tesis tes){
            EntityManager em = emf.createEntityManager();
            em.remove(tes);
	}

	/**
	 * 
	 * @param int
	 */
	public Tesis consultarPorId(int IdTesis){
		return null;
	}

	/**
	 * 
	 * @param nombre
	 */
	public List<Tesis> consultarPorNombre(String nombre){
		return null;
	}

	/**
	 * 
	 * @param tes
	 */
	public List<Tesis> consultarTodos(Tesis tes){
		return null;
	}

	/**
	 * 
	 * @param tes
         * @return 
	 */
        @Override
	public int crear(Tesis tes){
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