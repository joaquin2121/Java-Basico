/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import APP.clase6.junit.Divisa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class TestDivisa {
    
    public TestDivisa() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
 public void testSumar() throws Exception {
 System.out.println("sumar: ");
 Divisa d1 = new Divisa(10, "Soles");
 Divisa d2 = new Divisa(20, "Soles");
 
 Divisa expResult = new Divisa(30, "Soles");
 Divisa result = d2.sumar(d1);
 
 assertEquals(expResult.getImporte(),result.getImporte());
}
}