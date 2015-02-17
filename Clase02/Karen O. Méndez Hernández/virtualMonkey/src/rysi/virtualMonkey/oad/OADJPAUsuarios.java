package rysi.virtualMonkey.oad;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import rysi.virtualMonkey.entidades.Usuario;

/**
 * @author jaguilar
 * @version 1.0
 * @created 14-feb.-2015 11:39:55
 */
public class OADJPAUsuarios implements OADUsuarios {

    private EntityManagerFactory emf;

    public OADJPAUsuarios() {
        emf = Persistence.createEntityManagerFactory("virtualMonkeyPU");
    }

    /*
     * 
     * @param usr
     */
    
    public void editar(Usuario usr) {
        EntityManager em = emf.createEntityManager();
        em.merge(usr);
    }

 

    /**
     *
     * @param idUsuario
     */
    public void eliminar(int idUsuario) {

    }

   
    /**
     *
     * @param usr
     */
    public int registrar(Usuario usr) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(usr);
            trans.commit();
                        return usr.getIdusuario();

        } catch (Exception ex) {
            trans.rollback();
            throw new RuntimeException("Error registrar usuario");
        }
    }

    


   

   
}//end ArticulosOADJPA







