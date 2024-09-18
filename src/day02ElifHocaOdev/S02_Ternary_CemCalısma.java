package day02ElifHocaOdev;

import java.util.Scanner;

public class S02_Ternary_CemCalısma {

    public static void main(String[] args) {

        //Kullanicidan bir sayi al
        //0 dan büyükse ve esitse 10 dan kucuk olup olmadigini kontrol et
        //10 dan kücükse ekrana "rakam" yazdir, degilse "pozitif sayi" yazdir
        //sayi 0 dan kücük ise "nagatif sayi" yazdir

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayı gırınız...");
        int sayı = scanner.nextInt();

        System.out.println(
                sayı >=0 ?  sayı< 10 ?  "rakam" : "pozitif sayı" : "negatif sayı"
        );



    }
}
