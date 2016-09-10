package homeworkno1;

/**
 * Created by ablazejewska on 10.09.16.
 */
import java.lang.*;
import java.util.*;
import java.io.*;

public class HomeWork1 {
    public static void main(String[] args) {
        final int randomInt = new Random().nextInt(100);
        System.out.println(randomInt);

        double randomDouble = (double) randomInt;
        System.out.println(randomDouble);

        int rounded = (int) Math.round(randomDouble);

        if (rounded == randomDouble) System.out.println("Equal");

    }
}
