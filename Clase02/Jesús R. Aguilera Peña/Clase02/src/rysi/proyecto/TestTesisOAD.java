/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.proyecto;

import java.math.BigDecimal;
import rysi.proyecto.DAO.TesisDAO;
import rysi.proyecto.DAO.TesisOADJPA;
import rysi.proyecto.entidades.Tesis;

/**
 *
 * @author jaguilera
 */
public class TestTesisOAD {
    public static void main(String[] args) {
/**        Tesis tes1 = new Tesis();
        tes1.setAutor("Leon Tolstoi");
        tes1.setTitulo("Guerra y Paz entre Primates");
        
        TesisDAO tesDAO = new TesisOADJPA();
        tesDAO.crear(tes1);
*/
        
/**        System.out.println(String.format("Hay %d artículos", 
 *               artsOAD.getConteoArticulos()));
 */
        
        Tesis tes2 = new Tesis();
        TesisDAO tes2DAO = new TesisOADJPA();
        tes2 = tes2DAO.getPorId(2);
        System.out.println(tes2.getIdtesis() + " Autor:" + tes2.getAutor() + " Título de la Tesis:"+ tes2.getTitulo());
                
    }
}
