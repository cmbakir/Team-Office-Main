package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C02_SayiToplama_Cem {

    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        // Kullanicinin girdigi pozitif sayilarin toplami 500 veya daha fazla oldugunda
        // toplam kac adet pozitif tam sayi girdigini
        // ve bunlarin toplaminin kac oldugunu yazdirin
        // Kullanici 0 veya negatif sayi girerse "sayi pozitif olmalidir " yazdirin
        // ve girilen uygun olmayan sayiyi sayi adedine ve toplama eklemeyin


        Scanner scanner = new Scanner(System.in);
        int sayi=0;
        int tamsayilarToplami =0;
        int sayac=0;

        while(tamsayilarToplami<500) {

            System.out.println("Lutfen toplanmak uzere tam sayılar giriniz...");
            sayi = scanner.nextInt();

            if (sayi >0) {

                tamsayilarToplami+=sayi;
                sayac++;
            } else {
                System.out.println("Sayi pozitif olmalıdır !");

            }
        }
        System.out.println("Toplam : " + sayac + " sayi girdiniz ve girilen sayilarin toplami :" + tamsayilarToplami );

    }
}
