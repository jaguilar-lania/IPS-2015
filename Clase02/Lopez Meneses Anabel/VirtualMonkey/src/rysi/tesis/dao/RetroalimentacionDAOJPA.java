package rysi.tesis.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import rysi.tesis.entidades.Retroalimentacion;
import rysi.tesis.entidades.Tesis;
import rysi.tesis.entidades.Usuario;

/**
 * @author Anny
 * @version 1.0
 * @created 14-feb.-2015 02:38:24 p. m.
 */
public class RetroalimentacionDAOJPA implements RetroalimentacionDAO {
    
    private EntityManagerFactory emf;

    public RetroalimentacionDAOJPA(){
        emf = Persistence.createEntityManagerFactory("VirtualMonkeyPU");
    }
       
        
	//public void finalize() throws Throwable {

	//}

	/**
	 * 
	 * @param art
	 */
	public void publicarComentario(Retroalimentacion art){

	}

	/**
	 * 
	 * @param art
	 */
	public void registrarRetroalimentacion(Retroalimentacion art){
            EntityManager em = emf.createEntityManager();
            EntityTransaction trans = em.getTransaction();
            //art.setTesis(em.find(Tesis.class, 1));
            //art.setUsuario(em.find(Usuario.class, 1));
            trans.begin();
            try {
                
                em.persist(art);
                trans.commit();
                //return art;
            } catch (Exception ex) {
                trans.rollback();
            throw new RuntimeException("Error al registrar la retroalimentacion");
            }

	}
       
        
           
        

}