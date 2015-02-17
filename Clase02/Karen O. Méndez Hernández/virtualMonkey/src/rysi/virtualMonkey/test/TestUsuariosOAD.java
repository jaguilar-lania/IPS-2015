package rysi.virtualMonkey.test;

import rysi.virtualMonkey.entidades.Usuario;
import rysi.virtualMonkey.oad.OADUsuarios;
import rysi.virtualMonkey.oad.OADJPAUsuarios;

/**
 *
 * @author KMENDEZm
 */
public class TestUsuariosOAD {
    public static void main(String[] args) {
        Usuario usr = new Usuario();
        usr.setIdusuario(6);
        usr.setNombre("Karen");
        usr.setCorreoelectronico(("karenmh91"));
        usr.setGenero(("femenino"));
        usr.setOcupacion(("empleada"));
        usr.setContrasena(("wml"));
        usr.setFacebook("wml");
        usr.setGradoacademico("wml");

        OADUsuarios artsOAD = new OADJPAUsuarios();
        artsOAD.registrar(usr);
        
        System.out.println(String.format("Registro exitoso")); 

            
        
                       
                }
}







