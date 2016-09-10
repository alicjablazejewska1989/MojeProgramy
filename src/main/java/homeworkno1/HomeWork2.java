package homeworkno1;

/**
 * Created by ablazejewska on 10.09.16.
 */
public class HomeWork2 {

    public static void main(String[] args) {
        int suitUser = 1;
        int rankUser = 5;

        Card card = new Card(suitUser,rankUser);
        System.out.println("nr koloru karty [1:Clubs, 2:Diamonds, 3:Hearts, 4:Spades] to:" + card.getSuit());
        System.out.println("nr figury karty [5:Ace, 6:Jack, 7:Queen, 8:King] to:" + card.getRank());

        System.out.println(card);


    }
}