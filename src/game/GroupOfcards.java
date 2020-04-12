/*
 * Group Name: CodeBrewers
 * Group Members: Binita | Kirandeep | Amandeep | Rahul
 * Project: Deliverable 3
 * Description: 
 */
package game;

import java.util.ArrayList;

/**
 * @author Kirandeep
 */
public class GroupOfcards {

    //The group of cards, stored in an ArrayList
    private ArrayList<Tmp> cards;

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public GroupOfcards() {
        cards = new ArrayList<Tmp>();
        String suit = "";
        String rank = "";
        int numericValue = 0;
        for (int i = 0; i <= 3; i++) {
            if (i == 0) {
                suit = "Spades";
            } else if (i == 1) {
                suit = "Hearts";
            } else if (i == 2) {
                suit = "Clubs";
            } else if (i == 3) {
                suit = "Diamonds";
            } else {
                suit = "ERROR";
            }
            for (int j = 2; j <= 14; j++) {
                if (j < 10) {
                    if (j == 2) {
                        rank = "Two";
                    } else if (j == 3) {
                        rank = "Three";
                    } else if (j == 4) {
                        rank = "Four";
                    } else if (j == 5) {
                        rank = "Five";
                    } else if (j == 6) {
                        rank = "Six";
                    } else if (j == 7) {
                        rank = "Seven";
                    } else if (j == 8) {
                        rank = "Eight";
                    } else if (j == 9) {
                        rank = "Nine";
                    } else {
                        rank = "ERROR";
                    }

                    cards.add(new Tmp(j, suit, rank));
                } else if (j >= 10 && j <= 13) {
                    if (j == 10) {
                        rank = "Ten";
                    } else if (j == 11) {
                        rank = "Jack";
                    } else if (j == 12) {
                        rank = "Queen";
                    } else if (j == 13) {
                        rank = "King";
                    } else {
                        rank = "ERROR";
                    }

                    cards.add(new Tmp(10, suit, rank));
                } else if (j == 14) {
                    rank = "Ace";
                    cards.add(new Tmp(11, suit, rank));
                }

            }
        }
    }

    public Tmp getCard(int cardNumberPosition) {
        if (!cards.isEmpty()) {
            return cards.get(cardNumberPosition);
        } else {
            return null;
        }
    }

    public int getNumberOfCards() {
        return cards.size();
    }

    @Override
    public String toString() {

        String d = cards.toString();
        return d;

    }
}
