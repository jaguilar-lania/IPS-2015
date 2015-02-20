/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.monos.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import rysi.monos.entity.Subdisciplina;

/**
 *
 * @author miguel
 */
public class SubdisciplinaDAO {
     private EntityManagerFactory emf;
    
	public SubdisciplinaDAO(){
            emf = Persistence.createEntityManagerFactory("BibliotecaVirtualPU");
	}
        
        public int insert(Subdisciplina sub) {
            EntityManager em = emf.createEntityManager();
            EntityTransaction trans = em.getTransaction();
            trans.begin();
            try{
                em.persist(sub);
                trans.commit();
            }catch(Exception ex){
                trans.rollback();
                throw new RuntimeException("Error al crear la subdisciplina");
            }
            return sub.getIdsubdisciplina();
	}

	/**
	 * 
	 * @param sub
	 */
	public void update(Subdisciplina sub){
            EntityManager em = emf.createEntityManager();
            em.persist(sub);
	}

	/**
	 * 
	 * @param sub
	 */
	public void borrar(Subdisciplina sub){
             EntityManager em = emf.createEntityManager();
	     em.remove(sub);
	}

	/**
	 * 
	 * @param idSubdisciplina
	 */
	public Subdisciplina getPorId(int idSubdisciplina){
                EntityManager em = emf.createEntityManager();
		return em.find(Subdisciplina.class, idSubdisciplina);
	}

	public List<Subdisciplina> getTodos(){
                EntityManager em = emf.createEntityManager();
		return em.createQuery("Select sub from Subdisciplina sub").getResultList();
	}
        
        public long getConteoSubdisciplina(){
                EntityManager em = emf.createEntityManager();
		return (long)em.createQuery("Select count(sub) from Subdisciplina sub").getSingleResult();
	}

	/**
	 * 
	 * @param subdisciplina
	 */
	public List<Subdisciplina> buscarPorNombre(String subdisciplina){
		 EntityManager em = emf.createEntityManager();
		return em.createQuery("Select sub from Subdisciplina sub where sub.nombre like :subdisciplina")
                        .setParameter("subdisciplina","%"+ subdisciplina + "%")
                        .getResultList();
	}
}
