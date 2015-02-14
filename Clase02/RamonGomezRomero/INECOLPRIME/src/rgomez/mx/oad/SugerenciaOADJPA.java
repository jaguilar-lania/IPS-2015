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
import rgomez.mx.entidades.Sugerencia;

/**
 *
 * @author Subli
 */
public class SugerenciaOADJPA implements SugerenciaOAD{

    private EntityManagerFactory entity;
    
    public SugerenciaOADJPA(){
        entity = Persistence.createEntityManagerFactory("INECOLPRIMEPU");
    }
    
     @Override
    public int crear(Sugerencia sugerencia) {
         EntityManager emanager = entity.createEntityManager();
         EntityTransaction transaccion = emanager.getTransaction();
         transaccion.begin();
         try{
             emanager.persist(sugerencia);
             transaccion.commit();
             return sugerencia.getIdsugerencia();
         }catch(Exception e){
             transaccion.rollback();
             throw new RuntimeException("Error al crear la sugerencia");
         }
    }
    
    @Override
    public void actualizar(Sugerencia sugerencia) {
        EntityManager emanager = entity.createEntityManager();
        emanager.merge(sugerencia);
    }

    @Override
    public void borrar(Sugerencia sugerencia) {
        EntityManager emanager = entity.createEntityManager();
        emanager.remove(sugerencia);
    }

    @Override
    public List<Sugerencia> buscarPorSugerencia(String sugerencia) {
       EntityManager emanager = entity.createEntityManager();
       return emanager.createQuery("SELECT sug FROM Sugerencia sug WHERE sugerencia LIKE :sugerencia")
               .setParameter("sugerencia", "%" + sugerencia + "%")
               .getResultList();
    }

    @Override
    public Sugerencia getById(int idSugerencia) {
        // EntityManager emanager = entity.createEntityManager();
         EntityManager emanager = entity.createEntityManager();
        return emanager.find(Sugerencia.class, idSugerencia);
    }

    @Override
    public List<Sugerencia> getAll() {
        EntityManager emanager = entity.createEntityManager();
        return emanager.createQuery("SELECT surg FROM Sugerencia surg").getResultList();
    }

    @Override
    public long getCountSugerencias() {
        EntityManager emanager = entity.createEntityManager();
        return (long) emanager.createQuery("SELECT COUNT(surg) FROM Sugerencia surg")
                .getSingleResult();
    }
    
}
