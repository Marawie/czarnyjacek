package BlackJack;

import java.util.ArrayList;

public class Deck {
    Card card;
    final int MAX_DECK = 52;
    ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<>();
    }

    public Deck(boolean makingdeck) {
        deck = new ArrayList<>();
        if (makingdeck) {
            for (Card.CardRank rank : Card.CardRank.values()) ;
            for (Card.CardSuit suit : Card.CardSuit.values()) {
                deck.add(new Card(rank,suit));
            }
        }
    }

    public void addCard(Card card) {
        deck.add(card);
    }

    public String toString() {
        String output = "";
        for (Card card : deck) {
            output += card;
            output += "\n";
        }
        return output;
    }

}
}

