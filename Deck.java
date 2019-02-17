//@author Han-PC
package backj;

public class Deck {

    String[] SUITS = {
        "Clubs", "Diamonds", "Hearts", "Spades"
    };

    String[] RANKS = {
        "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "12 Jack", "13 Queen", "14 King", "1 Ace"
    };

    int n = SUITS.length * RANKS.length;
    String[] deck = new String[n];

    public Deck() {

        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
            }
        }
    }

    public void Suffle() {
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
    }
}
