package day22_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_ListedenElemanSilme {

    public static void main(String[] args) {


        List<String> harfler = new ArrayList<>(Arrays.asList("A","C","D","E","F","G"));

        System.out.println(harfler); // [A, C, D, E, F, G]

        harfler.remove("G");
        System.out.println(harfler); // [A, C, D, E, F]

        harfler.remove(2);
        System.out.println(harfler); // [A, C, E, F]

        System.out.println(harfler.remove("C"));  // true

        System.out.println(harfler.remove(0)); // A




    }
}
