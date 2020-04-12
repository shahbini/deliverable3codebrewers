/*
 * Group Name: CodeBrewers
 * Group Members: Binita | Kirandeep | Amandeep | Rahul
 * Project: Deliverable 3
 * Description: Test case for dealer class 
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
 * @author 
 */
public class DealerTest {
    
    public DealerTest() {
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
     * Test of getDealerCards method, of class Dealer.
     */
    @Test
    public void testGetDealerCards() {
        System.out.println("getDealerCards");
        Dealer instance = null;
        Hand expResult = null;
        Hand result = instance.getDealerCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of hit method, of class Dealer.
     */
    @Test
    public void testHit() {
        System.out.println("hit");
        Dealer instance = null;
        instance.hit();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of playDealerHand method, of class Dealer.
     */
    @Test
    public void testPlayDealerHand() {
        System.out.println("playDealerHand");
        Dealer instance = null;
        instance.playDealerHand();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class Dealer.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        Dealer instance = null;
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of playAgain method, of class Dealer.
     */
    @Test
    public void testPlayAgainGood() {
        System.out.println("playAgain");
        Dealer instance = null;
        instance.playAgain();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
      @Test
    public void testPlayAgainBad() {
        System.out.println("playAgain");
        Dealer instance = null;
        instance.playAgain();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
      @Test
    public void testPlayAgainBoundary() {
        System.out.println("playAgain");
        Dealer instance = null;
        instance.playAgain();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of checkForBlackJack method, of class Dealer.
     */
    @Test
    public void testCheckForBlackJack() {
        System.out.println("checkForBlackJack");
        Dealer instance = null;
        instance.checkForBlackJack();
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of checkForBust method, of class Dealer.
     */
    @Test
    public void testCheckForBust() {
        System.out.println("checkForBust");
        Dealer instance = null;
        instance.checkForBust();
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of checkForDealerBust method, of class Dealer.
     */
    @Test
    public void testCheckForDealerBust() {
        System.out.println("checkForDealerBust");
        Dealer instance = null;
        instance.checkForDealerBust();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of checkForFiveCardCharlie method, of class Dealer.
     */
    @Test
    public void testCheckForFiveCardCharlie() {
        System.out.println("checkForFiveCardCharlie");
        Dealer instance = null;
        instance.checkForFiveCardCharlie();
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of checkForStandardWin method, of class Dealer.
     */
    @Test
    public void testCheckForStandardWin() {
        System.out.println("checkForStandardWin");
        Dealer instance = null;
        instance.checkForStandardWin();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of checkFor21 method, of class Dealer.
     */
    @Test
    public void testCheckFor21Good() {
        System.out.println("checkFor21");
        Dealer instance = null;
        instance.checkFor21();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
      @Test
    public void testCheckFor21Bad() {
        System.out.println("checkFor21");
        Dealer instance = null;
        instance.checkFor21();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
      @Test
    public void testCheckFor21Boundary() {
        System.out.println("checkFor21");
        Dealer instance = null;
        instance.checkFor21();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of evaluateWinner method, of class Dealer.
     */
    @Test
    public void testEvaluateWinner() {
        System.out.println("evaluateWinner");
        Dealer instance = null;
        instance.evaluateWinner();
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }
    
}
