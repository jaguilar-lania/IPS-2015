package org.inecol.virtualmonkey.oad;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.inecol.virtualmonkey.entidades.Disciplina;

/**
 * @author Gudini
 * @version 1.0
 * @created 14-feb-2015 02:36:03 p.m.
 */
public class DisciplinaOADJPA extends DisciplinaOAD {

        private EntityManagerFactory emf;
    
	public DisciplinaOADJPA(){
            
            emf = Persistence.createEntityManagerFactory("ArticulosDatosPU");
            
	}

        @Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * @param dis
	 */
        @Override
	public void actualizar(Disciplina dis){
            EntityManager em = emf.createEntityManager();
            em.merge(dis);
	}

	/**
	 * @param dis
	 */
        @Override
	public void borrar(Disciplina tes){
            EntityManager em = emf.createEntityManager();
            em.remove(tes);
	}

	/**
	 * @param int
	 */
        @Override
	public Disciplina consultarPorId(int IdDisciplina){
		EntityManager em = emf.createEntityManager();
                return em.find(Disciplina.class, IdDisciplina);
	}

	/**
	 * @param nombre
	 */
        @Override
	public List<Disciplina> consultarPorNombre(String nombre){
		EntityManager em = emf.createEntityManager();
                return em.createQuery("SELECT dis FROM Disciplina dis WHERE nombre LIKE :nombre")
                    .setParameter("nombre", "%" + nombre + "%")
                    .getResultList();
	}

	/**
	 * @param dis
	 */
        @Override
	public List<Disciplina> consultarTodos(Disciplina dis){
		EntityManager em = emf.createEntityManager();
                return em.createQuery("SELECT dis FROM Disciplina dis").getResultList();
	}

	/**
	 * @param dis
         * @return 
	 */
        @Override
	public int crear(Disciplina dis){
            EntityManager em = emf.createEntityManager();
            EntityTransaction trans = em.getTransaction();
            trans.begin();
            try {
                em.persist(dis);
                trans.commit();
                return dis.getIdDisciplina();
            } catch (Exception ex) {
                trans.rollback();
                throw new RuntimeException("Error al crear tesis");
            }
	}

    @Override
    public long contarDisciplina() {
        EntityManager em = emf.createEntityManager();
        return (long) em.createQuery("SELECT COUNT(dis) FROM Disciplina dis")
                .getSingleResult();
    }

}