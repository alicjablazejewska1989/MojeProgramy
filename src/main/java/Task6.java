/**
 * Created by ablazejewska on 10.09.16.
 */
public class Task6 {

    //public void foo(int a) {
      //  if (a == 0) {
      //      throw new IllegalArgumentException("A cannot be 0");
      //  }
    //}

    public void foo(int a) {
        try {
            if (a == 0) {
                throw new Exception("jakis message");
            }
        } catch (Exception e){
            //log.error("aasss",s)   <-- obsługa poprzez logger
            throw new RuntimeException("Blad w metodzie foo",e); //takie podejście tez jest złe
        }
    }

    public void foo2(int a){
        foo(a);
    }

    public void validatePesel(int pesel){
            if(pesel <= 5){
                throw new RuntimeException("Błędna suma kontrolna");
            }
            if(pesel <= 10){
                throw new RuntimeException("Błędny pesel");
            }
    }

   /// public BlednaSumaKontrolnaException extends Exception {} <- jest możliwe napisanie własnego wyjątku, ale nie rób,y tego, jest w Javie wystarczająco ich !!!

    public static void main(String[] args) {
        Task6 task6 = new Task6();
        //task6.foo(0);
        int a = 6;

        task6.validatePesel(4);
    }

    /**
     * Napisz metodę validatePesel(int pesel), która
     * w przypadku kiedy pesel <5 rzuci wyjątek "Błędna suma kontrolna"
     * w przypadku kiedy pesel >5, a mniejszy oz 10 zostanie rzucony wyjatek "Błędny pesel"
     * w przypadku kiedy pesel >10 nie będzi erzucony wyjatek
     * Obsłuż każdą z sytuacji
     */


}
