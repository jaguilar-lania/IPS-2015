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
import rysi.monos.entity.InstitucionAdscripcion;

/**
 *
 * @author miguel
 */
public class InstitucionAdscripcionDAO {
    
    private EntityManagerFactory emf;
    
    public InstitucionAdscripcionDAO(){
            emf = Persistence.createEntityManagerFactory("BibliotecaVirtualPU");
    }
        
    public int insert(InstitucionAdscripcion inst) {
             EntityManager em = emf.createEntityManager();
            EntityTransaction trans = em.getTransaction();
            trans.begin();
            try{
                em.persist(inst);
                trans.commit();
            }catch(Exception ex){
                trans.rollback();
                throw new RuntimeException("Error al crear la Institucion de adscripcion");
            }
            return inst.getIdistitucionAdscripcion();
    }

    /**
     * 
     * @param inst
     */
    public void update(InstitucionAdscripcion inst){
        EntityManager em = emf.createEntityManager();
        em.persist(inst);
    }

    /**
     * 
     * @param inst
     */
    public void borrar(InstitucionAdscripcion inst){
         EntityManager em = emf.createEntityManager();
         em.remove(inst);
    }

    /**
     * 
     * @param idInstitucionAdscripcion
     */
    public InstitucionAdscripcion getPorId(int idInstitucionAdscripcion){
            EntityManager em = emf.createEntityManager();
            return em.find(InstitucionAdscripcion.class, idInstitucionAdscripcion);
    }

    public List<InstitucionAdscripcion> getTodos(){
            EntityManager em = emf.createEntityManager();
            return em.createQuery("Select inst from InstitucionAdscripcion inst").getResultList();
    }

    public long getConteoInstitucion(){
            EntityManager em = emf.createEntityManager();
            return (long)em.createQuery("Select count(inst) from InstitucionAdscripcion inst").getSingleResult();
    }

    /**
     * 
     * @param inst
     */
    public List<InstitucionAdscripcion> buscarPorNombre(String institucion){
             EntityManager em = emf.createEntityManager();
            return em.createQuery("Select inst from InstitucionAdscripcion inst where inst.nombre like :institucion")
                    .setParameter("institucion","%"+ institucion + "%")
                    .getResultList();
    }

    
}
