/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import rysi.tesis.entidades.Tesis;

/**
 *
 * @author Anny
 */
public class TesisDAOJPA implements TesisDAO {
    
    private EntityManagerFactory emf;

    public TesisDAOJPA(){
        emf = Persistence.createEntityManagerFactory("VirtualMonkeyPU");
    }

    @Override
    public void crearTesis(Tesis art) {
        EntityManager em = emf.createEntityManager();
            EntityTransaction trans = em.getTransaction();
            trans.begin();
            try {
                
                em.persist(art);
                trans.commit();
                //return art;
            } catch (Exception ex) {
                trans.rollback();
            throw new RuntimeException("Error al registrar la Tesis");
            }
    }

    @Override
    public void modificarTesis(Tesis art) {
         EntityManager em = emf.createEntityManager();
         EntityTransaction trans = em.getTransaction();
         trans.begin();
         try {
            em.merge(art);
            trans.commit();
         } catch (Exception ex) {
             trans.rollback();
             throw new RuntimeException("Error al actualizar la Tesis");
         }
        
    }

    @Override
    public void eliminarTesis(Tesis art) {
        EntityManager em = emf.createEntityManager();
        Tesis myEntity = em.merge(art);
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.remove(myEntity);
            trans.commit();
        }
        catch (Exception ex){
            trans.rollback();
            throw new RuntimeException("Error al eliminar la Tesis");
        }
       
    }
    
       
    @Override
    public void eliminarTesis(int idTesis) {
        EntityManager em = emf.createEntityManager();
        TesisDAO tesisDAO1 = new TesisDAOJPA();
        Tesis myEntity = em.merge(tesisDAO1.getTesisPorId(idTesis));
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.remove(myEntity);
            trans.commit();
        }
        catch (Exception ex){
            trans.rollback();
            throw new RuntimeException("Error al eliminar la Tesis");
        }
        
    }
    
    public Tesis getTesisPorId(int idTesis) {
        EntityManager em = emf.createEntityManager();
        return em.find(Tesis.class, idTesis);
    }

    public List<Tesis> getTodos() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT art FROM Tesis art").getResultList();
    }
    
    public List<Tesis> getBusquedaAvanzada(campoBusqueda campo, String cadena){
        EntityManager em = emf.createEntityManager();
        
        return em.createQuery("SELECT art FROM Tesis art WHERE art.titulo LIKE :titulo")
                .setParameter("titulo", "%" + cadena + "%")
                .getResultList();
        
        
        
    }
    
}
