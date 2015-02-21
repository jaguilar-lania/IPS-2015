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
import rgomez.mx.entidades.Entidadfederativa;

/**
 *
 * @author Subli
 */
public class EntidadFederativaOADJPA implements EntidadFederativaOAD{

    private EntityManagerFactory entity;
    
    public EntidadFederativaOADJPA(){
        entity = Persistence.createEntityManagerFactory("INECOLPRIMEPU");
    }
    
    @Override
    public void actualizar(Entidadfederativa ef) {
        EntityManager emanager = entity.createEntityManager();
        emanager.merge(ef);
    }

    @Override
    public void borrar(Entidadfederativa ef) {
        EntityManager emanager = entity.createEntityManager();
        emanager.remove(ef);
    }

    @Override
    public List<Entidadfederativa> buscarPorNombre(String nombreEntidad) {
        EntityManager emanager = entity.createEntityManager();
       return emanager.createQuery("SELECT ef FROM Entidadfederativa ef WHERE nombre LIKE :nombre")
               .setParameter("nombre", "%" + nombreEntidad + "%")
               .getResultList();
    }

    @Override
    public int crear(Entidadfederativa ef) {
        EntityManager emanager = entity.createEntityManager();
         EntityTransaction transaccion = emanager.getTransaction();
         transaccion.begin();
         try{
             emanager.persist(ef);
             transaccion.commit();
             return ef.getIdentidadfederativa();
         }catch(Exception e){
             transaccion.rollback();
             throw new RuntimeException("Error al crear la sugerencia");
         }
    }

    @Override
    public Entidadfederativa getById(int idEntidadFederativa) {
         EntityManager emanager = entity.createEntityManager();
        return emanager.find(Entidadfederativa.class, idEntidadFederativa);
    }

    @Override
    public List<Entidadfederativa> getAll() {
        EntityManager emanager = entity.createEntityManager();
        return emanager.createQuery("SELECT ef FROM Entidadfederativa ef").getResultList();
    }

    @Override
    public long getCountEntidades() {
        EntityManager emanager = entity.createEntityManager();
        return (long) emanager.createQuery("SELECT COUNT(ef) FROM Entidadfederativa ef")
                .getSingleResult();
    }
    
}
