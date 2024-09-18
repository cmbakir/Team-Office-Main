package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C05_DoWhileLoopCem {
    public static void main(String[] args) {

        // kullanicidan toplanmak uzere sayilar isteyin
        // kullanici 0'a bastiginda islemi bitirin
        // ve girilen sayilar icerisinde en kucuk olan sayiyi yazdirin

        Scanner scanner = new Scanner(System.in);
        int sayi = 35;
        int enKucuksayi=Integer.MAX_VALUE;


        while(sayi !=0) {
            System.out.println("Lutfen toplanmak için sayi giriniz...");
            sayi=scanner.nextInt();
            if (sayi < enKucuksayi && sayi!=0) {
                enKucuksayi = sayi;
                }

        }
        System.out.println("Girdiginiz sayilardan en kucugu : " + enKucuksayi + "'dır");
    }
}
