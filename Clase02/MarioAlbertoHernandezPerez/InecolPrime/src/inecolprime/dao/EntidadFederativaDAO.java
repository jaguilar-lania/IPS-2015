package inecolprime.dao;

import inecolprime.pojos.Municipio;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EntidadFederativaDAO implements CrudDAO{
    private EntityManagerFactory emf;
    
    public EntidadFederativaDAO(){
        emf = Persistence.createEntityManagerFactory("InecolPrimePU");
    }

    @Override
    public boolean create(Object o) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(o);
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
            throw new RuntimeException("No se puede registrar la Entidad Federativa");
        }
    }

    @Override
    public boolean update(Object o) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.merge(o);
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
            throw new RuntimeException("No se puede actualizar la Entidad Federativa");
        }
    }

    @Override
    public boolean delete(Object o) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.remove(o);
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
            throw new RuntimeException("No se puede eliminar la Entidad Federativa");
        }
    }

    @Override
    public Object getElement(Integer id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Municipio.class, id);
    }

    @Override
    public List<Object> getElements(String ids) {
        EntityManager em = emf.createEntityManager();
        String baseQuery = "SELECT e FROM Entidadfederativa e WHERE identidadfederativa IN (:param)";
        return em.createQuery(baseQuery).setParameter("param", ids).getResultList();
    }

    @Override
    public long countElements() {
        EntityManager em = emf.createEntityManager();
        return (long) em.createQuery("SELECT COUNT(e) FROM Entidadfederativa e").getSingleResult();
    }
}
