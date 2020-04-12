/*
 * Group Name: CodeBrewers
 * Group Members: Binita | Kirandeep | Amandeep | Rahul
 * Project: Deliverable 3
 * Description: Tmp class
 */
package game;

/**
 * @author Binita
 */
public class Tmp extends Card {

    private int numericValue;
    private String suit;
    private String rank;

    public Tmp() {
        numericValue = 0;
        suit = "";
        rank = "";
    }

    Tmp(int value, String s, String r) {
        numericValue = value;
        suit = s;
        rank = r;

    }

    public int getNumericValue() {
        return numericValue;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public void changeAceValue(boolean valueIsOne) {
        if (valueIsOne == true && getNumericValue() == 1) {
            numericValue = 11;
        } else {
            if (getNumericValue() == 11) {
                numericValue = 1;
            }
        }
    }

    @Override
    public String toString() {
        String c = "\nRank: " + getRank() + "\nSuit: " + getSuit()
                + "\nNumeric Value: " + getNumericValue() + "\n";
        return c;
    }
}
