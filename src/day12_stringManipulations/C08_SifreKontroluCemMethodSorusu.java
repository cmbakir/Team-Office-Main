package day12_stringManipulations;

import java.util.Scanner;

public class C08_SifreKontroluCemMethodSorusu {

    public static void main(String[] args) {

        // olusturdugunuz methodu kullanarak
        // kullanici hatasiz bir sifre girinceye kadar tekrar tekrar sifre isteyin
        // kabul edilebilir bir sifre girdiginde "Sifreniz basarili olarak kaydedildi" yazdirin

        Scanner scanner = new Scanner(System.in);
        String sifre ="";
        boolean sifreUygunlugu =false;

        while (sifreUygunlugu == false) {
            System.out.println("Lutfen bir sifre giriniz...");
            sifre = scanner.nextLine();
            sifreUygunlugu = C08_SifreKontroluCemMethod.sifreKontrol(sifre);


        }
        System.out.println("Sifre basarılı olarak kaydedildi...");
    }
}
