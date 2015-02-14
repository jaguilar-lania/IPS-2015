/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inecolprime;

import inecolprime.dao.EntidadFederativaDAO;
import inecolprime.dao.MunicipioDAO;
import inecolprime.dao.PaisDAO;
import inecolprime.pojos.Entidadfederativa;
import inecolprime.pojos.Municipio;
import inecolprime.pojos.Pais;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Frost
 */
public class InecolPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Iniciando inecolprime");
        ///*
        PaisDAO pdao = new PaisDAO();
        Pais p = new Pais();
        System.out.print("Registrando pais...");
        p.setNombre("Estados unidos de norteamerica");
        p.setCodigo("US");
        p.setNacionalidad("Estadounidence");
        pdao.create(p);
        System.out.println("Obteniendo conteo...");
        System.out.println("Paises: "+pdao.countElements());
        //*/
        /*
        EntidadFederativaDAO efdao = new EntidadFederativaDAO();
        Entidadfederativa ef = new Entidadfederativa();
        System.out.print("Registrando entidad federativa...");
        ef.setNombre("Chiapas");
        ef.setClave("CHI");
        ef.setIdpais(new Integer(1));
        efdao.create(ef);
        System.out.println("Obteniendo conteo...");
        System.out.println("EF: "+efdao.countElements());
        /*
        MunicipioDAO mdao = new MunicipioDAO();
        Municipio m = new Municipio();
        m.setNombre("Xalapa");
        m.setClave("XAL");
        System.out.print("Guardando...");
        mdao.create(m);
        System.out.println("Obteniendo conteo de municipios...");
        System.out.println("Municipios: "+mdao.countElements());
        */
    }
    
}
