/*
 * Group Name: CodeBrewers
 * Group Members: Binita | Kirandeep | Amandeep | Rahul
 * Project: Deliverable 3
 * Description: test cases for tmp class
 */
package game;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LENOVO
 */
public class TmpTest {
    
    public TmpTest() {
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

    /**
     * Test of getNumericValue method, of class Tmp.
     */
    @Test
    public void testGetNumericValue() {
        System.out.println("getNumericValue");
        Tmp instance = new Tmp();
        int expResult = 0;
        int result = instance.getNumericValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuit method, of class Tmp.
     */
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        Tmp instance = new Tmp();
        String expResult = "";
        String result = instance.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRank method, of class Tmp.
     */
    @Test
    public void testGetRank() {
        System.out.println("getRank");
        Tmp instance = new Tmp();
        String expResult = "";
        String result = instance.getRank();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeAceValue method, of class Tmp.
     */
    @Test
    public void testChangeAceValueGood() {
        System.out.println("changeAceValue");
        boolean valueIsOne = false;
        Tmp instance = new Tmp();
        instance.changeAceValue(valueIsOne);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
   @Test
    public void testChangeAceValueBad() {
        System.out.println("changeAceValue");
        boolean valueIsOne = false;
        Tmp instance = new Tmp();
        instance.changeAceValue(valueIsOne);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
       @Test
    public void testChangeAceValueBoundary() {
        System.out.println("changeAceValue");
        boolean valueIsOne = false;
        Tmp instance = new Tmp();
        instance.changeAceValue(valueIsOne);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    /**
     * Test of toString method, of class Tmp.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Tmp instance = new Tmp();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
