package rysi.clase04.testing;

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
public class BuscadorCadenaTest {
    
    public BuscadorCadenaTest() {
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
    }
    
    @Test(expected = NullPointerException.class)
    public void testBuscarCadenaConExcepcion() {
        System.out.println("buscarCadenaConExcepcion");
        String aguja = null;
        String pajar = "gato";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = true;
        boolean result = instance.buscarCadena(aguja, pajar);
    }

    /**
     * Test of buscarCadenaComoSubsecuencia method, of class BuscadorCadena.
     */
    @Test
    public void testBuscarCadenaComoSubsecuenciaConExito() {
        System.out.println("buscarCadenaComoSubsecuenciaConExito");
        String agujas = "super";
        String pajar = "supercalifragisiticoespiralidoso";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = true;
        boolean result = instance.buscarCadenaComoSubsecuencia(agujas, pajar);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBuscarCadenaComoSubsecuenciaConExito2() {
        System.out.println("buscarCadenaComoSubsecuenciaConExito2");
        String agujas = "lateral";
        String pajar = "daño colateral";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = true;
        boolean result = instance.buscarCadenaComoSubsecuencia(agujas, pajar);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBuscarCadenaComoSubsecuenciaNoEncontrada() {
        System.out.println("buscarCadenaComoSubsecuenciaNoEncontrada");
        String agujas = "error";
        String pajar = "Generalizar herramientas";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = true;
        boolean result = instance.buscarCadenaComoSubsecuencia(agujas, pajar);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBuscarCadenaComoSubsecuenciaNoEncontrada2() {
        System.out.println("buscarCadenaComoSubsecuenciaNoEncontrada2");
        String agujas = "estar";
        String pajar = "es respetar";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = true;
        boolean result = instance.buscarCadenaComoSubsecuencia(agujas, pajar);
        assertEquals(expResult, result);
    }
    
    @Test(expected = NullPointerException.class)
    public void testBuscarCadenaComoSubsecuenciaConExcepcion() {
        System.out.println("buscarCadenaComoSubsecuenciaConExcepcion");
        String agujas = null;
        String pajar = "Supercalifragilistico";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = false;
        boolean result = instance.buscarCadenaComoSubsecuencia(agujas, pajar);
    }
    
    @Test(expected = NullPointerException.class)
    public void testBuscarCadenaComoSubsecuenciaConExcepcion2() {
        System.out.println("buscarCadenaComoSubsecuenciaConExcepcion2");
        String agujas = "Super";
        String pajar = null;
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = false;
        boolean result = instance.buscarCadenaComoSubsecuencia(agujas, pajar);
    }
}
