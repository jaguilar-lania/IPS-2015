/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.monos.dao;

import java.util.List;
import rysi.monos.entity.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author miguel
 */
public class TesisDAO {
    
    private EntityManagerFactory emf;
    
	public TesisDAO(){
            emf = Persistence.createEntityManagerFactory("BibliotecaVirtualPU");
	}
        
        public int insert(Tesis tes) {
            EntityManager em = emf.createEntityManager();
            EntityTransaction trans = em.getTransaction();
            try{
                em.persist(tes);
                trans.commit();
            }catch(Exception ex){
                trans.rollback();
                throw new RuntimeException("Error al crear la tesis");
            }
            return tes.getIdtesis();
	}

	/**
	 * 
	 * @param tes
	 */
	public void update(Tesis tes){
            EntityManager em = emf.createEntityManager();
            em.persist(tes);
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
	 * @param idTesis
	 */
	public Tesis getPorId(int idTesis){
                EntityManager em = emf.createEntityManager();
		return em.find(Tesis.class, idTesis);
	}

	public List<Tesis> getTodos(){
                EntityManager em = emf.createEntityManager();
		return em.createQuery("Select tes from Tesis tes").getResultList();
	}
        
        public long getConteoArticulos(){
                EntityManager em = emf.createEntityManager();
		return (long)em.createQuery("Select count(tes) from Tesis tes").getSingleResult();
	}

	/**
	 * 
	 * @param titulo
	 */
	public List<Tesis> buscarPorTitulo(String titulo){
		 EntityManager em = emf.createEntityManager();
		return em.createQuery("Select tes from Tesis tes where tes.titulo like :titulo")
                        .setParameter("titulo","%"+ titulo + "%")
                        .getResultList();
	}

        
        /**
	 * 
	 * @param autor
	 */
	public List<Tesis> buscarPorAutor(String autor){
		 EntityManager em = emf.createEntityManager();
		return em.createQuery("Select tes from Tesis tes where tes.autorTesis like :autor")
                        .setParameter("autor","%"+autor + "%")
                        .getResultList();
	}
    

}
