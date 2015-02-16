/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashSet;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import rysi.tesis.dao.RetroalimentacionDAO;
import rysi.tesis.dao.RetroalimentacionDAOJPA;
import rysi.tesis.dao.SesionDAO;
import rysi.tesis.dao.SesionDAOJPA;
import rysi.tesis.entidades.Retroalimentacion;
//import rysi.tesis.entidades.Retroalimentacion;
import rysi.tesis.entidades.Sesion;
import rysi.tesis.entidades.Tesis;
import rysi.tesis.entidades.Usuario;

/**
 *
 * @author Anny
 */
public class TestTesisDAO {
    
    public static void main(String[] args) {
        
        /*//Iniciar sesion
        Date fecha = new Date();
        int IdSesion = 0; 
               
        Sesion sesion1 = new Sesion();
        
        sesion1.setIdusuario(1);
        sesion1.setFechaingreso(fecha);
        sesion1.setHoraingreso(fecha);
        //sesion1.setId(1);
        
        SesionDAO sesDAO = new SesionDAOJPA();
        
        IdSesion=sesDAO.registrarInicio(sesion1);
                            
        System.out.println(String.format("Id de la sesion: %d ", 
                IdSesion));
        
        //Final Iniciar Sesion*/
    //--------------------------------------------------------------------------    
     /* 
        //Terminar sesion
        Date fecha = new Date();
        int IdSesion = 2; 
        //Sesion sesion1 = new Sesion();
        SesionDAO sesDAO = new SesionDAOJPA();
        Sesion sesion1= sesDAO.getSesionPorId(IdSesion);
                
        sesion1.setFechasalida(fecha);
        sesion1.setHorasalida(fecha);
        sesDAO.registrarFinal(sesion1);
                                    
        System.out.println(String.format("Se cerro correctamente la sesion: %d",
                IdSesion));
        
        //Final Iniciar Sesion
             */
        
        //-------------------------------------------------------------------
        /*
        //Registrar retroalimentacion
        
        Retroalimentacion retro1 = new Retroalimentacion();
        
        retro1.setCalificacion(5);
        retro1.setComentario("La tesis esta muy completa e interesante");
        retro1.setIdtesis(1);
        retro1.setIdusuario(1);
        
        RetroalimentacionDAO retroDAO = new RetroalimentacionDAOJPA();
        retroDAO.registrarRetroalimentacion(retro1);
        
        System.out.println(String.format("Se registro el comentario y calificacion"));
         
        //Termina registrar retroalimetacion
        //------------------------------------------------------------------------------
        */
        //Inicia validar comentario para publicar
        
        RetroalimentacionDAO retroDAO = new RetroalimentacionDAOJPA();
        
        int idComentario = 1;
         Retroalimentacion retro1 = retroDAO.getComentarioPorId(idComentario);
        
        retro1.setPublicar(true);
        retroDAO.publicarComentario(retro1);
                
        System.out.println(String.format("El comentario aparecerá publicado"));
        
        // Termina validar comentario para publicar
    }
    
}
