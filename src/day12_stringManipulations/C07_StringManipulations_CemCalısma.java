package day12_stringManipulations;

import java.util.Scanner;

public class C07_StringManipulations_CemCalısma {

    public static void main(String[] args) {

        //  Kullanicidan isim ve soyismini ayri ayri alin.
        //	- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        //	- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ısmınızı giriniz...");
        String isim = scanner.nextLine();
        System.out.println("Lutfen soyisminizi giriniz...");
        String soyIsım = scanner.nextLine();

      if (isim.length() > soyIsım.length()) {
          System.out.println(
                  isim.substring(0,1).toUpperCase()
                  + isim.substring(1).toLowerCase()
                  + " "
                  +soyIsım.substring(0,1).toUpperCase()
                  +soyIsım.substring(1)
          );
      } else {
          System.out.println(
                  isim.substring(0,1).toUpperCase()
                   +isim.substring(1).toLowerCase()
                   +" "
                  +soyIsım.toUpperCase()


          );

      }





    }
}
