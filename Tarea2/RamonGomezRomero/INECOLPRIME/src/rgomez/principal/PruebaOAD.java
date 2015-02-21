/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.principal;

import java.util.Date;
import rgomez.mx.entidades.Entidadfederativa;
import rgomez.mx.entidades.Pais;
import rgomez.mx.entidades.Sugerencia;
import rgomez.mx.entidades.Usuario;
import rgomez.mx.oad.EntidadFederativaOADJPA;
import rgomez.mx.oad.PaisOADJPA;
import rgomez.mx.oad.SugerenciaOAD;
import rgomez.mx.oad.SugerenciaOADJPA;
import rgomez.mx.oad.UsuarioOAD;
import rgomez.mx.oad.UsuarioOADJPA;

/**
 *
 * @author Subli
 */
public class PruebaOAD {
 
     public static void main(String[] args) {
       /* Sugerencia sug1 = new Sugerencia();
        sug1.setSugerencia("Cambiar portada");
        Date fecha = new Date();
        fecha.getDate();
        sug1.setFechacreacion(fecha);
        sug1.setIdusuario(0); 

        //SugerenciaOAD surOAD = new SugerenciaOADJPA();
        //surOAD.crear(sug1);
        
        Date fecha = new Date();
        fecha.getDate(); 
         
        Usuario usu = new Usuario();
        usu.setIdpersona(1);
        usu.setFecharegistro(fecha);
        usu.setIdrol(1);
        usu.setIdpersona(1);
        
        UsuarioOADJPA usuarioOAD = new UsuarioOADJPA();
        usuarioOAD.crear(usu);
         
        System.out.println(String.format("Hay %d usuario(s)", 
                usuarioOAD.getCountUsuarios()));  */
        
        
        Pais pais = new Pais();
        pais.setIdpais(3);
        pais.setNombre("Canada");
        
        PaisOADJPA paisOAD = new PaisOADJPA();
        paisOAD.crear(pais);
         
        System.out.println(String.format("Hay %d pais(es)", 
                paisOAD.getCountPais()));
        
         Entidadfederativa ef = new Entidadfederativa();
         ef.setIdentidadfederativa(2);
         ef.setNombre("Baja California");
         
         EntidadFederativaOADJPA entidadOAD = new EntidadFederativaOADJPA();
         entidadOAD.crear(ef);
         
         System.out.println(String.format("Hay %d Estado(s)", 
                entidadOAD.getCountEntidades()));
    }
}
