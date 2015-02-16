package oad;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import proyectobiblioteca.Usuario;

public class UsuarioOADJPA implements UsuarioOAD{
    private EntityManagerFactory emf;
    
    public UsuarioOADJPA(){
        emf = Persistence.createEntityManagerFactory("ProyectoBibliotecaPU");
    }

    @Override
    public boolean crear(Usuario u) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(u);
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
            throw new RuntimeException("No se puede guardar el Usuario");
        }
    }

    @Override
    public boolean actualizar(Usuario u) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.merge(u);
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
            throw new RuntimeException("No se puede actualizar el Usuario");
        }
    }

    @Override
    public boolean eliminar(Usuario u) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.remove(u);
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
            throw new RuntimeException("No se puede eliminar el Usuario");
        }
    }

    @Override
    public Usuario getUsuario(Integer idUsuario) {
        EntityManager em = emf.createEntityManager();
        return em.find(Usuario.class, idUsuario);
    }

    @Override
    public List<Usuario> buscarPorNombre(String nombre) {
        EntityManager em = emf.createEntityManager();
        String baseQuery = "SELECT u FROM Usuario u WHERE nombre LIKE :param";
        return em.createQuery(baseQuery).setParameter("param", "%"+nombre+"%").getResultList();
    }

    @Override
    public long contar() {
        EntityManager em = emf.createEntityManager();
        return (long) em.createQuery("SELECT COUNT(u) FROM Usuario u").getSingleResult();
    }
}
