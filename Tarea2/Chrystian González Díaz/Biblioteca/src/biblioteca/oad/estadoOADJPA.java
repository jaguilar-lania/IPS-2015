/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.oad;

import biblioteca.entidades.Estado;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Chrys
 */
public class estadoOADJPA  implements estadoOAD{
    
    private EntityManagerFactory emf;

    public estadoOADJPA() {
        emf = Persistence.createEntityManagerFactory("EstadoDatosPU");
    }
    
    public void actualizar(Estado edo) {
        EntityManager em = emf.createEntityManager();
        em.merge(edo);
    }
    
    public void borrar(Estado edo) {
        EntityManager em = emf.createEntityManager();
        em.remove(edo);
    }
    
    public void borrar(int idEstado) {

    }
    
    
    public List<Estado> buscarPorNombre(String cadena) {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT nom_estado FROM Estado edo WHERE nom_estado LIKE :nombre")
                .setParameter("nombre", "%" + cadena + "%")
                .getResultList();
    }
    
    public int crear(Estado edo) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(edo);
            trans.commit();
            return edo.getIdEstado();
        } catch (Exception ex) {
            trans.rollback();
            throw new RuntimeException("Error al crear articulo");
        }
    }
    
    public Estado getPorId(int idPais) {
        EntityManager em = emf.createEntityManager();
        return em.find(Estado.class, idPais);
    }
    
    public List<Estado> getTodos() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT edo FROM Estado edo").getResultList();
    }
    
    public long getConteoEstado() {
        EntityManager em = emf.createEntityManager();
        return (long) em.createQuery("SELECT COUNT(edo) FROM Estado edo")
                .getSingleResult();
    }
    
    
}
