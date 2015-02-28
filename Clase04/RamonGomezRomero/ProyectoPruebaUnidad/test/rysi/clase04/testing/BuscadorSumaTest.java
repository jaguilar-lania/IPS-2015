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
 * @author Subli
 */
public class BuscadorSumaTest {
    
    public BuscadorSumaTest() {
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
        System.out.println("Antes del test");
    }
    
    @After
    public void tearDown() {
        System.out.println("Despues del test");
    }

    /**
     * Test of buscarSubconjuntoConSuma method, of class BuscadorSuma.
     */
    @Test
    public void testBuscarSubconjuntoConSumaSinExito() {
        System.out.println("buscarSubconjuntoConSumaSinExito");
        List<Integer> conjunto = new ArrayList<>();
        conjunto.add(183);
        conjunto.add(232);
        conjunto.add(102);
        conjunto.add(5);
        conjunto.add(3);
        Integer suma = 4;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = false;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
      @Test
    public void testBuscarSubconjuntoConSumaSinExito2() {
        System.out.println("buscarSubconjuntoConSumaSinExito2");
        List<Integer> conjunto = new ArrayList<>();
        conjunto.add(34);
        conjunto.add(13);
        conjunto.add(78);
        conjunto.add(123);
        conjunto.add(78);
        Integer suma = -89;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = false;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuscarSubconjuntoConSumaConExito() {
        System.out.println("buscarSubconjuntoConSumaConExito");
        List<Integer> conjunto = new ArrayList<>();
        conjunto.add(1);
        conjunto.add(23);
        conjunto.add(10);
        conjunto.add(50);
        conjunto.add(32);
        Integer suma = 55;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = true;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuscarSubconjuntoConSumaConExito2() {
        System.out.println("buscarSubconjuntoConSumaConExito2");
        List<Integer> conjunto = new ArrayList<>();
        Integer suma = 0;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = true;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = NullPointerException.class)
    public void testBuscarSubconjuntoConSumaConExcepcion() {
        System.out.println("buscarSubconjuntoConSumaConExcepcion");
        List<Integer> conjunto = null;
        Integer suma = 34;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = false;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
    }
    
    @Test(expected = NullPointerException.class)
    public void testBuscarSubconjuntoConSumaConExcepcion2() {
        System.out.println("buscarSubconjuntoConSumaConExcepcion2");
        List<Integer> conjunto = null;
        Integer suma = 0;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = false;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
    }
}
