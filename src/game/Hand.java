/*
 * Group Name: CodeBrewers
 * Group Members: Binita | Kirandeep | Amandeep | Rahul
 * Project: Deliverable 3
 * Description: 
 */
package game;

import java.util.ArrayList;

/**
 *
 * @author Amandeep
 */
public class Hand {

    private ArrayList<Tmp> hand;

    public Hand() {
        hand = new ArrayList<Tmp>();
    }

    public int getValue() {
        int value = 0;
        if (hand.size() > 0) {
            if (hand.get(0).getNumericValue() == 11) {
                for (int i = 1; i < hand.size(); i++) {
                    if (hand.get(i).getNumericValue() == 11) {
                        hand.get(i).changeAceValue(false);
                    }
                }
            } else if (getRawValue() > 21) {
                for (Tmp c : hand) {
                    if (c.getNumericValue() == 11) {
                        c.changeAceValue(false);
                    }
                }
            }

            for (Tmp c : hand) {
                value += c.getNumericValue();
            }
        } else {
            value = 0;
        }
        return value;
    }

    public int getNumberOfCards() {
        return hand.size();
    }

    public void addCard(Tmp c) {
        hand.add(c);
    }

    public Tmp get(int i) {
        return hand.get(i);
    }

    public void emptyHand() {
        hand.clear();
    }

    public boolean isBust() {
        boolean bust = false;
        if (getValue() > 21) {
            bust = true;
        } else {
            bust = false;
        }
        return bust;
    }

    public boolean hasBlackJack() {
        boolean jack = false;

        if (hand.size() == 2) {
            if ((hand.get(0).getNumericValue() == 11 && hand.get(1).getNumericValue() == 10)
                    || (hand.get(0).getNumericValue() == 10 && hand.get(1).getNumericValue() == 11)) {
                jack = true;
            }
        } else {
            jack = false;
        }
        return jack;
    }

    public boolean hasFiveCardCharlie() {
        boolean charlie = false;
        if (getValue() <= 21 && getNumberOfCards() >= 5) {
            charlie = true;
        } else {
            charlie = false;
        }
        return charlie;
    }

    public boolean hasTwentyOne() {
        boolean twentyOne = false;
        if (getValue() == 21) {
            twentyOne = true;
        } else {
            twentyOne = false;
        }
        return twentyOne;
    }

    private int getRawValue() {
        int rawValue = 0;
        for (Tmp c : hand) {
            rawValue += c.getNumericValue();
        }
        return rawValue;
    }

    public String toString() {
        String h = "";
        for (Tmp c : hand) {
            h += c.toString();
        }
        return h;
    }
}
