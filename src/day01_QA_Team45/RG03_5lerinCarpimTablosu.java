package day01_QA_Team45;

public class RG03_5lerinCarpimTablosu {

    public static void main(String[] args) {


    /*3----
    Belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.

    Örnek Sonuç:
    5 x 1 = 5
    5 x 2 = 10
    5 x 3 = 15
    5 x 4 = 20
    5 x 5 = 25
    5 x 6 = 30
    5 x 7 = 35
    5 x 8 = 40
    5 x 9 = 45
    5 x 10 = 50
    */


        int sayi = 5;
        int carpim=1;
        int toplam=0;

        for (int i = 1; i <=10 ; i++) {

            toplam = sayi * i ;
            System.out.print("\n" + sayi + "x" +i+" = " + toplam);




        }

    }
}
