package day01_QA_Team45;

import java.util.Scanner;

public class RG16_StrBuyukHarfeCevirme {

    public static void main(String[] args) {

            /*16----
            Girilen stringdeki tüm karakterleri büyük harfe dönüştürmek için bir Java programı yazın.

            Test Data:
            java is fun

            Beklenen Çıktı:
            JAVA IS FUN
            */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String str = scan.nextLine();

        System.out.println(str.toUpperCase());
    }
}
