package day01_QA_Team45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RG34_Array4HarfliKelimeReturn_Cem {
    public static void main(String[] args) {

            /*34-----
            String array dizisindeli 4 harfli kelimeleri return eden methodu yazınız.

            Test Data:
            isFourLetters(["Tomato", "Potato", "Pair"])

             ["Pair"]
    */
        String [] arr ={"Tomato", "Potato", "Pairs","toto","kral","cemo","adam","yuru","demlen"};
        isFourLetter(arr);
    }

    private static void isFourLetter(String [] arr) {
        List<String> kelimeler = new ArrayList<>(arr.length);
        for (int i = 0; i < arr.length ; i++) {
           if(arr[i].length() ==4) {
               kelimeler.add(arr[i]);

           }



        }
        System.out.println(kelimeler);

    }
}
