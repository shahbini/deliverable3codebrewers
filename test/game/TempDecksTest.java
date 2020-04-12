/*
 * Group Name: CodeBrewers
 * Group Members: Binita | Kirandeep | Amandeep | Rahul
 * Project: Deliverable 3
 * Description: test cases for tempdecks class
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
public class TempDecksTest {
    
    public TempDecksTest() {
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
     * Test of addDeck method, of class TempDecks.
     */
    @Test
    public void testAddDeck() {
        System.out.println("addDeck");
        GroupOfcards d = null;
        TempDecks instance = new TempDecks();
        instance.addDeck(d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDecks method, of class TempDecks.
     */
    @Test
    public void testAddDecks() {
        System.out.println("addDecks");
        int numberOfDecks = 0;
        TempDecks instance = new TempDecks();
        instance.addDecks(numberOfDecks);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCard method, of class TempDecks.
     */
    @Test
    public void testGetCardGood() {
        System.out.println("getCard");
        int cardNumber = 0;
        TempDecks instance = new TempDecks();
        Tmp expResult = null;
        Tmp result = instance.getCard(cardNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testGetCardBad() {
        System.out.println("getCard");
        int cardNumber = 0;
        TempDecks instance = new TempDecks();
        Tmp expResult = null;
        Tmp result = instance.getCard(cardNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testGetCardBoundary() {
        System.out.println("getCard");
        int cardNumber = 0;
        TempDecks instance = new TempDecks();
        Tmp expResult = null;
        Tmp result = instance.getCard(cardNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNextCard method, of class TempDecks.
     */
    @Test
    public void testGetNextCard() {
        System.out.println("getNextCard");
        TempDecks instance = new TempDecks();
        Tmp expResult = null;
        Tmp result = instance.getNextCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shuffle method, of class TempDecks.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        TempDecks instance = new TempDecks();
        instance.shuffle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class TempDecks.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        TempDecks instance = new TempDecks();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TempDecks.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TempDecks instance = new TempDecks();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
