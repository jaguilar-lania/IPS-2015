/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ips.lania.dao;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import ips.lania.entity.Catalogo;

/**
 *
 * @author Frost
 */
public class CatalogoDAO implements CrudDAO<Catalogo> {
    private EntityManagerFactory emf;
    
    public CatalogoDAO(){
        emf = Persistence.createEntityManagerFactory("ProyectoFinalPU");
    }

    @Override
    public boolean create(Catalogo o) {
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
    public boolean update(Catalogo o) {
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
    public boolean delete(Catalogo o) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.remove(em.find(Catalogo.class, o.getIdcatalogo()));
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
        }
        return false;
    }

    @Override
    public Catalogo getElement(Integer id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Catalogo.class, id);
    }

    @Override
    public List<Catalogo> getElements(String ids) {
        EntityManager em = emf.createEntityManager();
        if(ids!=null && !ids.isEmpty()){
            String baseQuery = "SELECT c FROM Catalogo c WHERE c.idcatalogo IN (:param)";
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
    
    public List<Catalogo> getCategorias() {
        EntityManager em = emf.createEntityManager();
        String baseQuery = "SELECT c FROM Catalogo c WHERE c.idcategoria IS NULL";
        return em.createQuery(baseQuery).getResultList();
    }
    
    public List<Catalogo> getElementsByIdcategoria(int idcat) {
        EntityManager em = emf.createEntityManager();
        if(idcat>0){
            String baseQuery = "SELECT c FROM Catalogo c WHERE c.idcategoria = :param";
            return em.createQuery(baseQuery).setParameter("param", idcat).getResultList();
        }else{
            String baseQuery = "SELECT c FROM Catalogo c";
            return em.createQuery(baseQuery).getResultList();
        }
    }
    
    public List<Catalogo> getElementsByFilter(Catalogo fil) {
        EntityManager em = emf.createEntityManager();
        if(fil!=null && (fil.getNombre()!=null || fil.getIdcategoria()!=null)){
            String wherepart = "";
            if(fil.getNombre()!=null && !fil.getNombre().isEmpty()){
                wherepart = " WHERE c.nombre LIKE '%"+fil.getNombre()+"%'";
            }
            if(fil.getIdcategoria()!=null){
                wherepart = ((wherepart.isEmpty())?" WHERE ":" AND ")+"c.idcategoria = "+fil.getIdcategoria();
            }
            String baseQuery = "SELECT c FROM Catalogo c"+wherepart;
            return em.createQuery(baseQuery).getResultList();
        }else{
            String baseQuery = "SELECT c FROM Catalogo c";
            return em.createQuery(baseQuery).getResultList();
        }
    }
}
