/*
 * Group Name: CodeBrewers
 * Group Members: Binita | Kirandeep | Amandeep | Rahul
 * Project: Deliverable 3
 * Description: Player class
 */
package game;

import java.util.Scanner;

/**
 * @author Rahul
 */
public class Player {

    private String name;
    private double bet;
    private double bank;
    private Hand myHand;

    private final static int STAND = 0;
    private final static int HIT = 1;
    private final static int DOUBLEDOWN = 2;

    public Player(double bankRoll) {
        name = "";
        bet = 0.0;
        myHand = new Hand();
        bank = bankRoll;
    }

    public void placeBet(double b) {
        bet = b;
    }

    public void changeBet(double betMultiplier) {
        bet *= betMultiplier;
    }

    public void updateBank(double betMultiplier) {
        bank += (bet * betMultiplier);
    }

    public int nextAction() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Would you like to hit(1), stay(2), or double down(3)?");
        int action = -1;
        try {
            action = reader.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please input a valid integer.");
            action = nextAction();
        }
        if (action == 1) {
            return HIT;
        } else if (action == 2) {
            return STAND;
        } else if (action == 3) {
            return DOUBLEDOWN;
        } else {
            return -1;
        }
    }

    public void hit(Tmp c) {
        myHand.addCard(c);
    }

    public double getBet() {
        return bet;
    }

    public Hand getHand() {
        return myHand;
    }

    public double getBank() {
        return bank;
    }
}
