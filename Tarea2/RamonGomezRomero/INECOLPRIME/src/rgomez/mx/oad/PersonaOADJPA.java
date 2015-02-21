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
import rgomez.mx.entidades.Persona;

/**
 *
 * @author Subli
 */
public class PersonaOADJPA implements PersonaOAD{

    private EntityManagerFactory entity;
    
    public PersonaOADJPA(){
        entity = Persistence.createEntityManagerFactory("INECOLPRIMEPU");
    }
    
    @Override
    public void actualizar(Persona per) {
        EntityManager emanager = entity.createEntityManager();
        emanager.merge(per);
    }

    @Override
    public void borrar(Persona per) {
        EntityManager emanager = entity.createEntityManager();
        emanager.remove(per);
    }

    @Override
    public List<Persona> buscarPorNombre(String nombre) {
       EntityManager emanager = entity.createEntityManager();
       return emanager.createQuery("SELECT per FROM Persona per WHERE nombre LIKE :nombre")
               .setParameter("nombre", "%" + nombre + "%")
               .getResultList();
    }

    @Override
    public int crear(Persona per) {
        EntityManager emanager = entity.createEntityManager();
        EntityTransaction transaccion = emanager.getTransaction();
        transaccion.begin();
         try{
             emanager.persist(per);
             transaccion.commit();
             return per.getIdpersona();
         }catch(Exception e){
             transaccion.rollback();
             throw new RuntimeException("Error al crear la sugerencia");
         }
    }

    @Override
    public Persona getById(int idPersona) {
        EntityManager emanager = entity.createEntityManager();
        return emanager.find(Persona.class, idPersona);
    }

    @Override
    public List<Persona> getAll() {
        EntityManager emanager = entity.createEntityManager();
        return emanager.createQuery("SELECT per FROM Persona per").getResultList();
    }

    @Override
    public long getCountPersonas() {
        EntityManager emanager = entity.createEntityManager();
        return (long) emanager.createQuery("SELECT COUNT(per) FROM Persona per")
                .getSingleResult();
    }
    
}
