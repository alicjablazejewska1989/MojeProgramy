/**
 * Created by ablazejewska on 10.09.16.
 */
public class ex3 {
    public static void main(String[] args){
        String a1 = "A1";
        String a2 = "A2";
        if (a1 == a2) {
            System.out.println("a1 == a2");
        }
        else {
            System.out.println("a1 != a2");
        }

        if (a1.equals(a2)) {
            System.out.println("a1 equals a2");
        }
        else {
            System.out.println("a1 does not equal a2");
        }

        String a3 = a2;

        if (a3 == a2) {
            System.out.println("a3 == a2");
        }
        else {
            System.out.println("a3 != a2");
        }

        if (a3.equals(a2)) {
            System.out.println("a3 equals a2");
        }
        else {
            System.out.println("a3 does not equal a2");
        }

        String a4 = "A";
        String a5 = "A";

        if (a4 == a5) {
            System.out.println("a4 == a5");
        }
        else {
            System.out.println("a4 != a5");
        }

        if (a4.equals(a5)) {
            System.out.println("a4 equals a5");
        }
        else {
            System.out.println("a4 does not equal a5");
        }

        String a7 = new String("A");
        String a8 = new String( "A");

        if (a7 == a8) {
            System.out.println("a7 == a8");
        }
        else {
            System.out.println("a7 != a8");
        }

        if (a7.equals(a8)) {
            System.out.println("a7 equals a8");
        }
        else {
            System.out.println("a7 does not equal a8");
        }

        Person person1 = new Person("Lukasz","Nowak","8987438272935");
        Person person2 = new Person("Lukasz","Nowak","8987438272935");

        if (person1 == person2) {
            System.out.println("person1 == person2");
        }
        else {
            System.out.println("person1 != person2");
        }

        if (person1.equals(person2)) {
            System.out.println("person1 equals person2");
        }
        else {
            System.out.println("person1 does not equal person2");
        }
    }
}
