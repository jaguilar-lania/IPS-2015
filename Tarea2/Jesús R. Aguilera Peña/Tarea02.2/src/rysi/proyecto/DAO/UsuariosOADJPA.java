package rysi.proyecto.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import rysi.proyecto.entidades.Usuario;


/**
 * @author jaguilera
 * @version 1.0
 * @created 20-feb.-2015 13:33:42
 */
public class UsuariosOADJPA implements UsuariosDAO {

        private EntityManagerFactory emf;
        
	public UsuariosOADJPA(){
            emf = Persistence.createEntityManagerFactory("ExamenPU");
	}

	/**
	 * 
	 * @param usr
	 */
	public void actualizar(Usuario usr){
            EntityManager em = emf.createEntityManager();
            em.merge(usr);
	}

	/**
	 * 
	 * @param idusuario
	 */
	public void borrar(int idusuario){
            EntityManager em = emf.createEntityManager();
            em.remove(idusuario);
	}

	/**
	 * 
	 * @param usr
	 */
	public void borrar(Usuario usr){
            EntityManager em = emf.createEntityManager();
            em.refresh(usr);
	}

	/**
	 * 
	 * @param nombre
	 */
	public List<Usuario> buscarPorNombre(String nombre){
            EntityManager em = emf.createEntityManager();            
            return em.createQuery("SELECT usr FROM Usuario usr WHERE nombre LIKE :nombre")
                    .setParameter("nombre", "%" + nombre + "%")
                    .getResultList();
	}

	/**
	 * 
	 * @param usr
	 */
	public int crear(Usuario usr){
            EntityManager em = emf.createEntityManager();
            EntityTransaction trans = em.getTransaction();
            trans.begin();
            try {
                em.persist(usr);
                trans.commit();
                return usr.getIdusuario();
            } catch (Exception ex) {
                trans.rollback();
                throw new RuntimeException("Error al crear Usuario");
            }         
	}

	/**
	 * 
	 * @param idusuario
	 */
	public Usuario getPorIdUsuario(int idusuario){
            EntityManager em = emf.createEntityManager();
            return em.find(Usuario.class, idusuario);
	}

	public List<Usuario> getTodos(){
            EntityManager em = emf.createEntityManager();
            return em.createQuery("SELECT usr FROM Usuario usr").getResultList();
	}

}