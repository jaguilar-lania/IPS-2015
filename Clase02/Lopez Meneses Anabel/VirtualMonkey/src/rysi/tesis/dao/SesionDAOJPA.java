package rysi.tesis.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import rysi.tesis.entidades.Sesion;
import rysi.tesis.entidades.Usuario;

/**
 * @author Anny
 * @version 1.0
 * @created 14-feb.-2015 02:38:17 p. m.
 */
public class SesionDAOJPA implements SesionDAO {
    
     private EntityManagerFactory emf;
     
     public SesionDAOJPA() {
        emf = Persistence.createEntityManagerFactory("VirtualMonkeyPU");
    }

	/**
	 * 
	 * @param art
	 */
	public void registrarFinal(Sesion art){
            EntityManager em = emf.createEntityManager();
            EntityTransaction trans = em.getTransaction();
            trans.begin();
            try {
                em.merge(art);
                trans.commit();
            } catch (Exception ex) {
                trans.rollback();
                throw new RuntimeException(ex);
            }
            
	}

	/**
	 * 
	 * @param art
	 */
	public int registrarInicio(Sesion art){
            EntityManager em = emf.createEntityManager();
            EntityTransaction trans = em.getTransaction();
            trans.begin();
            try {
                em.persist(art);
                trans.commit();
                return art.getId();
            } catch (Exception ex) {
                trans.rollback();
                throw new RuntimeException(ex);
            }
	}

	/**
	 * 
	 * @param art
	 */
	public boolean validarUsuario(Usuario art){
		return false;
	}
        
       /**
     *
     * @param idSesion
     */
    public Sesion getSesionPorId(int idSesion) {
        EntityManager em = emf.createEntityManager();
        return em.find(Sesion.class, idSesion);
    }
        
        
}