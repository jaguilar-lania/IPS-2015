/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoaDatos;


import clasePrimate.Especieprimate;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



/**
 *
 * @author REBECA
 */
public class PrimatesOAD implements PrimatesInt{

    private EntityManagerFactory emf;
    public PrimatesOAD(){
        emf = Persistence.createEntityManagerFactory("PrimatesMexicanosPU");
    }
    
    @Override
    public boolean guardar(Especieprimate d) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(d);
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
            throw new RuntimeException("Error al crear la Especie de primate");
        }
    }

    @Override
    public boolean eliminar(Especieprimate e) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.remove(em.find(Especieprimate.class, e.getIdPrimate()));
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
        }
        return false;
    }

    @Override
    public boolean actualizar(Especieprimate a) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.merge(a);
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
            throw new RuntimeException("Error al crear la Especie de primate");
        }
    }

    @Override
    public Especieprimate getPorId(int Id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Especieprimate.class, Id);
    }

    @Override
    public List<Especieprimate> getTodos() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT prim FROM Especieprimate prim").getResultList();
    }
}
