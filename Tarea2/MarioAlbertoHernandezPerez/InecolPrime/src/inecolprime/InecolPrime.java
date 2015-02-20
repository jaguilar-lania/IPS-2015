/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inecolprime;

import inecolprime.dao.CatalogoDAO;
import inecolprime.dao.EntidadFederativaDAO;
import inecolprime.dao.MenuDAO;
import inecolprime.dao.MunicipioDAO;
import inecolprime.dao.PaisDAO;
import inecolprime.pojos.Catalogo;
import inecolprime.pojos.Entidadfederativa;
import inecolprime.pojos.Menu;
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
        /*
        PaisDAO pdao = new PaisDAO();
        Pais p = new Pais();
        System.out.print("Registrando pais...");
        p.setNombre("Estados unidos de norteamerica");
        p.setCodigo("US");
        p.setNacionalidad("Estadounidence");
        pdao.create(p);
        System.out.println("Obteniendo conteo...");
        System.out.println("Paises: "+pdao.countElements());
        */
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
        //*/
        /*
        MunicipioDAO mdao = new MunicipioDAO();
        Municipio m = new Municipio();
        m.setNombre("Xalapa");
        m.setClave("XAL");
        m.setIdentidadfederativa(1);
        System.out.print("Guardando...");
        mdao.create(m);
        System.out.println("Obteniendo conteo de municipios...");
        System.out.println("Municipios: "+mdao.countElements());
        */
        /*
        CatalogoDAO cdao = new CatalogoDAO();
        Catalogo c = new Catalogo();
        c.setIdcatalogo(1);
        c.setNombre("Tipos de tesis");
        System.out.print("Guardando...");
        cdao.create(c);
        System.out.println("Obteniendo conteo de catálogos...");
        System.out.println("Catálogos: "+cdao.countElements());
        */
        MenuDAO mdao = new MenuDAO();
        Menu m = new Menu();
        m.setIdmenu(1);
        m.setNombre("Xalapa");
        m.setOrden(1);
        m.setEnlace("crudTesis");
        System.out.print("Guardando...");
        mdao.create(m);
        System.out.println("Obteniendo conteo de menus...");
        System.out.println("Menus: "+mdao.countElements());
    }
    
}
