package day22_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ListMethodlari {

    public static void main(String[] args) {


        List<String> isimler = new ArrayList<>(Arrays.asList("Cem", "Serkan", "Savas", "Ahmet", "Eren", "Burak","Koray"));

        System.out.println(isimler);
        System.out.println(isimler.remove(5)); // Burak
        isimler.set(0,"Saglikli Cem");
        System.out.println(isimler);
        isimler.set(0, "Zengin ve Saglikli Cem");
        System.out.println(isimler);

        isimler.remove(4);
        System.out.println(isimler);

        isimler.add("Kemal");
        System.out.println(isimler);




    }
}
