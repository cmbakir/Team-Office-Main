package day01_classOlusturma;

import java.util.Scanner;

public class C03_Denemeler {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz... E:erkek, K:kadın");
        char cinsiyet = scanner.nextLine().toUpperCase().charAt(0);
        System.out.println("Lütfen yasınızı giriniz...");
        int yas = scanner.nextInt();

        if (cinsiyet == 'K') {
            if (yas >=18) {
                System.out.println("Yasınız :" + yas + " Kadınsınız ve tebrikler ehliyet alabilirsiniz...");
            } else
                System.out.println("Yasınız :" + yas + " Ehliyet almak için " + (18- yas) + " yıl daha bekleyeceksiniz");
            }

         else if (cinsiyet == 'E') {
             if (yas>=18) {
            System.out.println("Yasınız :" + yas + " Erkeksiniz ve tebrikler ehliyet alabilirsiniz...");
            } else
            System.out.println("Yasınız :" + yas + " Ehliyet almak için " + (18-yas) + " yıl daha bekleyeceksiniz");

        } else {
            System.out.println("Lütfen gecerli bir karakter giriniz...");
        }


    }
}
