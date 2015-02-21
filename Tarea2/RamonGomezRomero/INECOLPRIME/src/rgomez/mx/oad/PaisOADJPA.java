/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.mx.oad;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import rgomez.mx.entidades.Pais;

/**
 *
 * @author Subli
 */
public class PaisOADJPA implements PaisOAD{
    
     private EntityManagerFactory entity;
     
     public PaisOADJPA(){
         entity = Persistence.createEntityManagerFactory("INECOLPRIMEPU");
     }

    @Override
    public void actualizar(Pais pais) {
        EntityManager emanager = entity.createEntityManager();
        emanager.merge(pais);
    }

    @Override
    public void borrar(Pais pais) {
        EntityManager emanager = entity.createEntityManager();
        emanager.remove(pais);
    }

    @Override
    public List<Pais> buscarPorNombre(String nombrePais) {
       EntityManager emanager = entity.createEntityManager();
       return emanager.createQuery("SELECT p FROM Pais p WHERE nombre LIKE :nombre")
               .setParameter("nombre", "%" + nombrePais + "%")
               .getResultList();
    }

    @Override
    public int crear(Pais pais) {
        EntityManager emanager = entity.createEntityManager();
         EntityTransaction transaccion = emanager.getTransaction();
         transaccion.begin();
         try{
             emanager.persist(pais);
             transaccion.commit();
             return pais.getIdpais();
         }catch(Exception e){
             transaccion.rollback();
             throw new RuntimeException("Error al crear la sugerencia");
         }
    }

    @Override
    public Pais getById(int idPais) {
        EntityManager emanager = entity.createEntityManager();
        return emanager.find(Pais.class, idPais);
    }

    @Override
    public List<Pais> getAll() {
        EntityManager emanager = entity.createEntityManager();
        return emanager.createQuery("SELECT p FROM Pais p").getResultList();
    }

    @Override
    public long getCountPais() {
        EntityManager emanager = entity.createEntityManager();
        return (long) emanager.createQuery("SELECT COUNT(p) FROM Pais p")
                .getSingleResult();
    }
    
}
