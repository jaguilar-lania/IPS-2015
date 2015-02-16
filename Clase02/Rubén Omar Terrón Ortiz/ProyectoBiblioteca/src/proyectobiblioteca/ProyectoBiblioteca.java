/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobiblioteca;

import java.util.Date;
import oad.PaisOADJPA;
import oad.UsuarioOADJPA;

/**
 *
 * @author terron
 */
public class ProyectoBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PaisOADJPA paisoad = new PaisOADJPA();
        Pais pais = new Pais();
        pais.setIdpais(2);
        pais.setDescripcion("Colombia");
        paisoad.crear(pais);
        System.out.println("Conteo de paises = "+paisoad.contar());
        //---------------------------USUARIO----------------------------
        UsuarioOADJPA usuariooad = new UsuarioOADJPA();
        Usuario usuario = new Usuario();
        usuario.setIdusuario(2);
        usuario.setIdpais(1);
        usuario.setNombre("Omar");
        usuario.setAppaterno("Terron");
        usuario.setApmaterno("Ortiz");
        usuario.setFnacimiento(new Date());
        usuario.setIdgrado(1);
        usuario.setIdpermiso(1);
        usuariooad.crear(usuario);
        System.out.println("Conteo de usuario = "+usuariooad.contar());
        
    }
    
}
