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
 * @author Anny
 */
public class BuscadorSumaTest {
    
    public BuscadorSumaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("antes de la clase");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("despues de la clase");
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
     * Test of buscarSubconjuntoConSuma method, of class BuscadorSuma.
     */
    @Test
    public void testBuscarSubconjuntoConSumaSinExito() {
        System.out.println("buscarSubconjuntoConSumaSinExito");
        List<Integer> conjunto = new ArrayList<Integer>();
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);
        Integer suma = 0;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = true;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuscarSubconjuntoConSumaConExito() {
        System.out.println("buscarSubconjuntoConSumaConExito");
        List<Integer> conjunto = new ArrayList<Integer>();
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);
        Integer suma = 20;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = false;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBuscarSubconjuntoConSumaConExito2() {
        System.out.println("buscarSubconjuntoConSumaConExito2");
        List<Integer> conjunto = new ArrayList<Integer>();
        conjunto = null;
        Integer suma = 0;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = false;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBuscarSubconjuntoConSumaConExito3() {
        System.out.println("buscarSubconjuntoConSumaConExito3");
        List<Integer> conjunto = new ArrayList<Integer>();
        conjunto = null;
        Integer suma = 10;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = false;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testBuscarSubconjuntoConSumaConExito4() {
        System.out.println("buscarSubconjuntoConSumaConExito4");
        List<Integer> conjunto = new ArrayList<Integer>();
        conjunto.add(7);
        conjunto.add(3);
        Integer suma = 10;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = true;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
     public void testBuscarSubconjuntoConSumaSinExito2() {
        System.out.println("buscarSubconjuntoConSumaSinExito2");
        List<Integer> conjunto = new ArrayList<Integer>();
        Integer suma = 10;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = false;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
