/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.proyecto;

import java.math.BigDecimal;
import rysi.proyecto.DAO.ComentariosDAO;
import rysi.proyecto.DAO.ComentariosOADJPA;
import rysi.proyecto.DAO.TesisDAO;
import rysi.proyecto.DAO.TesisOADJPA;
import rysi.proyecto.entidades.Comentario;
import rysi.proyecto.entidades.Tesis;

/**
 *
 * @author jaguilera
 */
public class TestTesisComentariosOAD {
    public static void main(String[] args) {

        /**
        *Tesis tes1 = new Tesis();
        *tes1.setAutor("Leon Tolstoi");
        *tes1.setTitulo("Guerra y Paz entre Primates");
        *        
        *TesisDAO tesDAO = new TesisOADJPA();
        *tesDAO.crear(tes1);
        *
        *       
        *Tesis tes2 = new Tesis();
        *TesisDAO tes2DAO = new TesisOADJPA();
        *tes2 = tes2DAO.getPorId(2);
        *System.out.println(tes2.getIdtesis() + " Autor:" + tes2.getAutor() + " Título de la Tesis:"+ tes2.getTitulo());
        */
        
        Comentario com1 = new Comentario();
        /**
        com1.setIdtesis(1);
        com1.setComentario("Es increible como los Prmates pudieron viajar tanto");
        com1.setCalificacion(2);
        */
        ComentariosDAO comDAO = new ComentariosOADJPA();
        /**
         * comDAO.crear(com1);            
        comDAO.getTodos();
        */
        Comentario com2 = new Comentario();
        ComentariosDAO com2DAO = new ComentariosOADJPA();
        com2 = com2DAO.getPorIdComentario(1);
        System.out.println(com2.getIdtesis()+ " " + com2.getCalificacion()+ " "+ com2.getComentario());

    }
}
