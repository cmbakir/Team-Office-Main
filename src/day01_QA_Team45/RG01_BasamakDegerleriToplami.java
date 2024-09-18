package day01_QA_Team45;

public class RG01_BasamakDegerleriToplami {

    public static void main(String[] args) {


          /*1---
        Sayinin Sayi degerlerinin toplamasini yapan Java kodu yaziniz.

        Test Data
         34
        Beklenen Cikti
        7
        */

     // ornek sayı :34

        int sayi=34;
        int birlerbasamagi=0;
        int basamakToplami=0;


        birlerbasamagi = sayi % 10;
        basamakToplami += birlerbasamagi;
        int oankisayi = sayi /10;
        basamakToplami = birlerbasamagi+oankisayi;


        System.out.println(basamakToplami);



    /*2---
    1 den 20 ye kadar tam sayıları alt alta yazan Java kodu yazınız.
    Hint: For döngüsü kullanınız.
    Beklenen Çıktı:
    1
    2
    3
    4
    .
    .
    .
    19
    20
     */






    }


}
