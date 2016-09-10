/**
 * Created by ablazejewska on 10.09.16.
 */
public class Person {
    private String name;
    private String surname;
    private String pesel;

    public boolean equals(Object o) {  //equals psuje kontakt hashCode, powinnismy nadpisać zarówno equals jak i hashCode!!!! ALE LEPIEJ TEGO NIE ROBIĆ!!!!
        if(o != null) {
            Person p = (Person) o;//rzutowanie obiektu na obiekt Person
            if (p.name.equals(this.name) && p.surname.equals(this.surname) && p.pesel.equals(this.pesel)) {
                return true;
            }
        }
        return false;
    }

    public Person(String name, String surname, String pesel){
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

}
