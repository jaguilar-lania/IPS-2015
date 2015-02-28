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
 * @author miguel
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
        System.out.println("Despues de la clase");
    }
    
    @Before
    public void setUp() {
        System.out.println("Antes de test");
    }
    
    @After
    public void tearDown() {
        System.out.println("Despues de test");
    }

    /**
     * Test of buscarCadena method, of class BuscadorCadena.
     */
    @Test
    public void testBuscarCadenaNoEncontrada() {
        System.out.println("testBuscarCadenaNoEncontrada");
        String aguja = "perro";
        String pajar = "gato";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = false;
        boolean result = instance.buscarCadena(aguja, pajar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
 
    @Test
    public void testBuscarCadenaConExito() {
        System.out.println("testBuscarCadenaConExito");
        String aguja = "perro";
        String pajar ="perro";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = true;
        boolean result = instance.buscarCadena(aguja, pajar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testBuscarCadenaConExito2() {
        System.out.println("testBuscarCadenaConExito2");
        String aguja = "perro";
        String pajar ="gatoperro";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = true;
        boolean result = instance.buscarCadena(aguja, pajar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test(expected = NullPointerException.class)
    public void testBuscarCadenaConEcepcion() {
        System.out.println("testBuscarCadenaConExcepcion");
        String aguja = null;
        String pajar ="gatoperro";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = true;
        boolean result = instance.buscarCadena(aguja, pajar);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
