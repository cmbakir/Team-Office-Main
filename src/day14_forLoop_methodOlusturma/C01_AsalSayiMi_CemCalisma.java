package day14_forLoop_methodOlusturma;

import java.util.Scanner;

public class C01_AsalSayiMi_CemCalisma {

    public static void main(String[] args) {


        // Kullanicidan pozitif bir tamsayi isteyip,
        // sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayı giriniz...");
        int sayi = scanner.nextInt();
        boolean asalMi = true;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                System.out.print("Asal sayı degil ");
                asalMi = false;
                break;

            }
        }
        if (asalMi) {
            System.out.print("asal");
        }

    }
}


