/*
 * Group Name: CodeBrewers
 * Group Members: Binita | Kirandeep | Amandeep | Rahul
 * Project: Deliverable 3
 * Description: Abstract class card 
 */
package game;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game.
 *
 * @author Sivagama
 */
public abstract class Card {
    //default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a
     * regular playing card etc.
     */
    public abstract String toString();
}
