package lania.rysi.inecolprimeweb.dao;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import lania.rysi.inecolprimeweb.EO.Municipio;

public class MunicipioDAO implements CrudDAO{
    private EntityManagerFactory emf;
    
    public MunicipioDAO(){
        emf = Persistence.createEntityManagerFactory("InecolPrimeWebPU");
    }

    @Override
    public boolean create(Object o) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(o);
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
            throw new RuntimeException("No se puede registrar el Municipio");
        }
    }

    @Override
    public boolean update(Object o) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.merge(o);
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
            throw new RuntimeException("No se puede actualizar el Municipio");
        }
    }

    @Override
    public boolean delete(Object o) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.remove(o);
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
            throw new RuntimeException("No se puede eliminar el Municipio");
        }
    }

    @Override
    public Object getElement(Integer id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Municipio.class, id);
    }

    @Override
    public List<Object> getElements(String ids) {
        EntityManager em = emf.createEntityManager();
        String baseQuery = "SELECT m FROM Municipio m WHERE idmunicipio IN (:param)";
        return em.createQuery(baseQuery).setParameter("param", ids).getResultList();
    }

    @Override
    public long countElements() {
        EntityManager em = emf.createEntityManager();
        return (Long) em.createQuery("SELECT COUNT(m) FROM Municipio m").getSingleResult();
    }
}
