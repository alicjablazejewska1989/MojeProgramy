package homeworkno1;

/**
 * Created by ablazejewska on 10.09.16.
 */
public class HomeWork2EN{

    enum Suits{
        CLUBS("Clubs"), DIAMONDS("Diamonds"), HEARTS("Hearts"), SPADES("Spades");

        private final String suits;

        Suits(String suits) {
            this.suits = suits;
        }

        public String getSuits() {
            return suits;
        }
    }

    enum Ranks{
        ACE("Ace"), JACK("Jack"), QUEEN("Queen"), King("King");

        private final String ranks;

        Ranks(String ranks) {
            this.ranks = ranks;
        }

        public String getRanks() {
            return ranks;
        }
    }


    public static void main(String[] args) {
        System.out.println(Suits.CLUBS.getSuits() + "-" + Ranks.QUEEN.getRanks());

    }
}