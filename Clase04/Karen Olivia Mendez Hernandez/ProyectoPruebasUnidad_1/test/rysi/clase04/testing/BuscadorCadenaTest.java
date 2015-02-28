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
 * @author user
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
        System.out.println("Antes de la clase");
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
        assertEquals(expResult, result);//este metodo dice que deben ser iguales los parametros descritos
        
    }
    
    @Test
    public void testBuscarCadenaConExito() {
        System.out.println("buscarCadenaConExito");
        String aguja = "perro";
        String pajar = "perro";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = true;//resultado esperado, el q se busca.
        boolean result = instance.buscarCadena(aguja, pajar);
        assertEquals(expResult, result);//este metodo dice que deben ser iguales los parametros descritos
        
    }
    
    @Test
    public void testBuscarCadenaConExito2() {
        System.out.println("buscarCadenaconexito2");
        String aguja = "perro";
        String pajar = "gatoperro";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = true;//resultado esperado, el q se busca.
        boolean result = instance.buscarCadena(aguja, pajar);
        assertEquals(expResult, result);//este metodo dice que deben ser iguales los parametros descritos
        
    }
    
    @Test(expected=NullPointerException.class)
    public void testBuscarCadenaConExcepcion() {
        System.out.println("buscarCadenaConExcepcion");
        String aguja = null;
        String pajar = "perro";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = true;//resultado esperado, el q se busca.
        boolean result = instance.buscarCadena(aguja, pajar);
        assertEquals(expResult, result);//este metodo dice que deben ser iguales los parametros descritos
        
    }
    
    @Test
    public void testbuscarCadenaComoSubsecuenciaNoEncontrada() {
        System.out.println("buscarCadenaComoSubsecuenciaNoEncontrada");
        String aguja = "agua";
        String pajar = "ferrocarrilero";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = false;
        boolean result = instance.buscarCadenaComoSubsecuencia(aguja, pajar);
        assertEquals(expResult, result);//este metodo dice que deben ser iguales los parametros descritos
        
    }
    
    @Test
    public void testbuscarCadenaComoSubsecuenciaEncontrada() {
        System.out.println("buscarCadenaComoSubsecuenciaEncontrada");
        String aguja = "foca";
        String pajar = "ferrocarrilero";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = true;
        boolean result = instance.buscarCadenaComoSubsecuencia(aguja, pajar);
        assertEquals(expResult, result);//este metodo dice que deben ser iguales los parametros descritos
        
    }
    
    @Test
    public void testbuscarCadenaComoSubsecuenciaEncontradaIgual() {
        System.out.println("buscarCadenaComoSubsecuenciaEncontrada");
        String aguja = "foca";
        String pajar = "foca";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = true;
        boolean result = instance.buscarCadenaComoSubsecuencia(aguja, pajar);
        assertEquals(expResult, result);//este metodo dice que deben ser iguales los parametros descritos
        
    }
    
    @Test(expected=NullPointerException.class)
    public void testbuscarCadenaComoSubsecuenciaException() {
        System.out.println("buscarCadenaComoSubsecuenciaException");
        String aguja = null;
        String pajar = "ferrocarrilero";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = true;
        boolean result = instance.buscarCadenaComoSubsecuencia(aguja, pajar);
        assertEquals(expResult, result);//este metodo dice que deben ser iguales los parametros descritos
        
    }
    
    @Test
    public void testbuscarCadenaComoSubsecuenciaSinCoincidencias() {
        System.out.println("buscarCadenaComoSubsecuenciaException");
        String aguja = "bota";
        String pajar = "cel";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = false;
        boolean result = instance.buscarCadenaComoSubsecuencia(aguja, pajar);
        assertEquals(expResult, result);//este metodo dice que deben ser iguales los parametros descritos
        
    }
    
    @Test
    public void testbuscarCadenaComoSubsecuenciaNoEncontradaEnordenConsecutivo() {
        System.out.println("buscarCadenaComoSubsecuenciaException");
        String aguja = "sur";
        String pajar = "paraguas";
        BuscadorCadena instance = new BuscadorCadena();
        boolean expResult = false;
        boolean result = instance.buscarCadenaComoSubsecuencia(aguja, pajar);
        assertEquals(expResult, result);//este metodo dice que deben ser iguales los parametros descritos
        
    }
    
}




