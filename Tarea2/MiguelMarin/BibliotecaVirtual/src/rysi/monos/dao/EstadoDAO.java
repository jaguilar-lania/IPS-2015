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
import rysi.monos.entity.Estado;

/**
 *
 * @author miguel
 */
public class EstadoDAO {
    private EntityManagerFactory emf;
    
	public EstadoDAO(){
            emf = Persistence.createEntityManagerFactory("BibliotecaVirtualPU");
	}
        
        public int insert(Estado est) {
            EntityManager em = emf.createEntityManager();
            EntityTransaction trans = em.getTransaction();
            trans.begin();
            try{
                em.persist(est);
                trans.commit();
            }catch(Exception ex){
                trans.rollback();
                throw new RuntimeException("Error al crear la estado");
            }
            return est.getIdestado();
	}

	/**
	 * 
	 * @param est
	 */
	public void update(Estado est){
            EntityManager em = emf.createEntityManager();
            em.persist(est);
	}

	/**
	 * 
	 * @param est
	 */
	public void borrar(Estado est){
             EntityManager em = emf.createEntityManager();
	     em.remove(est);
	}

	/**
	 * 
	 * @param idEstado
	 */
	public Estado getPorId(int idEstado){
                EntityManager em = emf.createEntityManager();
		return em.find(Estado.class, idEstado);
	}

	public List<Estado> getTodos(){
                EntityManager em = emf.createEntityManager();
		return em.createQuery("Select est from Estado est").getResultList();
	}
        
        public long getConteoSubdisciplina(){
                EntityManager em = emf.createEntityManager();
		return (long)em.createQuery("Select count(est) from Estado est").getSingleResult();
	}

	/**
	 * 
	 * @param estado
	 */
	public List<Estado> buscarPorNombre(String estado){
		 EntityManager em = emf.createEntityManager();
		return em.createQuery("Select est from Estado est where est.nombre like :estado")
                        .setParameter("estado","%"+ estado + "%")
                        .getResultList();
	}
}
