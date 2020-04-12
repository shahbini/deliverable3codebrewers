/*
 * Group Name: CodeBrewers
 * Group Members: Binita | Kirandeep | Amandeep | Rahul
 * Project: Deliverable 3
 * Description: TempDecks class
 */
package game;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Binita
 */
public class TempDecks {

    private ArrayList<Tmp> tempdecks;
    private int decks = 0;

    public TempDecks() {
        tempdecks = new ArrayList<Tmp>();
    }

    public TempDecks(int numberOfDecks) {
        tempdecks = new ArrayList<Tmp>();
        decks += numberOfDecks;

        for (int i = 0; i < numberOfDecks; i++) {
            GroupOfcards deck = new GroupOfcards();
            for (int j = 0; j < 52; j++) {
                tempdecks.add(deck.getCard(j));
            }
        }
    }

    public void addDeck(GroupOfcards d) {
        for (int i = 0; i < 52; i++) {
            tempdecks.add(d.getCard(i));
        }
        decks++;
    }

    public void addDecks(int numberOfDecks) {
        for (int i = 0; i < numberOfDecks; i++) {
            GroupOfcards deck = new GroupOfcards();
            for (int j = 0; j < 52; j++) {
                tempdecks.add(deck.getCard(j));
            }
        }
        decks += numberOfDecks;
    }

    public Tmp getCard(int cardNumber) {
        Tmp c = tempdecks.get(cardNumber - 1);
        return c;
    }

    public Tmp getNextCard() {
        Tmp c = tempdecks.get(0);
        tempdecks.remove(0);
        return c;
    }

    public void shuffle() {
        ArrayList<Tmp> temp = new ArrayList<Tmp>();
        int shoeSizeFinal = decks * 52;

        for (int i = shoeSizeFinal; i > 0; i--) {
            Random gen = new Random();
            int random = gen.nextInt(i);

            Tmp c = tempdecks.get(random);
            temp.add(c);
            tempdecks.remove(random);
        }
        tempdecks = temp;
    }

    public void reset() {
        TempDecks s = new TempDecks(decks);
        shuffle();
    }

    public String toString() {
        String s = tempdecks.toString() + "\n\n" + tempdecks.size();
        return s;
    }
}
