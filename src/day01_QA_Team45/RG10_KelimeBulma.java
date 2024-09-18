package day01_QA_Team45;

import java.util.Scanner;

public class RG10_KelimeBulma {

    public static void main(String[] args) {


        /*10-----
        Kullanıcıdan alınan String kümesi içerisinde aranan String i bulan Java Kodunu yazınız.

        Test Data:
        Java is easy

        Aranan String: is

        Bektenen Çıktı:
        True

        Aranan String: and

        Beklenen Çıktı:False

        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");
        String cumle = scanner.nextLine();
        System.out.println("Lutfen aramak istediğiniz metni giriniz...");
        String arananmetin = scanner.nextLine();
        boolean flag= false;


        if (cumle.contains(arananmetin)) {
            flag =true;
            System.out.println(flag);
        } else {
            flag = false;
            System.out.println(flag);
        }


    }
}
