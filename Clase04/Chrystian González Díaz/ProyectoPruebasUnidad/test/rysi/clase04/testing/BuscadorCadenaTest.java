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
 * @author Chrys
 */
public class BuscadorCadenaTest {
    
    public BuscadorCadenaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Antes de la clase");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Despúes de la clase");
    }
    
    @Before
    public void setUp() {
        System.out.println("Antes del test");
    }
    
    @After
    public void tearDown() {
        System.out.println("Despúes del test");
    }

    /**
     * Test of buscarCadena method, of class BuscadorCadena.
     */
    @Test
    public void testBuscarCadenaSinExito() {
        System.out.println("buscarCadenaNoEncontrada");
        String aguja = "perro";
        String pajar = "gato";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = false;
        boolean result = instance.buscarCadena(aguja, pajar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuscarCadenaConExito() {
        System.out.println("buscarCadenaConExito");
        String aguja = "perro";
        String pajar = "perroperro";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = true;
        boolean result = instance.buscarCadena(aguja, pajar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @Test
    public void testBuscarCadenaConExito2() {
        System.out.println("buscarCadenaConExito2");
        String aguja = "perro";
        String pajar = "perrogato";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = true;
        boolean result = instance.buscarCadena(aguja, pajar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test(expected = NullPointerException.class)
    public void testBuscarCadenaConExcepcion() {
        System.out.println("buscarCadenaConExcepcion");
        String aguja = null;
        String pajar = "gatoperro";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = true;
        boolean result = instance.buscarCadena(aguja, pajar);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCadena method, of class BuscadorCadena.
     */
    @Test
    public void testBuscarCadena() {
        System.out.println("buscarCadena");
        String aguja = "";
        String pajar = "";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = false;
        boolean result = instance.buscarCadena(aguja, pajar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCadenaComoSubsecuencia method, of class BuscadorCadena.
     */
    @Test
    public void testBuscarCadenaComoSubsecuencia() {
        System.out.println("buscarCadenaComoSubsecuencia");
        String aguja = "";
        String Pajar = "";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = false;
        boolean result = instance.buscarCadenaComoSubsecuencia(aguja, Pajar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testBuscarCadenaComoSubsecuencia2() {
        System.out.println("Si aparecen todos en subs");
        String aguja = "maestria";
        String Pajar = "mesa";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = true;
        boolean result = instance.buscarCadenaComoSubsecuencia(aguja, Pajar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuscarCadenaComoSubsecuencia3() {
        System.out.println("No aparecen todos en subs");
        String aguja = "chevrolet";
        String Pajar = "velo";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = false;
        boolean result = instance.buscarCadenaComoSubsecuencia(aguja, Pajar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuscarCadenaComoSubsecuencia4() {
        System.out.println("Si aparecen todos en subs");
        String aguja = "veracruz";
        String Pajar = "cruz";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = true;
        boolean result = instance.buscarCadenaComoSubsecuencia(aguja, Pajar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test(expected = NullPointerException.class)
    public void testBuscarCadenaComoSubsecuencia5() {
        System.out.println("Cadena Con Excepcion");
        String aguja = null;
        String Pajar = "cruz";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = true;
        boolean result = instance.buscarCadenaComoSubsecuencia(aguja, Pajar);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
}
