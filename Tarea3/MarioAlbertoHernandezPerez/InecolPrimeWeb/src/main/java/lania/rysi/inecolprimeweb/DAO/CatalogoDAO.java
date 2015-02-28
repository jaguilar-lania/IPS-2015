/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lania.rysi.inecolprimeweb.dao;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import lania.rysi.inecolprimeweb.EO.Catalogo;

/**
 *
 * @author Frost
 */
public class CatalogoDAO implements CrudDAO {
    private EntityManagerFactory emf;
    
    public CatalogoDAO(){
        emf = Persistence.createEntityManagerFactory("InecolPrimeWebPU");
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
            throw new RuntimeException("No se puede registrar el Catálogo");
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
            throw new RuntimeException("No se puede actualizar el Catálogo");
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
            throw new RuntimeException("No se puede eliminar el Catálogo");
        }
    }

    @Override
    public Object getElement(Integer id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Catalogo.class, id);
    }

    @Override
    public List<Object> getElements(String ids) {
        EntityManager em = emf.createEntityManager();
        if(ids!=null && !ids.isEmpty()){
            String baseQuery = "SELECT c FROM Catalogo c WHERE idcatalogo IN (:param)";
            return em.createQuery(baseQuery).setParameter("param", ids).getResultList();
        }else{
            String baseQuery = "SELECT c FROM Catalogo c";
            return em.createQuery(baseQuery).getResultList();
        }
    }

    @Override
    public long countElements() {
        EntityManager em = emf.createEntityManager();
        return (Long) em.createQuery("SELECT COUNT(c) FROM Catalogo c").getSingleResult();
    }
}
