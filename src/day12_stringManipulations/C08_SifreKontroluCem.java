package day12_stringManipulations;

import java.util.Scanner;

public class C08_SifreKontroluCem {
    public static void main(String[] args) {


        // Kullanicidan bir sifre isteyip,
        // asagidaki sartlari kontrol edin ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //  - ilk harf kucuk harf olmali
        //  - son karakter rakam olmali
        //  - sifre bosluk icermemeli
        //  - uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz...");
        String sifre = scanner.nextLine();
        int hataSayaci=0;

        if (!Character.isLowerCase(sifre.charAt(0))) {
            System.out.println("Lütfen ilk harfi kucuk giriniz !");
            hataSayaci ++;
        }
        if (!Character.isDigit(sifre.charAt(sifre.length()-1))){
            System.out.println("Lutfen son karakteri bir rakam giriniz...");
            hataSayaci ++;
        }
        if (sifre.contains(" ")) {
            System.out.println("Sifre bosluk iceremez !");
            hataSayaci ++;
        }
        if (sifre.length() < 10) {
            System.out.println("Sifre en az 10 karakter uzunlugunda olmalıdır !");
            hataSayaci ++;
        }
        if (hataSayaci == 0) {
            System.out.println("Tebrikler sifreniz basari ile olusturuldu...");
        }

    }

}
