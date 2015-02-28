package mrysi.clase04.testing;

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
 * @author jaguilera
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
    @Test(expected = NullPointerException.class)
    public void testBuscarSubconjuntoConSumaAmbosNull() {
        System.out.println("buscarSubconjuntoConSumaAmbosNull");
        List<Integer> conjunto = null;
        Integer suma = null;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = false;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    @Test(expected = NullPointerException.class)
    public void testBuscarSubconjuntoConSumaCeroListaNull() {
        System.out.println("buscarSubconjuntoConSumaCeroListaNull");
        List<Integer> conjunto = Arrays.asList();
        Integer suma = 0;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = true;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testBuscarSubconjuntoConSumaCeroListaVacia() {
        System.out.println("buscarSubconjuntoConSumaCeroListaVacia");
        List<Integer> conjunto = Arrays.asList();
        Integer suma = 0;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = true;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    @Test
    public void testBuscarSubconjuntoConSumaEncontrada() {
        System.out.println("buscarSubconjuntoConSumaEncontrada");
        List<Integer> conjunto = Arrays.asList(12,98,24);
        Integer suma = 110;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = true;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    @Test
    public void testBuscarSubconjuntoConSumaNoEncontrada() {
        System.out.println("buscarSubconjuntoConSumaNoEncontrada");
        List<Integer> conjunto = Arrays.asList(12,98,24);
        Integer suma = 52;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = false;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    @Test
    public void testBuscarSubconjuntoConSumaConjuntoConElementoNegativo() {
        System.out.println("buscarSubconjuntoConSumaConjuntoConElementoNegativo");
        List<Integer> conjunto = Arrays.asList(12,98,-24);
        Integer suma = 74;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = true;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
