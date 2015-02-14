/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.mx.oad;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import rgomez.mx.entidades.Usuario;

/**
 *
 * @author Subli
 */
public class UsuarioOADJPA implements UsuarioOAD{

    private EntityManagerFactory entity;
    
    public UsuarioOADJPA(){
        entity = Persistence.createEntityManagerFactory("INECOLPRIMEPU");
    }
    
    @Override
    public void actualizar(Usuario usu) {
        EntityManager emanager = entity.createEntityManager();
        emanager.merge(usu);
    }

    @Override
    public void borrar(Usuario usu) {
         EntityManager emanager = entity.createEntityManager();
        emanager.remove(usu);
    }

    

    @Override
    public int crear(Usuario usu) {
        EntityManager emanager = entity.createEntityManager();
         EntityTransaction transaccion = emanager.getTransaction();
         transaccion.begin();
         try{
             emanager.persist(usu);
             transaccion.commit();
             return usu.getIdusuario();
         }catch(Exception e){
             transaccion.rollback();
             throw new RuntimeException("Error al crear el usuario");
         }
    }

    @Override
    public Usuario getById(int idUsuario) {
        EntityManager emanager = entity.createEntityManager();
        return emanager.find(Usuario.class, idUsuario);
    }

    @Override
    public List<Usuario> getAll() {
        EntityManager emanager = entity.createEntityManager();
        return emanager.createQuery("SELECT us FROM Usuario us").getResultList();
    }

    @Override
    public long getCountUsuarios() {
        EntityManager emanager = entity.createEntityManager();
        return (long) emanager.createQuery("SELECT COUNT(us) FROM Usuario us")
                .getSingleResult();
    }
    
}
