package BlackJack;

public class Main {

    public static void main(String[] args) {
Deck decktest = new Deck();
Card addcard1 = new Card(Card.CardRank.AS, Card.CardSuit.RINGS);
Card addcard2 = new Card(Card.CardRank.EIGHT, Card.CardSuit.DIAMONDS);
decktest.addCard(addcard1);
decktest.addCard(addcard2);
        System.out.println(decktest);
        }

    }

