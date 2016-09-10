import java.util.ArrayList;
import java.util.List;

/**
 * Created by ablazejewska on 10.09.16.
 */
public class Task4 {

    public static final String STALA = "100";
    private final List<String> a = new ArrayList<String>();

    private final int b = 0;

    //public void foo(Person p){
        //p = new Person("b","b","b");
    //}
    //public void foo(Person a, Person b){
      //  if(a.equals(b)){
            // wtedy niestety musimy nadpisać equals :(
      //  }

      //  if(a.getPesel().equals(b.getPesel())){
            //teraz aby porównać obiekty nie musimy nadpisywać equals
      //  }
   //}



    public static void main(String[] args) {
        Task4 t = new Task4();
        Person p1 = new Person("v","v","v");
        Person p2 = new Person("v","v","v");
        //t.foo(p1);

        //System.out.println(p2);

        //System.out.println(p1.getName());

        if(p1.equals(p2)){
            System.out.println("p1.equals(p2)");
        }
        else{
            System.out.println("!p1.equals(p2)");
        }

        if(p1 == (p2)){
            System.out.println("p1 == p2");
        }
        else{
            System.out.println("!p1 == p2");
        }

    }
}
