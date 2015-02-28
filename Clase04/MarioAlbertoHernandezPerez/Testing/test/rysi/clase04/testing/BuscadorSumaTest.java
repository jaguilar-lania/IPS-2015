/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.clase04.testing;

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
 * @author Frost
 */
public class BuscadorSumaTest {
    
    public BuscadorSumaTest() {
    }
    
    @After
    public void tearDown() {
        System.out.println("-------------------------------------------");
    }

    /**
     * Test of buscarSubconjuntoConSuma method, of class BuscadorSuma.
     */
    
    @Test
    public void buscarComoSubsecuencia1() {
        System.out.println("----------buscarSubconjuntoConSuma1----------");
        List<Integer> conjunto = null;
        Integer suma = 0;
        new BuscadorSuma().buscarSubconjuntoConSuma(conjunto, suma);
    }
    
    @Test
    public void buscarComoSubsecuencia2() {
        System.out.println("----------buscarSubconjuntoConSuma2----------");
        List<Integer> conjunto = new ArrayList<Integer>(Arrays.asList(1,2,5,6));
        Integer suma = 0;
        boolean expResult = true;
        boolean result = new BuscadorSuma().buscarSubconjuntoConSuma(conjunto, suma);
        System.out.println("conj: "+conjunto);
        System.out.println("suma: "+suma);
        System.out.println("expe: "+expResult);
        System.out.println("resu: "+result);
        assertEquals(expResult, result);
    }
    
    @Test(expected = NullPointerException.class)
    public void buscarComoSubsecuencia3() {
        System.out.println("----------buscarSubconjuntoConSuma3----------");
        List<Integer> conjunto = null;
        Integer suma = 0;
        new BuscadorSuma().buscarSubconjuntoConSuma(conjunto, suma);
        System.out.println("conj: "+conjunto);
        System.out.println("suma: "+suma);
        System.out.println("expe: NULL");
    }
    
    @Test
    public void buscarComoSubsecuencia4() {
        System.out.println("----------buscarSubconjuntoConSuma4----------");
        List<Integer> conjunto = new ArrayList<Integer>(Arrays.asList(1,2,5,6));
        Integer suma = 6;
        boolean expResult = true;
        boolean result = new BuscadorSuma().buscarSubconjuntoConSuma(conjunto, suma);
        System.out.println("conj: "+conjunto);
        System.out.println("suma: "+suma);
        System.out.println("expe: "+expResult);
        System.out.println("resu: "+result);
        assertEquals(expResult, result);
    }
    
    @Test
    public void buscarComoSubsecuencia5() {
        System.out.println("----------buscarSubconjuntoConSuma5----------");
        List<Integer> conjunto = new ArrayList<Integer>(Arrays.asList(1,2,5,6));
        Integer suma = 200;
        boolean expResult = false;
        boolean result = new BuscadorSuma().buscarSubconjuntoConSuma(conjunto, suma);
        System.out.println("conj: "+conjunto);
        System.out.println("suma: "+suma);
        System.out.println("expe: "+expResult);
        System.out.println("resu: "+result);
        assertEquals(expResult, result);
    }
    
    @Test
    public void buscarComoSubsecuencia6() {
        System.out.println("----------buscarSubconjuntoConSuma6----------");
        List<Integer> conjunto = new ArrayList<Integer>(Arrays.asList(1,2,5,6));
        Integer suma = 7;
        boolean expResult = true;
        boolean result = new BuscadorSuma().buscarSubconjuntoConSuma(conjunto, suma);
        System.out.println("conj: "+conjunto);
        System.out.println("suma: "+suma);
        System.out.println("expe: "+expResult);
        System.out.println("resu: "+result);
        assertEquals(expResult, result);
    }
}
