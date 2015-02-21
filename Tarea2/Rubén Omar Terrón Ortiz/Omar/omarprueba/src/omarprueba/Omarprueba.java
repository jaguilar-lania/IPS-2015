/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omarprueba;

import java.util.Date;
import omarprueba.entidades.Autor;
import omarprueba.entidades.Calificacion;
import static omarprueba.entidades.Calificacion_.calificacion;
import omarprueba.entidades.Comentario;
import omarprueba.entidades.Director;
import omarprueba.entidades.Pais;
import omarprueba.entidades.Tesis;
import omarprueba.entidades.Usuario;
import omarprueba.oad.AutorOADJPA;
import omarprueba.oad.CalificacionOADJPA;
import omarprueba.oad.ComentarioOADJPA;
import omarprueba.oad.DirectorOADJPA;
import omarprueba.oad.PaisOADJPA;
import omarprueba.oad.TesisOADJPA;
import omarprueba.oad.UsuarioOADJPA;

/**
 *
 * @author rterr_000
 */
public class Omarprueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      /*  Autor art1 = new Autor();
       art1.setIdautor(1);
       art1.setCarrera("Omar");
       art1.setIdusuario(1);

        AutorOADJPA artsOAD = new AutorOADJPA();
        artsOAD.crear(art1);*/
        // TODO code application logic here
       
        /*Calificacion art1 = new Calificacion();
       art1.setIdcalificacion(1);
       art1.setCalificacion(8);
       art1.setFcreacion(new Date());
       art1.setIdtesis(1);
       art1.setIdusuario(1);*/
        
       /* Comentario art1 = new Comentario();
        art1.setIdcomentario(1);
        art1.setComentario("La tesis es buena");
        art1.setFcreacion(new Date());
        art1.setIdtesis(1);
        art1.setIdusuario(1);

        ComentarioOADJPA artsOAD = new ComentarioOADJPA();
        artsOAD.crear(art1);*/
        
       /* Director art1 = new Director();
        art1.setIddirector(1);
        art1.setProfesion("Lic. en Biología");
        art1.setIdusuario(1);
        art1.setIdgrado(1);*/
        
        /*Pais art1 = new Pais();
        art1.setIdpais(52);
        art1.setDescripcion("México");
         */
        
        /*Tesis art1 = new Tesis();
        art1.setIdtesis(1);
        art1.setTitulo("Los mono araña de catemaco");
        art1.setFgrado(new Date());
        art1.setDisciplina("Comportamiento");
        art1.setIes("INECOL");
        art1.setIdgrado(2);
        art1.setIdautor(1);
        art1.setIdpais(52);
        art1.setIddirector(1);*/
       
        Usuario art1 = new Usuario();
        art1.setIdusuario(1);
        art1.setNombre("Omar");
        art1.setAppaterno("Terrón");
        art1.setApmaterno("Ortiz");
        art1.setFnacimiento(new Date());
        art1.setIdgrado(1);
        art1.setIdpais(52);
        art1.setIdpermiso(1);
        
      

        UsuarioOADJPA artsOAD = new UsuarioOADJPA();
        artsOAD.crear(art1);
        
        
    }
    
}
