package rysi.articulos.oad;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import rysi.articulos.entidades.Articulo;

/**
 * @author jaguilar
 * @version 1.0
 * @created 14-feb.-2015 11:39:55
 */
public class ArticulosOADJPA implements ArticulosOAD {

    private EntityManagerFactory emf;

    public ArticulosOADJPA() {
        emf = Persistence.createEntityManagerFactory("ArticulosDatosPU");
    }

    /*
     * 
     * @param art
     */
    public void actualizar(Articulo art) {
        EntityManager em = emf.createEntityManager();
        em.merge(art);
    }

    /**
     *
     * @param art
     */
    public void borrar(Articulo art) {
        EntityManager em = emf.createEntityManager();
        em.remove(art);
    }

    /**
     *
     * @param idArticulo
     */
    public void borrar(int idArticulo) {

    }

    /**
     *
     * @param cadena
     */
    public List<Articulo> buscarPorNombre(String cadena) {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT art FROM Articulo art WHERE nombre LIKE :nombre")
                .setParameter("nombre", "%" + cadena + "%")
                .getResultList();
    }

    /**
     *
     * @param art
     */
    public int crear(Articulo art) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(art);
            trans.commit();
            return art.getIdArticulo();
        } catch (Exception ex) {
            trans.rollback();
            throw new RuntimeException("Error al crear articulo");
        }
    }

    /**
     *
     * @param idArticulo
     */
    public Articulo getPorId(int idArticulo) {
        EntityManager em = emf.createEntityManager();
        return em.find(Articulo.class, idArticulo);
    }

    public List<Articulo> getTodos() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT art FROM Articulo art").getResultList();
    }

    @Override
    public long getConteoArticulos() {
        EntityManager em = emf.createEntityManager();
        return (long) em.createQuery("SELECT COUNT(art) FROM Articulo art")
                .getSingleResult();
    }
}//end ArticulosOADJPA







