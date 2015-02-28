/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.clase04.testing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Frost
 */
public class BuscarCadenaTest {
    
    public BuscarCadenaTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        //System.out.println("Antes de la clase");
    }
    
    @AfterClass
    public static void tearDownClass() {
        //System.out.println("Despues de la clase");
    }
    
    @Before
    public void setUp() {
        //System.out.println("Antes");
    }
    
    @After
    public void tearDown() {
        System.out.println("-------------------------------------------");
    }
    
    /**
     * Test of buscarCadena method, of class BuscarCadena.
     */
    /*
    @Test
    public void testBuscarCadena() {
        System.out.println("buscarCadena");
        String aguja = "duc";
        String pajar = "Introducción";
        BuscarCadena instance = new BuscarCadena();
        boolean expResult = false;
        boolean result = instance.buscarCadena(aguja, pajar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuscarCadena2() {
        System.out.println("buscarCadena2");
        String aguja = "Maestro";
        String pajar = "Licenciado,Doctor";
        BuscarCadena instance = new BuscarCadena();
        boolean expResult = false;
        boolean result = instance.buscarCadena(aguja, pajar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = NullPointerException.class)
    public void testBuscarCadena3() {
        System.out.println("buscarCadena3");
        String aguja = null;
        String pajar = "Licenciado,Doctor";
        BuscarCadena instance = new BuscarCadena();
        boolean expResult = false;
        boolean result = instance.buscarCadena(aguja, pajar);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    */
    //----------------------BUSCAR CADENA SUBSECUENCIA------------------------
    @Test
    public void buscarComoSubsecuencia1() {
        System.out.println("----------buscarComoSubsecuencia1----------");
        String aguja = null;
        String pajar = "Introducción";
        new BuscarCadena().buscarComoSubsecuencia(aguja, pajar);
    }
    
    @Test
    public void buscarComoSubsecuencia2() {
        System.out.println("----------buscarComoSubsecuencia2----------");
        String aguja = "Licor";
        String pajar = "Licenciado,Doctor";
        boolean expResult = true;
        boolean result = new BuscarCadena().buscarComoSubsecuencia(aguja, pajar);
        System.out.println("aguja: "+aguja);
        System.out.println("pajar: "+pajar);
        System.out.println("expec: "+expResult);
        System.out.println("resul: "+result);
        assertEquals(expResult, result);
    }
    
    @Test(expected = NullPointerException.class)
    public void buscarComoSubsecuencia3() {
        System.out.println("----------buscarComoSubsecuencia3----------");
        String aguja = null;
        String pajar = "Licenciado,Doctor";
        new BuscarCadena().buscarComoSubsecuencia(aguja, pajar);
        System.out.println("aguja: "+aguja);
        System.out.println("pajar: "+pajar);
        System.out.println("expec: NULL");
    }
    
    @Test
    public void buscarComoSubsecuencia4() {
        System.out.println("----------buscarComoSubsecuencia4----------");
        String aguja = "AgujaMasLarga";
        String pajar = "QuePajar";
        boolean expResult = false;
        boolean result = new BuscarCadena().buscarComoSubsecuencia(aguja, pajar);
        System.out.println("aguja: "+aguja);
        System.out.println("pajar: "+pajar);
        System.out.println("expec: "+expResult);
        System.out.println("resul: "+result);
        assertEquals(expResult, result);
    }
    
    @Test
    public void buscarComoSubsecuencia5() {
        System.out.println("----------buscarComoSubsecuencia5----------");
        String aguja = "Noaparece";
        String pajar = "Notengoalaaguja";
        boolean expResult = false;
        boolean result = new BuscarCadena().buscarComoSubsecuencia(aguja, pajar);
        System.out.println("aguja: "+aguja);
        System.out.println("pajar: "+pajar);
        System.out.println("expec: "+expResult);
        System.out.println("resul: "+result);
        assertEquals(expResult, result);
    }
    
    @Test
    public void buscarComoSubsecuencia6() {
        System.out.println("----------buscarComoSubsecuencia6----------");
        String aguja = "abc";
        String pajar = "Abstraccion";
        boolean expResult = true;
        boolean result = new BuscarCadena().buscarComoSubsecuencia(aguja, pajar);
        System.out.println("aguja: "+aguja);
        System.out.println("pajar: "+pajar);
        System.out.println("expec: "+expResult);
        System.out.println("resul: "+result);
        assertEquals(expResult, result);
    }
}
