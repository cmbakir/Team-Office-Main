package day23_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_ForEachLoop {
    public static void main(String[] args) {

        //Verilen String bir array’deki her bir elementi kontrol edip,
        //	- Kelimenin uzunlugu cift sayi ise ilk yarisini
        //	- Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        //	yeni bir listeye ekleyip yazdirin.

        String[] arr = {"Okul","Ders","Zor","Kolay","Cocuk isi","imkansiz"};

        List<String> yeniListe = new ArrayList<>();

        for (String each : arr) {
            if(each.length() % 2 == 0) {
               yeniListe.add(each.substring(0,each.length()/2));
                } else {
                yeniListe.add(each.substring(each.length()/2));

            }

        }
        System.out.println(yeniListe); // [Ok, De, or, lay, k isi, imka]

    }
}
