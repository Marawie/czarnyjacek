package BlackJack;

public class Card {
Card card;


    public enum CardRank {
        TWO("TWO", 2),
        THREE("FOUR", 3),
        FOUR("FOUR", 4),
        FIVE("FIVE", 5),
        SIX("SIX", 6),
        SEVEN("SEVEN", 7),
        EIGHT("EIGHT", 8),
        NINE("NINE", 9),
        TEN("TEN", 10),
        JACK("JACK", 10),
        QUEEN("QUEEN", 10),
        KING("KING", 10),
        AS("AS", 11),
        ;

        String rank;
        int value;

        CardRank(String rank, int value) {
            this.rank = rank;
            this.value = value;

        }
    }


    public enum CardSuit {
        DIAMONDS, RINGS, SPADES, HEARTS
    }

    CardRank ranks;
    CardSuit suites
            ;

    public Card(CardRank ranks, CardSuit suites) {
        this.ranks = ranks;
        this.suites = suites;

    }

    public String toString() {
        return "["+ ranks + " of " + suites + "]" + " value of card is:" + ranks.value;
    }
}
