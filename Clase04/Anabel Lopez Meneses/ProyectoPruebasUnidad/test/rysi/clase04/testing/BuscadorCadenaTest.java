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
 * @author Anny
 */
public class BuscadorCadenaTest {
    
    public BuscadorCadenaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("antes de la clase");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("después de la clase");
    }
    
    @Before
    public void setUp() {
        System.out.println("antes del test");
    }
    
    @After
    public void tearDown() {
        System.out.println("despues del test");
    }

    /**
     * Test of buscarCadena method, of class BuscadorCadena.
     */
    @Test
    public void testBuscarCadenaSinExito() {
        System.out.println("buscarCadenaSinExito");
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
        String pajar = "perro";
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
        String pajar = "gatoperro";
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
    
}
