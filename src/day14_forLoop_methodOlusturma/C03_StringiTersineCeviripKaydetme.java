package day14_forLoop_methodOlusturma;

import java.util.Scanner;

public class C03_StringiTersineCeviripKaydetme {

    public static void main(String[] args) {

        //Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();
        String tersmetin = "";

        for (int i = metin.length()-1; i >=0 ; i--) {

            tersmetin +=metin.charAt(i);


        }

        System.out.print("girilen metin'in ters metni:" + tersmetin);
        System.out.println("");

        if (metin.equalsIgnoreCase(tersmetin)) {
            System.out.println("olm bu aynısı çıktı yani Palindrome lem");
        } else {
            System.out.println("Palindrome degil");
        }
    }
}
