import java.util.*;

/**
 * Created by ablazejewska on 10.09.16.
 */
public class ex1 {

    List<String> distinct(List<String> names) {
        Set<String> uniqueNames = new HashSet<String>(names); //z listy robimy zbior unikalnych elementów
        List<String> list = new ArrayList<String>(uniqueNames); //ze zbioru ponownie tworzymy listę
        return list; // zwracamy listę
    }

    public static void main(String[] args){
        List<String> names = new ArrayList<String>();
        names.add("Asia");
        names.add("Asia");
        names.add("Milena");

        ex1 ex1 = new ex1();
        List<String> unique = ex1.distinct(names);
        System.out.println(unique);
    }

}
