/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.oad;

import biblioteca.entidades.Pais;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Chrys
 */
public class paisOADJPA  implements paisOAD{
    
    private EntityManagerFactory emf;

    public paisOADJPA() {
        emf = Persistence.createEntityManagerFactory("PaisDatosPU");
    }
    
    public void actualizar(Pais pais) {
        EntityManager em = emf.createEntityManager();
        em.merge(pais);
    }
    
    public void borrar(Pais pais) {
        EntityManager em = emf.createEntityManager();
        em.remove(pais);
    }
    
    public void borrar(int idPais) {

    }
    
    
    public List<Pais> buscarPorNombre(String cadena) {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT pais FROM Pais art WHERE nombre LIKE :nombre")
                .setParameter("nombre", "%" + cadena + "%")
                .getResultList();
    }
    
    public int crear(Pais pais) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(pais);
            trans.commit();
            return pais.getIdPais();
        } catch (Exception ex) {
            trans.rollback();
            throw new RuntimeException("Error al crear articulo");
        }
    }
    
    public Pais getPorId(int idPais) {
        EntityManager em = emf.createEntityManager();
        return em.find(Pais.class, idPais);
    }
    
    public List<Pais> getTodos() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT pa FROM Pais pa").getResultList();
    }
    
    public long getConteoPais() {
        EntityManager em = emf.createEntityManager();
        return (long) em.createQuery("SELECT COUNT(pa) FROM Pais pa")
                .getSingleResult();
    }
    
    
}
