/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bvirtual.oad;

import bvirtual.entidades.MdPais;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
/**
 *
 * @author Chrys
 */
public class PaisOADJPA implements PaisOAD{
    
    private EntityManagerFactory emf;
    
    public PaisOADJPA() {
        emf = Persistence.createEntityManagerFactory("PaisDatosPU");
    }
    
    public void actualizar(MdPais pais) {
        EntityManager em = emf.createEntityManager();
        em.merge(pais);
    }
    
    public void borrar(MdPais pais) {
        EntityManager em = emf.createEntityManager();
        em.remove(pais);
    }
    
    public List<MdPais> buscarPorNombre(String cadena) {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT pais FROM MdPais art WHERE nombre LIKE :nombre")
                .setParameter("nombre", "%" + cadena + "%")
                .getResultList();
    }
    
    public int crear(MdPais pais) {
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
    
    
    @Override
    public long getConteoArticulos() {
        EntityManager em = emf.createEntityManager();
        return (long) em.createQuery("SELECT COUNT(pais) FROM MdPais pais")
                .getSingleResult();
    }
    
    
}
