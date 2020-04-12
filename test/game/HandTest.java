/*
 * Group Name: CodeBrewers
 * Group Members: Binita | Kirandeep | Amandeep | Rahul
 * Project: Deliverable 3
 * Description: Test cases for hand class
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
public class HandTest {
    
    public HandTest() {
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
     * Test of getValue method, of class Hand.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Hand instance = new Hand();
        int expResult = 0;
        int result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfCards method, of class Hand.
     */
    @Test
    public void testGetNumberOfCards() {
        System.out.println("getNumberOfCards");
        Hand instance = new Hand();
        int expResult = 0;
        int result = instance.getNumberOfCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCard method, of class Hand.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Tmp c = null;
        Hand instance = new Hand();
        instance.addCard(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Hand.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int i = 0;
        Hand instance = new Hand();
        Tmp expResult = null;
        Tmp result = instance.get(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of emptyHand method, of class Hand.
     */
    @Test
    public void testEmptyHand() {
        System.out.println("emptyHand");
        Hand instance = new Hand();
        instance.emptyHand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isBust method, of class Hand.
     */
    @Test
    public void testIsBust() {
        System.out.println("isBust");
        Hand instance = new Hand();
        boolean expResult = false;
        boolean result = instance.isBust();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasBlackJack method, of class Hand.
     */
    @Test
    public void testHasBlackJackGood() {
        System.out.println("hasBlackJack");
        Hand instance = new Hand();
        boolean expResult = false;
        boolean result = instance.hasBlackJack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testHasBlackJackBad() {
        System.out.println("hasBlackJack");
        Hand instance = new Hand();
        boolean expResult = false;
        boolean result = instance.hasBlackJack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testHasBlackJackBoundary() {
        System.out.println("hasBlackJack");
        Hand instance = new Hand();
        boolean expResult = false;
        boolean result = instance.hasBlackJack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }


    /**
     * Test of hasTwentyOne method, of class Hand.
     */
    @Test
    public void testHasTwentyOneGood() {
        System.out.println("hasTwentyOne");
        Hand instance = new Hand();
        boolean expResult = false;
        boolean result = instance.hasTwentyOne();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
     @Test
    public void testHasTwentyOneBad() {
        System.out.println("hasTwentyOne");
        Hand instance = new Hand();
        boolean expResult = false;
        boolean result = instance.hasTwentyOne();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
     @Test
    public void testHasTwentyOneBoundary() {
        System.out.println("hasTwentyOne");
        Hand instance = new Hand();
        boolean expResult = false;
        boolean result = instance.hasTwentyOne();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Hand.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Hand instance = new Hand();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
