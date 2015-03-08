/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoaDatos;

import clasePrimate.Disciplina;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author REBECA
 */
public class DisciplinaOAD implements DisciplinaInt{
    
    private EntityManagerFactory emf;
    public DisciplinaOAD(){
        emf = Persistence.createEntityManagerFactory("PrimatesMexicanosPU");
    }
    
    @Override
    public boolean guardar(Disciplina d) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(d);
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
            throw new RuntimeException("Error al crear la Disciplina");
        }
    }

    @Override
    public boolean eliminar(Disciplina e) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.remove(em.find(Disciplina.class, e.getIdDisciplina()));
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
        }
        return false;
    }

    @Override
    public boolean actualizar(Disciplina a) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.merge(a);
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
            throw new RuntimeException("Error al crear la Disciplina");
        }
    }

    @Override
    public Disciplina getPorId(int Id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Disciplina.class, Id);
    }

    @Override
    public List<Disciplina> getTodos() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT dis FROM Disciplina dis").getResultList();
    }
}
