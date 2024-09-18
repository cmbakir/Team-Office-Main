package day01_QA_Team45;

import java.util.Scanner;

public class RG06_Sesli_SessizHarfBulma {

    public static void main(String[] args) {

    /*6----
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
    1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz...");
        String harf = scanner.nextLine().toLowerCase();
        char ilkHarf = harf.charAt(0);


        if (harf.length() != 1 || !Character.isLetter(ilkHarf)) {
            System.out.println("Yanlıs karakter girdiniz ! ");
        } else if (ilkHarf == 'a' || ilkHarf == 'e' || ilkHarf == 'i' || ilkHarf == 'o' || ilkHarf == 'u') {
            System.out.println(ilkHarf + " harfi sesli harftir");
        } else {
            System.out.println(ilkHarf + " harfi sessiz harftir");
        }

    }
}
