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
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import rysi.tesis.dao.RetroalimentacionDAO;
import rysi.tesis.dao.RetroalimentacionDAOJPA;
import rysi.tesis.dao.SesionDAO;
import rysi.tesis.dao.SesionDAOJPA;
import rysi.tesis.dao.TesisDAO;
import rysi.tesis.dao.TesisDAOJPA;
import rysi.tesis.dao.UsuarioDAO;
import rysi.tesis.dao.UsuarioDAOJPA;
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
        /*
        RetroalimentacionDAO retroDAO = new RetroalimentacionDAOJPA();
        
        int idComentario = 1;
         Retroalimentacion retro1 = retroDAO.getComentarioPorId(idComentario);
        
        retro1.setPublicar(true);
        retroDAO.publicarComentario(retro1);
                                
        System.out.println(String.format("El comentario aparecerá publicado"));
        
        // Termina validar comentario para publicar
        //---------------------------------------------------------------------
                */
        
        /*
        //Inicia CrearTesis
        Tesis tesis1 = new Tesis();
        
        tesis1.setAño(2015);
        tesis1.setArchivo("tesis1.pdf");
        tesis1.setIdautor(1);
        tesis1.setIdcondicionsitio(1);
        tesis1.setIddirectortesis(1);
        tesis1.setIdespecieprimate(1);
        tesis1.setIdestado(1);
        tesis1.setIdgradoobtenido(1);
        tesis1.setIdinstitucion(1);
        tesis1.setIdsubdisciplina(1);
        tesis1.setTitulo("Tesis de primates azules");
        
        TesisDAO tesisDAO1 = new TesisDAOJPA();
        tesisDAO1.crearTesis(tesis1);
               
        System.out.println(String.format("Se registro con éxito la Tesis"));
        
        
        
        
        //Termina CrearTesis
        //---------------------------------------------------------------------
        
        */
       
        /*
        //Inicia Modificar Tesis
        TesisDAO tesisDAO1 = new TesisDAOJPA();
        int idTesis = 1;        
        
        Tesis tesis1 = tesisDAO1.getTesisPorId(idTesis);
        
        tesis1.setArchivo("tesis22.pdf");
        tesis1.setIdcondicionsitio(2);
        tesis1.setIddirectortesis(3);
        tesis1.setIdespecieprimate(2);
        tesis1.setIdestado(1);
       
        
        tesisDAO1.modificarTesis(tesis1);
        System.out.println(String.format("Se modificó con éxito la Tesis"));
        
        //Termina Modificar Tesis
        //----------------------------------------------------------------
                */
        /*
         //Inicia ELIMINAR Tesis
        TesisDAO tesisDAO1 = new TesisDAOJPA();
        int idTesis = 1;        
        
        Tesis tesis1 = tesisDAO1.getTesisPorId(idTesis);
        
        tesisDAO1.eliminarTesis(tesis1);
               
            System.out.println(String.format("Se eliminó con éxito la Tesis"));
        
        //Termina Eliminar Tesis
        //----------------------------------------------------------------
            */
        
        /*
             //Inicia Buscar Tesis
        TesisDAO tesisDAO1 = new TesisDAOJPA();
        int idTesis = 1;        
        
        //esta es la busqueda avanzada por palabra clave
        //
        List<Tesis> tesis1 = tesisDAO1.getBusquedaAvanzada(TesisDAO.campoBusqueda.AUTOR, "la");
        
        //esta es la busqueda general para mostrar todas las tesis
        //List<Tesis> tesis1 = tesisDAO1.getTodos();
        
        if (tesis1.isEmpty()){
            System.out.println(String.format("No existe ninguna coincidencia para esa palabra clave"));
        } else {
            System.out.println(String.format("Se encontraron :%c Tesis",
                    tesis1.size()));
        }
        
        //Termina buscar Tesis
        //----------------------------------------------------------------
                
                */
        
        /*
        //Inicia Crear Usuario
        Usuario usuario1 = new Usuario();
        
        usuario1.setNombre("Anabel Lopez");
        usuario1.setEmail("lopez_anny@hotmail.com");
        usuario1.setContrasenia("123");
        usuario1.setFacebook("lopez_anny@hotmail.com");
        usuario1.setIdgenero(1);
        usuario1.setIdgradoacademico(4);
        usuario1.setIdpais(1);
        usuario1.setIdrol(1);
        usuario1.setOcupacion("Estudiante");
        
        UsuarioDAO usuarioDAO1 = new UsuarioDAOJPA();
        usuarioDAO1.crearUsuario(usuario1);
                       
        System.out.println(String.format("Se registro con éxito al usuario"));
        
                
        //Termina CrearUsuario
        //---------------------------------------------------------------------
        */
        
        /*
        //Inicia modificar Usuario
        UsuarioDAO usuarioDAO1 = new UsuarioDAOJPA();
        Usuario usuario1 = usuarioDAO1.getUsuarioPorId(1);
        
        usuario1.setNombre("Anabel Lopez Meneses");
        usuario1.setEmail("lopez_anny@hotmail.com");
        usuario1.setContrasenia("1234");
        usuario1.setFacebook("lopez_anny@hotmail.com");
        usuario1.setIdgenero(1);
        usuario1.setIdgradoacademico(4);
        usuario1.setIdpais(1);
        usuario1.setIdrol(1);
        usuario1.setOcupacion("Estudiante");
                
        usuarioDAO1.modificarUsuario(usuario1);
                       
        System.out.println(String.format("Se modificó con éxito al usuario"));
        
                
        //Termina CrearUsuario
        //---------------------------------------------------------------------
                */
        /*
        //Inicia ELIMINAR Usuario
        UsuarioDAO usuarioDAO1 = new UsuarioDAOJPA();
        int idUsuario = 1;
        
        Usuario usuario1 = usuarioDAO1.getUsuarioPorId(idUsuario);
        
        usuarioDAO1.eliminarUsuario(usuario1);
        
        System.out.println(String.format("Se eliminó con éxito el usuario"));
        
        //Termina Eliminar Usuario
        //----------------------------------------------------------------
                */
        
        //Inicia validar usuario
        UsuarioDAO usuarioDAO1 = new UsuarioDAOJPA();
        
        String usuario = "lopez_anny@hotmail.com";
        String password = "123";
        
        List<Usuario> usuario1 = usuarioDAO1.ValidaUsuarioPassword(usuario, password);
        
        if (usuario1.isEmpty()){
            System.out.println(String.format("Usuario o contraseña incorrecta"));
        } else {
            System.out.println(String.format("Se encontro el usuario, permite acceso"));
        }
        
        //Termina buscar Tesis
        //----------------------------------------------------------------
    }
    
}
