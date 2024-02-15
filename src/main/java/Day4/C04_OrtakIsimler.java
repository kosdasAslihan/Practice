package Day4;

import java.util.ArrayList;
import java.util.List;

public class C04_OrtakIsimler {
    public static void main(String[] args) {
        /*

        Iki array'de ortak olan isimleri bir yerde toplayiniz.

        1. Array: { Jace, John, Mark, Jack, Emma}
        2. Array: { Anna, Brad, Johnny, Mark, Emma }

        Mark, Emma

        */

        String[] arr = {"Jace", "John", "Mark", "Jack", "Emma"};
        String[] arr1 = {"Anna", "Brad", "Johnny", "Mark", "Emma"};

        List<String> ortakIsimler = new ArrayList<>();

        for (String s : arr) {
            for (String s2 : arr1) {
                if (s.equals(s2)) {
                    ortakIsimler.add(s);
                /*
                if (s.equalsIgnoreCase(s2)){
                    ortakIsimler.add(s) dediğimizde yine [Mark, Emma] yazdırır
                 */
                }

            }
        }
        System.out.println(ortakIsimler); //[Mark, Emma]

    }
}
