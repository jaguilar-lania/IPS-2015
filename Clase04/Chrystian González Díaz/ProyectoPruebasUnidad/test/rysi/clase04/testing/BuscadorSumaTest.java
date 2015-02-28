/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.clase04.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
public class BuscadorSumaTest {
    
    public BuscadorSumaTest() {
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
     * Test of buscarSubconjuntoConSuma method, of class BuscadorSuma.
     */
    @Test
    public void testBuscarSubconjuntoConSuma() {
        System.out.println("buscarSubconjuntoConSuma");
        List<Integer> conjunto = null;
        Integer suma = null;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = false;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testBuscarSubconjuntoConSuma2() {
        System.out.println("buscarSubconjuntoConSuma");
        List<Integer> conjunto = Arrays.asList(1, 2,7,6) ;
        Integer suma = 10;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = true;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testBuscarSubconjuntoConSuma3() {
        System.out.println("buscarSubconjuntoConSuma");
        List<Integer> conjunto = Arrays.asList(-1,-10,10,1) ;
        Integer suma = 0;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = true;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    
    @Test
    public void testBuscarSubconjuntoConSumaF() {
        System.out.println("No da suma exacta");
        List<Integer> conjunto = Arrays.asList(100,2,9) ;
        Integer suma = 14;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = false;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testBuscarSubconjuntoConSumaBienM() {
        System.out.println("No llega la suma y se esperaba true");
        List<Integer> conjunto = Arrays.asList(44,22,11) ;
        Integer suma = 88;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = true;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testBuscarSubconjuntoConSumaCero() {
        System.out.println("Suma cero");
        List<Integer> conjunto = Arrays.asList() ;
        Integer suma = 0;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = true;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    
    @Test(expected = NullPointerException.class)
    public void testBuscarSubconjuntoConSumaException() {
        System.out.println("Conjunto con Excepcion");
        List<Integer> conjunto = null;
        Integer suma = null;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = false;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
}
