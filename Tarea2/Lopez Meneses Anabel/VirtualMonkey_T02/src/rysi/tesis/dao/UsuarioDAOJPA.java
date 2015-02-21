/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import rysi.tesis.entidades.Usuario;

/**
 *
 * @author Anny
 */
public class UsuarioDAOJPA implements UsuarioDAO{
    
    private EntityManagerFactory emf;

    public UsuarioDAOJPA(){
        emf = Persistence.createEntityManagerFactory("VirtualMonkeyPU");
    }
    

    @Override
    public void crearUsuario(Usuario art) {
        EntityManager em = emf.createEntityManager();
            EntityTransaction trans = em.getTransaction();
            trans.begin();
            try {
                
                em.persist(art);
                trans.commit();
                //return art;
            } catch (Exception ex) {
                trans.rollback();
            throw new RuntimeException("Error al registrar al usuario");
            }
    }

    @Override
    public void modificarUsuario(Usuario art) {
        EntityManager em = emf.createEntityManager();
            EntityTransaction trans = em.getTransaction();
            trans.begin();
            try {
                
                em.merge(art);
                trans.commit();
                //return art;
            } catch (Exception ex) {
                trans.rollback();
            throw new RuntimeException("Error al modificar los datos del usuario");
            }
    }

    @Override
    public void eliminarUsuario(Usuario art) {
        EntityManager em = emf.createEntityManager();
        Usuario entity = em.merge(art);
            EntityTransaction trans = em.getTransaction();
            trans.begin();
            try {
               
                em.remove(entity);
                trans.commit();
                //return art;
            } catch (Exception ex) {
                trans.rollback();
            throw new RuntimeException("Error al eliminar el usuario");
            }
    }

    @Override
    public Usuario getUsuarioPorId(int IdUsuario) {
        EntityManager em = emf.createEntityManager();
        return em.find(Usuario.class, IdUsuario);
    }

    @Override
    public List<Usuario> ValidaUsuarioPassword(String usuario, String password) {
         EntityManager em = emf.createEntityManager();
        
        return em.createQuery("SELECT art FROM Usuario art WHERE art.email = :usuario"
                + " and art.contrasenia = :password")
                .setParameter("usuario", usuario)
                .setParameter("password", password)
                .getResultList();
    }
    
}
