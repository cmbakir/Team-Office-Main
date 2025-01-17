package day22_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C11_PozitifTamBolenlerListesi {

    public static void main(String[] args) {

        // Verilen pozitif bir tamsayiyi,
        // tam bolebilen tum pozitif tamsayilari
        // bir liste olarak bize donduren bir method olusturun.
        // sayi = 40 ==> 1, 2, 4, 5, 8, 10, 20, 40

        System.out.println(getTambolenSayilar(40)); // [1, 2, 4, 5, 8, 10, 20, 40]

    }

    public static List<Integer> getTambolenSayilar (int sayi) {

        List<Integer> tamBolenListe =new ArrayList<>();
        for (int i = 1; i <=sayi ; i++) {
            if(sayi % i == 0) {
                tamBolenListe.add(i);
            }

        }
        return tamBolenListe;
    }


}
