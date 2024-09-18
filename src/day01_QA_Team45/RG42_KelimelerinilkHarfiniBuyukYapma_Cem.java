package day01_QA_Team45;

import java.util.Scanner;

public class RG42_KelimelerinilkHarfiniBuyukYapma_Cem {
    public static void main(String[] args) {

         /*42----
            İki farklı kelimeyi birleştirip, ilk harfini büyük kalan harfleri
            küçük yapan bir method yazınız.

            Örnekler
            getKelime("kal", "em") ? "Kalem"
            getWord("gözl", "emlemek") ? "Gözlemlemek"
            getWord("zor", "luk") ? "Zorluk"
            */
        ikiKelimeBirlestirIlkHarfBuyuk();

    }

    public static void ikiKelimeBirlestirIlkHarfBuyuk () {

        Scanner scannercan = new Scanner(System.in);
        System.out.println("Lutfen birlestirmek istediginiz 1. kelimeyi giriniz...");
        String str1 = scannercan.nextLine();
        System.out.println("Lutfen birleştirmek istediginiz 2. kelimeyi giriniz..");
        String str2 = scannercan.nextLine();

        String BirlesikKelime = str1 + str2;
        String UpperCaseBirlesikKelime = BirlesikKelime.substring(0,1).toUpperCase()+BirlesikKelime.substring(1);
        System.out.println(UpperCaseBirlesikKelime);


    }
}
