/*
 * Group Name: CodeBrewers
 * Group Members: Binita | Kirandeep | Amandeep | Rahul
 * Project: Deliverable 3
 * Description: test cases for player class
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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of placeBet method, of class Player.
     */
    @Test
    public void testPlaceBetGood() {
        System.out.println("placeBet");
        double b = 0.0;
        Player instance = null;
        instance.placeBet(b);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
       @Test
    public void testPlaceBetBad() {
        System.out.println("placeBet");
        double b = 0.0;
        Player instance = null;
        instance.placeBet(b);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
       @Test
    public void testPlaceBetBoundary() {
        System.out.println("placeBet");
        double b = 0.0;
        Player instance = null;
        instance.placeBet(b);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of changeBet method, of class Player.
     */
    @Test
    public void testChangeBet() {
        System.out.println("changeBet");
        double betMultiplier = 0.0;
        Player instance = null;
        instance.changeBet(betMultiplier);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBank method, of class Player.
     */
    @Test
    public void testUpdateBank() {
        System.out.println("updateBank");
        double betMultiplier = 0.0;
        Player instance = null;
        instance.updateBank(betMultiplier);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextAction method, of class Player.
     */
    @Test
    public void testNextActionGood() {
        System.out.println("nextAction");
        Player instance = null;
        int expResult = 0;
        int result = instance.nextAction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testNextActionBad() {
        System.out.println("nextAction");
        Player instance = null;
        int expResult = 0;
        int result = instance.nextAction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testNextActionBoundary() {
        System.out.println("nextAction");
        Player instance = null;
        int expResult = 0;
        int result = instance.nextAction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of hit method, of class Player.
     */
    @Test
    public void testHit() {
        System.out.println("hit");
        Tmp c = null;
        Player instance = null;
        instance.hit(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBet method, of class Player.
     */
    @Test
    public void testGetBetGood() {
        System.out.println("getBet");
        Player instance = null;
        double expResult = 0.0;
        double result = instance.getBet();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testGetBetBad() {
        System.out.println("getBet");
        Player instance = null;
        double expResult = 0.0;
        double result = instance.getBet();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testGetBetBoundary() {
        System.out.println("getBet");
        Player instance = null;
        double expResult = 0.0;
        double result = instance.getBet();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getHand method, of class Player.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        Player instance = null;
        Hand expResult = null;
        Hand result = instance.getHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBank method, of class Player.
     */
    @Test
    public void testGetBank() {
        System.out.println("getBank");
        Player instance = null;
        double expResult = 0.0;
        double result = instance.getBank();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
