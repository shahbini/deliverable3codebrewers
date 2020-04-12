/*
 * Group Name: CodeBrewers
 * Group Members: Binita | Kirandeep | Amandeep | Rahul
 * Project: Deliverable 3
 * Description: Dealer class
 */
package game;

import java.util.Scanner;

/**
 * @author Kirandeep
 */
public class Dealer {

    private Player player;
    private TempDecks tempdecks;
    private Hand dealerHand;

    private final static int STAND = 0;
    private final static int HIT = 1;
    private final static int DOUBLEDOWN = 2;

    public Dealer(Player p) {
        tempdecks = new TempDecks(4);
        for (int i = 0; i < 8; i++) {
            tempdecks.shuffle();
        }
        dealerHand = new Hand();
        player = p;
    }

    public Hand getDealerCards() {
        return dealerHand;
    }

    //additional card dealing
    public void hit() {
        player.hit(tempdecks.getNextCard());
    }

    private void dealerHit() {
        dealerHand.addCard(tempdecks.getNextCard());
    }

    public void playDealerHand() {
        while (dealerHand.getValue() < 17) {
            checkForDealerBust();
            dealerHit();
        }
    }

    public void start() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please place a bet:");
        double currentBet = 0.0;
        try {
            currentBet = in.nextDouble();
            if (currentBet > player.getBank()) {
                System.out.println("Insufficient funds for this bet.");
                start();
                return;
            } else if (currentBet < 0) {
                System.out.println("Cannot place a negative bet.");
                start();
                return;
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please input a valid number.");
            start();
            return;
        }

        player.placeBet(currentBet);

        hit();
        hit();
        dealerHit();
        dealerHit();

        System.out.println("Dealer is showing:\n" + dealerHand.get(0));
        System.out.println("\n" + "Your Cards:\n" + player.getHand());

        checkForBlackJack();

        evaluateWinner();
    }

    /**
     * user would like to play again?
     */
    public void playAgain() {
        System.out.println("Would you like to play again? 1 for YES, 2 for NO.");
        Scanner play = new Scanner(System.in);
        int again = 0;
        try {
            again = play.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please input a valid integer.\n");
            playAgain();
            return;
        }

        if (again == 1) {
            player.getHand().emptyHand();
            dealerHand.emptyHand();
            start();
        } else if (again == 2) {
            System.out.println("Thanks for playing!");
            System.exit(0);
        } else {
            System.out.println("Please enter a valid integer.\n");
            playAgain();
        }
    }

    /**
     * Checks either the Dealer or the Player has BlackJack
     */
    public void checkForBlackJack() {
        if (player.getHand().hasBlackJack()) {

            System.out.println("You have BlackJack!\n");
            player.updateBank(1.5);
            System.out.println("Your current bank roll: " + player.getBank());

            playAgain();

        } else if (dealerHand.hasBlackJack()) {

            System.out.println("Dealer has BlackJack!\n");
            player.updateBank(-1);
            System.out.println("Your current bank roll: " + player.getBank());

            playAgain();
        }
    }

    public void checkForBust() {
        if (player.getHand().isBust()) {
            player.updateBank(-1);
            System.out.println("Bust!\n");
            System.out.println("Your current bank roll: " + player.getBank());
            playAgain();
        }
    }

    public void checkForDealerBust() {
        if (dealerHand.getValue() > 21) {
            player.updateBank(1);
            System.out.println("Dealer Bust!\n");
            System.out.println("Your current bank roll: " + player.getBank());
            playAgain();
        }
    }

    public void checkForFiveCardCharlie() {
        if (player.getHand().hasFiveCardCharlie()) {
            player.updateBank(1);
            System.out.println("Five Card Charlie\nYou win!");
            System.out.println("Your current bank roll: " + player.getBank());

            playAgain();
        }
    }

    public void checkForStandardWin() {
        if (player.getHand().getValue() > dealerHand.getValue() && player.getHand().getValue() <= 21) {
            player.updateBank(1);
            System.out.println("You win!\n");
            System.out.println("Your current bank roll: " + player.getBank());

            playAgain();
        } else if (player.getHand().getValue() < dealerHand.getValue() && dealerHand.getValue() <= 21) {
            player.updateBank(-1);
            System.out.println("Dealer wins!\n");
            System.out.println("Your current bank roll: " + player.getBank());

            playAgain();
        }
    }

    public void checkFor21() {
        if (player.getHand().hasTwentyOne()) {
            player.updateBank(1);
            System.out.println("You win!\n");
            System.out.println("Your current bank roll: " + player.getBank());

            playAgain();
        } else if (dealerHand.hasTwentyOne()) {
            player.updateBank(-1);
            System.out.println("Dealer wins!\n");
            System.out.println("Your current bank roll: " + player.getBank());

            playAgain();
        }
    }

    public void evaluateWinner() {
        int action = player.nextAction();

        while (action != STAND && (player.getHand().isBust() == false)) {
            if (action == HIT) {
                hit();

                System.out.println("YOUR HAND: \n" + player.getHand());

                checkForBust();
                evaluateWinner();
                return;
            } else if (action == DOUBLEDOWN && player.getHand().getNumberOfCards() == 2) {
                hit();
                playDealerHand();
                player.changeBet(2);
                if (player.getHand().getValue() > dealerHand.getValue() && player.getHand().isBust() == false) {
                    player.updateBank(1);

                    System.out.println("YOUR HAND:\n" + player.getHand());
                    System.out.println("DEALER'S HAND:\n" + dealerHand);

                    System.out.println("You win!\n");
                    System.out.println("Your current bank roll: " + player.getBank());

                    playAgain();
                    return;
                } else {
                    player.updateBank(-1);

                    System.out.println("YOUR HAND:\n" + player.getHand());
                    System.out.println("\nDEALER'S HAND:\n" + dealerHand);

                    System.out.println("Dealer wins!\n");
                    System.out.println("Your current bank roll: " + player.getBank());

                    playAgain();
                    return;
                }
            } else {
                System.out.println("Cannot double down.");
            }
            evaluateWinner();
        }
        playDealerHand();
        dealerHand.getValue();
        System.out.println("YOUR HAND:\n" + player.getHand());
        System.out.println("DEALER'S HAND:\n" + dealerHand);

        checkForBust();
        checkFor21();
        checkForFiveCardCharlie();
        checkForStandardWin();
        checkForDealerBust();
    }
}
