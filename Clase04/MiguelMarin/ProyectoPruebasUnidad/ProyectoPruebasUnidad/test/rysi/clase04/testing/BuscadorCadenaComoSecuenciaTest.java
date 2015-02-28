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
public class BuscadorCadenaComoSecuenciaTest {
    
    public BuscadorCadenaComoSecuenciaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of buscarCadenaComoSubsecuencia method, of class BuscadorCadena.
     */
    @Test
    public void testBuscarCadenaComoSubsecuenciaExito() {
        System.out.println("buscarCadenaComoSubsecuenciaExito");
        String agujas = "mra";
        String pajar = "marioneta";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = false;
        boolean result = instance.buscarCadenaComoSubsecuencia(agujas, pajar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testBuscarCadenaComoSubsecuenciaExito2() {
        System.out.println("buscarCadenaComoSubsecuenciaExito2");
        String agujas = "ctcs";
        String pajar = "coatzacoalcos";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = false;
        boolean result = instance.buscarCadenaComoSubsecuencia(agujas, pajar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuscarCadenaComoSubsecuenciaNoEncontrada() {
        System.out.println("buscarCadenaComoSubsecuenciaNoEncontrada");
        String agujas = "estado";
        String pajar = "marioneta";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = false;
        boolean result = instance.buscarCadenaComoSubsecuencia(agujas, pajar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuscarCadenaComoSubsecuenciaNoEncontrada2() {
        System.out.println("buscarCadenaComoSubsecuenciaNoEncontrada2");
        String agujas = "cho";
        String pajar = "stradivarius";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = false;
        boolean result = instance.buscarCadenaComoSubsecuencia(agujas, pajar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = NullPointerException.class)
    public void testBuscarCadenaComoSubsecuenciaConException() {
        System.out.println("testBuscarCadenaComoSubsecuenciaConException");
        String agujas = "estado";
        String pajar = null;
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = false;
        boolean result = instance.buscarCadenaComoSubsecuencia(agujas, pajar);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test(expected = NullPointerException.class)
    public void testBuscarCadenaComoSubsecuenciaConException2() {
        System.out.println("testBuscarCadenaComoSubsecuenciaConException");
        String agujas = null;
        String pajar = null;
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = false;
        boolean result = instance.buscarCadenaComoSubsecuencia(agujas, pajar);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
