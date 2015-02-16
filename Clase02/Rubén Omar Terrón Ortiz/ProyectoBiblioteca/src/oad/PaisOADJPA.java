package oad;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import proyectobiblioteca.Pais;

public class PaisOADJPA implements PaisOAD{
    private EntityManagerFactory emf;
    
    public PaisOADJPA(){
        emf = Persistence.createEntityManagerFactory("ProyectoBibliotecaPU");
    }

    @Override
    public boolean crear(Pais p) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(p);
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
            throw new RuntimeException("No se puede guardar el Pais");
        }
    }

    @Override
    public boolean actualizar(Pais p) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.merge(p);
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
            throw new RuntimeException("No se puede actualizar el Pais");
        }
    }

    @Override
    public boolean eliminar(Pais p) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.remove(p);
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
            throw new RuntimeException("No se puede eliminar el Pais");
        }
    }

    @Override
    public Pais getPais(Integer idPais) {
        EntityManager em = emf.createEntityManager();
        return em.find(Pais.class, idPais);
    }

    @Override
    public List<Pais> buscarPorNombre(String nombre) {
        EntityManager em = emf.createEntityManager();
        String baseQuery = "SELECT p FROM Pais p WHERE nombre LIKE :param";
        return em.createQuery(baseQuery).setParameter("param", "%"+nombre+"%").getResultList();
    }

    @Override
    public long contar() {
        EntityManager em = emf.createEntityManager();
        return (long) em.createQuery("SELECT COUNT(p) FROM Pais p").getSingleResult();
    }
}
