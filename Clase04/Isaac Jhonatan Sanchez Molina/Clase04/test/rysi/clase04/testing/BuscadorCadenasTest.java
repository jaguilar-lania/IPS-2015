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
 * @author 74002612
 */
public class BuscadorCadenasTest {
    
    public BuscadorCadenasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Antes de la clase.");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Despues de la clase.");
    }
    
    @Before
    public void setUp() {
        System.out.println("Antes del test.");
    }
    
    @After
    public void tearDown() {
        System.out.println("Despues del test.");
    }

    /**
     * Test of getBuscarCadena method, of class BuscadorCadenas.
     */
    @Test
    public void testGetBuscarCadenaFallida() {
        System.out.println("getBuscarCadenaFallida");
        String aguja = "Perro";
        String pajal = "Gato";
        BuscadorCadenas instance = new BuscadorCadenas();
        boolean expResult = false;
        boolean result = instance.getBuscarCadena(aguja, pajal);
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testGetBuscarCadenaConExito() {
        System.out.println("getBuscarCadenaConExito");
        String aguja = "Perro";
        String pajal = "Tengo un Perro en mi casa";
        BuscadorCadenas instance = new BuscadorCadenas();
        boolean expResult = true;
        boolean result = instance.getBuscarCadena(aguja, pajal);
        assertEquals(expResult, result);        
    }
    
    @Test(expected = NullPointerException.class)
    public void testGetBuscarCadenaConExcepcion() {
        System.out.println("getBuscarCadenaConException");
        String aguja = null;
        String pajal = "Gato";
        BuscadorCadenas instance = new BuscadorCadenas();
        boolean expResult = false;
        boolean result = instance.getBuscarCadena(aguja, pajal);
    }

    /**
     * Test of getBuscarCadena method, of class BuscadorCadenas.
     */
    @Test
    public void testGetBuscarCadena() {
        System.out.println("getBuscarCadena");
        String aguja = "";
        String pajal = "";
        BuscadorCadenas instance = new BuscadorCadenas();
        boolean expResult = false;
        boolean result = instance.getBuscarCadena(aguja, pajal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetBuscarCadenaComoSubsecuencia method, of class BuscadorCadenas.
     */
    @Test
    public void testGetBuscarCadenaComoSubsecuencia() {
        System.out.println("GetBuscarCadenaComoSubsecuencia");
        String agujas = "pato";
        String pajar = "patrocinador";
        BuscadorCadenas instance = new BuscadorCadenas();
        boolean expResult = true;
        boolean result = instance.GetBuscarCadenaComoSubsecuencia(agujas, pajar);
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testGetBuscarCadenaComoSubsecuenciaConNull() {
        System.out.println("GetBuscarCadenaComoSubsecuencia");
        String agujas = null;
        String pajar = "patrocinador";
        BuscadorCadenas instance = new BuscadorCadenas();
        boolean expResult = false;
        boolean result = instance.GetBuscarCadenaComoSubsecuencia(agujas, pajar);                
    }
    
    @Test
    public void testGetBuscarCadenaComoSubsecuenciaNoExitoso() {
        System.out.println("GetBuscarCadenaComoSubsecuencia");
        String agujas = "pato";
        String pajar = "paraguas";
        BuscadorCadenas instance = new BuscadorCadenas();
        boolean expResult = false;
        boolean result = instance.GetBuscarCadenaComoSubsecuencia(agujas, pajar);
        assertEquals(expResult, result);        
    }
}
