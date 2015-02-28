package rysi.clase04.testing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jaguilar
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
        String pajar = "perro";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = true;
        boolean result = instance.buscarCadena(aguja, pajar);
    }

}








