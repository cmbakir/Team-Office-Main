package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoopCem {
    public static void main(String[] args) {

        // kullanicidan toplanmak uzere sayilar isteyin
        // kullanici 0'a bastiginda islemi bitirin
        // ve girilen sayilar icerisinde en kucuk olan sayiyi yazdirin


        Scanner scanner = new Scanner(System.in);
        int sayi=0;
        int enKucukSayi=Integer.MAX_VALUE;

        do {
            System.out.println("Lutfen toplamak üzere bir sayı giriniz...");
            sayi = scanner.nextInt();
            if (sayi < enKucukSayi) {
                enKucukSayi=sayi;
            }
        }

        while (sayi !=0);
        {
            System.out.println("Girilen en kucuk sayı" + enKucukSayi);
        }

    }
}
