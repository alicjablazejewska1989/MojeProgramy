import java.util.HashMap;
import java.util.Map;

/**
 * Created by ablazejewska on 10.09.16.
 */
public class ex2 {


    public static void main(String[] args){
        Person p1 = new Person("Adam", "Kwiatkowski","896472928914");
        Person p2 = new Person("Kasia", "Malinowski","809789787395");
        Person p3 = new Person("Ania","Michak","989790857426236");
        Person p4 = new Person("Wojtek","Kowalski","984676473647335");

        Map<String, Person> persons = new HashMap<String, Person>(); //String - klucz mapy(tutaj PESEL0, Person: typ person jest dozwolonym typem tej mapy
        persons.put(p1.getPesel(), p1); // dodajemy osobę do Map
        persons.put(p2.getPesel(), p2);
        persons.put(p3.getPesel(), p3);
        persons.put(p4.getPesel(), p4);
        //person.putAll(person<? extends String, ? extends Person>); //chyba. dodawać ma wszystko

        System.out.println(persons);

        for(String key: persons.keySet()){
            Person person = persons.get(key);
        }

        for(Map.Entry<String, Person> entry: persons.entrySet()){
            entry.getValue();
        }

    }

}