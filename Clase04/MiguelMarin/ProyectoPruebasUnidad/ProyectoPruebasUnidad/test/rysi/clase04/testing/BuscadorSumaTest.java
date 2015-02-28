/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.clase04.testing;

import java.util.ArrayList;
import java.util.List;
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
    public void testBuscarSubconjuntoConSumaExito() {
        System.out.println("buscarSubconjuntoConSumaExito");
        List<Integer> conjunto = new ArrayList<Integer>();
        conjunto.add(10);
        conjunto.add(5);
        Integer suma = 15;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = false;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testBuscarSubconjuntoConSumaExito2() {
        System.out.println("buscarSubconjuntoConSumaExito2");
        List<Integer> conjunto = new ArrayList<Integer>();
        Integer suma = 0;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = false;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testBuscarSubconjuntoConSumaExito3() {
        System.out.println("buscarSubconjuntoConSumaExito3");
        List<Integer> conjunto = new ArrayList<Integer>();
        conjunto.add(4);
        conjunto.add(8);
        conjunto.add(12);
        conjunto.add(16);
        Integer suma = 20;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = false;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     @Test
    public void testBuscarSubconjuntoConSumaNoEncontrada() {
        System.out.println("buscarSubconjuntoConSumaNoEncontrada");
        List<Integer> conjunto = new ArrayList<Integer>();
        conjunto.add(20);
        conjunto.add(25);
        conjunto.add(30);
        Integer suma = 10;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = false;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     @Test
    public void testBuscarSubconjuntoConSumaNoEncontrada2() {
        System.out.println("buscarSubconjuntoConSumaNoEncontrada2");
        List<Integer> conjunto = new ArrayList<Integer>();
        conjunto.add(400);
        conjunto.add(230);
        conjunto.add(210);
        Integer suma = 24;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = false;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test(expected = NullPointerException.class)
    public void testBuscarSubconjuntoConSumaExcepcion() {
        System.out.println("buscarSubconjuntoConSumaExcepcion");
        List<Integer> conjunto = null;
        Integer suma = 24;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = false;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    
}
