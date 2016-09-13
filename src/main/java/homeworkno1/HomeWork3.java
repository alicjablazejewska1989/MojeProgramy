package homeworkno1;

/**
 * Created by Alice on 13.09.2016.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Andrzej", "Michalski", "Gdynia"));
        persons.add(new Person("Eleonora", "Drewska", "Kartuzy"));
        persons.add(new Person("Krystian", "Lisek", "Wilno"));
        persons.add(new Person("Aurela", "Wilk", "Drezno"));

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getSurname().compareTo(o2.getSurname());
            }
        });
    }

}