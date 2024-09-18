package day06_JavaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Odev_2 {
    public static void main(String[] args) {

    /*
     Soru 2:
    Kullanıcı tarafından girilen sayıları toplayan bir Java programı yazınız.
    Metodunuz varargs kullanarak herhangi bir sayıda argüman alabilmelidir.
     */

        System.out.println(girilenSayilarinToplami());
        
    }

    private static int girilenSayilarinToplami(int...a) {
        List<String> girilenTumSayilar = new ArrayList<>();
        int toplam = 0;
        String girilenSayi="";
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz\nbitirmek için x e basiniz");

        while(!girilenSayi.equalsIgnoreCase("x")) {
            System.out.println("Lütfen sayı giriniz...");
            girilenSayi= scan.nextLine();
            girilenTumSayilar.add(girilenSayi);

        }
        girilenTumSayilar.remove(girilenTumSayilar.size()-1);

        for (String each : girilenTumSayilar) {
            int bsayi =Integer.parseInt(each);
            toplam+=bsayi;
        }
   
        return toplam;




    }

}
