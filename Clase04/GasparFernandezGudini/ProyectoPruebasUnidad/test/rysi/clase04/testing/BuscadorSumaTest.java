/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.clase04.testing;

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
 * @author Gudini
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
        System.out.println("Después de la clase");
    }
    
    @Before
    public void setUp() {
        System.out.println("Antes del test");
    }
    
    @After
    public void tearDown() {
        System.out.println("Después del test");
    }

    /**
     * Test of buscarSubconjuntoConSuma method, of class BuscadorSuma.
     */
    @Test
    public void testBuscarSubconjuntoConSumaExito() {
        System.out.println("buscarSubconjuntoConSumaExito");
        List<Integer> conjunto = Arrays.asList(1, 3, 5, 7, 9);
        Integer Suma = 3;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = true;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, Suma);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBuscarSubconjuntoConSumaExito2() {
        System.out.println("buscarSubconjuntoConSumaExito2");
        List<Integer> conjunto = Arrays.asList(0, 10, 20, 30, 40);
        Integer Suma = 0;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = true;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, Suma);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBuscarSubconjuntoConSumaNoEncontrada() {
        System.out.println("buscarSubconjuntoConSumaNoEncontrada");
        List<Integer> conjunto = Arrays.asList(7, 8, 9, 13, 15);
        Integer Suma = -14;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = false;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, Suma);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBuscarSubconjuntoConSumaNoEncontrada2() {
        System.out.println("buscarSubconjuntoConSumaNoEncontrada2");
        List<Integer> conjunto = Arrays.asList(1, 2, 4, 6, 8);
        Integer Suma = 30;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = true;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, Suma);
        assertEquals(expResult, result);
    }
    
    @Test(expected = NullPointerException.class)
    public void testBuscarSubconjuntoConSumaConExcepcion() {
        System.out.println("buscarSubconjuntoConSumaConExcepcion");
        List<Integer> conjunto = null;
        Integer Suma = 8;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = true;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, Suma);
    }
    
    @Test(expected = NullPointerException.class)
    public void testBuscarSubconjuntoConSumaConExcepcion2() {
        System.out.println("buscarSubconjuntoConSumaConExcepcion2");
        List<Integer> conjunto = Arrays.asList(1, 2, 3, 4, 5);
        Integer Suma = null;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = true;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, Suma);
    }
}
