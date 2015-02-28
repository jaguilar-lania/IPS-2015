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
 * @author user
 */
public class BuscarSumaTest {
    
    public BuscarSumaTest() {
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
    public void testBuscarSumaNoEncontrada() {
        System.out.println("testBuscarSumaNoEncontrada");
        List<Integer> conjunto = new ArrayList(); 
            
            conjunto.add(2);
            conjunto.add(3);
            conjunto.add(3);
            
        Integer suma = 43;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = false;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);//este metodo dice que deben ser iguales los parametros descritos
    }  
    
    @Test(expected=NullPointerException.class)
    public void testBuscarSumaException() {
        System.out.println("testBuscarSumaNoEncontrada");
        List<Integer> conjunto = new ArrayList(); 
            
            conjunto.add(null);
            
            
        Integer suma = 43;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = true;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);//este metodo dice que deben ser iguales los parametros descritos
    } 
    
    @Test
    public void testBuscarSumaConjuntoVacio() {
        System.out.println("testBuscarSumaConjuntoVacio");
        List<Integer> conjunto = new ArrayList();   
        Integer suma = 43;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = false;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);//este metodo dice que deben ser iguales los parametros descritos
    } 
    
    @Test
    public void testBuscarSumaExito() {
        System.out.println("testBuscarSumaExito");
        List<Integer> conjunto = new ArrayList(); 
        conjunto.add(32);
        conjunto.add(22);
        conjunto.add(77);
        
        Integer suma = 54;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = true;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);//este metodo dice que deben ser iguales los parametros descritos
    } 
    
    @Test
    public void testBuscarSumaExitoIgualACero() {
        System.out.println("testBuscarSumaExitoIgualACero");
        List<Integer> conjunto = new ArrayList(); 
        conjunto.add(0);
        conjunto.add(0);
        conjunto.add(0);
        
        Integer suma = 0;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = true;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);//este metodo dice que deben ser iguales los parametros descritos
    } 
    
    @Test
    public void testBuscarSumaNoEncontradaNegativo() {
        System.out.println("testBuscarSumaExitoIgualACero");
        List<Integer> conjunto = new ArrayList(); 
        conjunto.add(40);
        conjunto.add(30);
        conjunto.add(20);
        
        Integer suma = -90;
        BuscadorSuma instance = new BuscadorSuma();
        boolean expResult = false;
        boolean result = instance.buscarSubconjuntoConSuma(conjunto, suma);
        assertEquals(expResult, result);//este metodo dice que deben ser iguales los parametros descritos
    } 
    
    }
