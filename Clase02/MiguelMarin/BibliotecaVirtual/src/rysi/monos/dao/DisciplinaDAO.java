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
import rysi.monos.entity.Disciplina;

/**
 *
 * @author miguel
 */
public class DisciplinaDAO {
    
    private EntityManagerFactory emf;
    
	public DisciplinaDAO(){
            emf = Persistence.createEntityManagerFactory("BibliotecaVirtualPU");
	}
        
        public int insert(Disciplina disc) {
            EntityManager em = emf.createEntityManager();
            EntityTransaction trans = em.getTransaction();
            try{
                em.persist(disc);
                trans.commit();
            }catch(Exception ex){
                trans.rollback();
                throw new RuntimeException("Error al crear la disciplina");
            }
            return disc.getIddisciplina();
	}

	/**
	 * 
	 * @param disc
	 */
	public void update(Disciplina disc){
            EntityManager em = emf.createEntityManager();
            em.persist(disc);
	}

	/**
	 * 
	 * @param disc
	 */
	public void borrar(Disciplina disc){
             EntityManager em = emf.createEntityManager();
	     em.remove(disc);
	}

	/**
	 * 
	 * @param idDisciplina
	 */
	public Disciplina getPorId(int idDisciplina){
                EntityManager em = emf.createEntityManager();
		return em.find(Disciplina.class, idDisciplina);
	}

	public List<Disciplina> getTodos(){
                EntityManager em = emf.createEntityManager();
		return em.createQuery("Select disc from Disciplina disc").getResultList();
	}
        
        public long getConteoArticulos(){
                EntityManager em = emf.createEntityManager();
		return (long)em.createQuery("Select count(disc) from Disciplina disc").getSingleResult();
	}

	/**
	 * 
	 * @param disciplina
	 */
	public List<Disciplina> buscarPorNombre(String disciplina){
		 EntityManager em = emf.createEntityManager();
		return em.createQuery("Select disc from Disciplina disc where disc.disciplina like :disciplina")
                        .setParameter("disciplina","%"+ disciplina + "%")
                        .getResultList();
	}

        
        

    
}
