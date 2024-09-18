package day02ElifHocaOdev;

import java.util.Scanner;

public class S01_Substring_CemCalısma {

    public static void main(String[] args) {

        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // adinin ilk harfi buyuk digerleri kucuk,
        // soyadinin tamami büyük harfle yazacak sekilde ad ayrı soyad ayrı sekilde alt alta ekrana yazdırınız.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki kelimelik advesoyadınızı giriniz");
        String adsoyad = scanner.nextLine();
        String ad;
        String soyad;

        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        System.out.println(
                ad=adsoyad.substring(0, adsoyad.indexOf(" "))
        );
        System.out.println(
                soyad=adsoyad.substring(adsoyad.indexOf(" ")+1)
        );

        // adinin ilk harfi buyuk digerleri kucuk,
        System.out.println(
                ad.substring(0,1).toUpperCase()
                + ad.substring(1)
                + "\n" + soyad.toUpperCase()

        );

    }
}
