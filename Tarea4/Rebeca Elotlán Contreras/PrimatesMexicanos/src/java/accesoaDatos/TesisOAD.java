/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoaDatos;

import clasePrimate.Tesis;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author REBECA
 */
public class TesisOAD implements TesisInt{

   private EntityManagerFactory emf;
    public TesisOAD(){
        emf = Persistence.createEntityManagerFactory("PrimatesMexicanosPU");
    }
    
    @Override
    public boolean guardar(Tesis d) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(d);
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
            throw new RuntimeException("Error al crear Tesis");
        }
    }

    @Override
    public boolean eliminar(Tesis e) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.remove(em.find(Tesis.class, e.getIdTesis()));
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
        }
        return false;
    }

    @Override
    public boolean actualizar(Tesis a) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.merge(a);
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
            throw new RuntimeException("Error al crear Tesis");
        }
    }

    @Override
    public Tesis getPorId(int Id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Tesis.class, Id);
    }

    @Override
    public List<Tesis> getTodos() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT tes FROM Tesis tes").getResultList();
    }
}
