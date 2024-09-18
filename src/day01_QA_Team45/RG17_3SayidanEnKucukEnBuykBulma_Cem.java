package day01_QA_Team45;

import java.util.Scanner;

public class RG17_3SayidanEnKucukEnBuykBulma_Cem {
    public static void main(String[] args) {

            /*17---
            Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.

            Test data:
            12,24,34

            Beklenen Çıktı:
            12
            */

        enKucukSayiBulma();



    }

    public static int enKucukSayiBulma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1.sayiyi giriniz...");
        int sayi1 = scan.nextInt();
        System.out.println("Lutfen 2.sayiyi giriniz...");
        int sayi2 = scan.nextInt();
        System.out.println("Lutfen 3.sayiyi giriniz...");
        int sayi3 = scan.nextInt();
        int enKucuk = 100;
        if (sayi1 < enKucuk && sayi1<sayi2 && sayi2<sayi3) {
            enKucuk = sayi1;
            System.out.println("Girilen en kucuk sayi:" + sayi1);
        } else if (sayi2 < enKucuk && sayi2<sayi3 && sayi2<sayi1) {
            enKucuk = sayi2;
            System.out.println("Girilen en kucuk sayi:" + sayi2);
        } else {
            enKucuk = sayi3;
            System.out.println("Girilen en kucuk sayi:" + sayi3);
        }
        return enKucuk;


    }


}
