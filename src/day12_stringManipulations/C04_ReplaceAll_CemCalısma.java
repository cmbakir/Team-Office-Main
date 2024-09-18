package day12_stringManipulations;

import java.util.Scanner;

public class C04_ReplaceAll_CemCalısma {

    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve Kredi karti numarasini alin
        // isim ve soyismin ilk harfini buyuk harfe cevirip, kalanlari * yapin
        // kredi karti numarasindaki sayilari * yapip asagidaki formatta yazdirin

        // isminiz : A** **** Y*****  // Ali Mert YOZGAT
        // Kart no : **** **** **** ****


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ısmınızı giriniz...");
        String isim = scanner.nextLine();
        System.out.println("Lutfen soyisminizi giriniz...");
        String soyIsım = scanner.nextLine();
        System.out.println("Lutfen kredi kartı numaranızı giriniz...");
        String kartNo = scanner.nextLine();

        System.out.println(
                "isminiz : " + isim.substring(0,1).toUpperCase()
                +isim.substring(1).replaceAll("\\S", "*")
                 + " " + soyIsım.substring(0,1).toUpperCase()
                +soyIsım.substring(1).replaceAll("\\S", "*")
                + "\nkredi kartı numaranız: " + kartNo.replaceAll("\\d", "*")
        );





    }
}
