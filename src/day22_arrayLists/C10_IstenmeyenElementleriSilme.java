package day22_arrayLists;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C10_IstenmeyenElementleriSilme {

    public static void main(String[] args) {


        // Verilen String bir listede
        // istenmeyen harf iceren elementleri silip,
        // kalan kismini list olarak bize donduren bir method olusturun

        List<String> isimListesi =new ArrayList<>(Arrays.asList("Ali", "topu", "Ceme", "Gonder"));


        System.out.println(istenmeyenHarfiSilen(isimListesi, "o"));

    }

    public static List<String> istenmeyenHarfiSilen (List<String> ilkList, String istenmeyenHarf) {

        for (int i = 0; i < ilkList.size() ; i++) {
            if (ilkList.get(i).contains(istenmeyenHarf)) {
                ilkList.remove(ilkList.get(i));
                i--;

            }

        }

        return ilkList;
    }
}
