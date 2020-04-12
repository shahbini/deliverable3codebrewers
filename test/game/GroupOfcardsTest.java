/*
 * Group Name: CodeBrewers
 * Group Members: Binita | Kirandeep | Amandeep | Rahul
 * Project: Deliverable 3
 * Description: test cases for Group of cards class
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
public class GroupOfcardsTest {
    
    public GroupOfcardsTest() {
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
     * Test of getCard method, of class GroupOfcards.
     */
    @Test
    public void testGetCard() {
        System.out.println("getCard");
        int cardNumberPosition = 0;
        GroupOfcards instance = new GroupOfcards();
        Tmp expResult = null;
        Tmp result = instance.getCard(cardNumberPosition);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfCards method, of class GroupOfcards.
     */
    @Test
    public void testGetNumberOfCards() {
        System.out.println("getNumberOfCards");
        GroupOfcards instance = new GroupOfcards();
        int expResult = 0;
        int result = instance.getNumberOfCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class GroupOfcards.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        GroupOfcards instance = new GroupOfcards();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
