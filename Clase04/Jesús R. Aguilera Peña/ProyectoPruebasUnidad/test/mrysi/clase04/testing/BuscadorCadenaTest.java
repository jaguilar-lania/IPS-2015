package mrysi.clase04.testing;

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
        System.out.println("Antes del test");
    }
    
    @After
    public void tearDown() {
        System.out.println("Despues del test");
    }

    /**
     * Test of buscarCadena method, of class BuscadorCadena.
     */
    @Test
    public void testBuscarCadenaNoEncontrada() {
        System.out.println("buscarCadenaNoEncontrada");
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
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCadenaComoSubsecuencia method, of class BuscadorCadena.
     */
    @Test(expected = NullPointerException.class)
    public void testBuscarCadenaComoSubsecuenciaAgujasNull() {
        System.out.println("buscarCadenaComoSubsecuenciaAgujasNull");
        String agujas = null;
        String pajar = "";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = false;
        boolean result = instance.buscarCadenaComoSubsecuencia(agujas, pajar);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test(expected = NullPointerException.class)
    public void testBuscarCadenaComoSubsecuenciaPajarNull() {
        System.out.println("buscarCadenaComoSubsecuenciaPajarNull");
        String agujas = "";
        String pajar = null;
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = false;
        boolean result = instance.buscarCadenaComoSubsecuencia(agujas, pajar);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBuscarCadenaComoSubsecuenciaConsecutivaExitosa() {
        System.out.println("buscarCadenaComoSubsecuenciaExitosa");
        String agujas = "ordinario";
        String pajar = "extraordinario";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = true;
        boolean result = instance.buscarCadenaComoSubsecuencia(agujas, pajar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBuscarCadenaComoSubsecuenciaNoConsecutivaExitosa() {
        System.out.println("buscarCadenaComoSubsecuenciaNoConsecutivaExitosa");
        String agujas = "errar";
        String pajar = "extraordinario";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = true;
        boolean result = instance.buscarCadenaComoSubsecuencia(agujas, pajar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBuscarCadenaComoSubsecuenciaSinExito() {
        System.out.println("buscarCadenaComoSubsecuenciaSinExito");
        String agujas = "errare";
        String pajar = "extraordinario";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = false;
        boolean result = instance.buscarCadenaComoSubsecuencia(agujas, pajar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBuscarCadenaComoSubsecuenciaPajarEmptyString() {
        System.out.println("buscarCadenaComoSubsecuenciaPajarEmptyString");
        String agujas = "errar";
        String pajar = "";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = false;
        boolean result = instance.buscarCadenaComoSubsecuencia(agujas, pajar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    
}
