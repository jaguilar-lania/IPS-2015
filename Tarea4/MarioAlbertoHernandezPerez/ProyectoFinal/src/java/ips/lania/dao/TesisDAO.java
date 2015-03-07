package ips.lania.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import ips.lania.entity.Tesis;

public class TesisDAO implements CrudDAO<Tesis>{
    private EntityManagerFactory emf;
    
    public TesisDAO(){
        emf = Persistence.createEntityManagerFactory("ProyectoFinalPU");
    }

    @Override
    public boolean create(Tesis o) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(o);
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
            throw new RuntimeException("No se puede registrar la tesis");
        }
    }

    @Override
    public boolean update(Tesis o) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.merge(o);
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
            throw new RuntimeException("No se puede actualizar la tesis");
        }
    }

    @Override
    public boolean delete(Tesis o) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.remove(em.find(Tesis.class, o.getIdtesis()));
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
        }
        return false;
    }

    @Override
    public Tesis getElement(Integer id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Tesis.class, id);
    }

    @Override
    public List<Tesis> getElements(String ids) {
        EntityManager em = emf.createEntityManager();
        String baseQuery = "SELECT t FROM Tesis t WHERE t.idtesis IN (:param)";
        return em.createQuery(baseQuery).setParameter("param", ids).getResultList();
    }

    @Override
    public long countElements() {
        EntityManager em = emf.createEntityManager();
        return (Long) em.createQuery("SELECT COUNT(t) FROM Tesis t").getSingleResult();
    }
    
    public List<Tesis> getElementsByFilter(Tesis fil) {
        EntityManager em = emf.createEntityManager();
        if(fil!=null && (fil.getTitulo()!=null || fil.getIdinstitucion()!=null)){
            String wherepart = "";
            if(fil.getTitulo()!=null && !fil.getTitulo().isEmpty()){
                wherepart = " WHERE t.titulo LIKE '%"+fil.getTitulo()+"%'";
            }
            if(fil.getIdinstitucion()!=null){
                wherepart = ((wherepart.isEmpty())?" WHERE ":" AND ")+"t.idinstitucion = "+fil.getIdinstitucion();
            }
            String baseQuery = "SELECT t FROM Tesis t"+wherepart;
            return em.createQuery(baseQuery).getResultList();
        }else{
            String baseQuery = "SELECT t FROM Tesis t";
            return em.createQuery(baseQuery).getResultList();
        }
    }
}
