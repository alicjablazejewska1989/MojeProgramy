package homeworkno1;

/**
 * Created by ablazejewska on 10.09.16.
 */
public class Card{

    private static final int SUIT_CLUBS = 1;
    private static final int SUIT_DIAMONDS = 2;
    private static final int SUIT_HEARTS = 3;
    private static final int SUIT_SPADES = 4;
    private static final int RANK_ACE = 5;
    private static final int RANK_JACK = 6;
    private static final int RANK_QUEEN = 7;
    private static final int RANK_KING = 8;

    private int suit;
    private int rank;

    public Card(int suit, int rank) {
        if (suit >= SUIT_CLUBS && suit <= SUIT_SPADES) this.suit = suit;
        else throw new IllegalArgumentException("Wrong input data");
        if (rank >= RANK_ACE && rank <= RANK_KING) this.rank = rank;
        else throw new IllegalArgumentException("Wrong input data");
    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        String stringSuit = new String();
        String stringRank = new String();

        switch (suit) {
            case 1:
                stringSuit = "Clubs";
                break;
            case 2:
                stringSuit = "Diamonds";
                break;
            case 3:
                stringSuit = "Hearts";
                break;
            case 4:
                stringSuit = "Spades";
                break;
        }

        switch (rank) {
            case 5:
                stringRank = "Ace";
                break;
            case 6:
                stringRank = "Jack";
                break;
            case 7:
                stringRank = "Queen";
                break;
            case 8:
                stringRank = "King";
                break;
        }

        return stringSuit + "-" + stringRank;

    }

}