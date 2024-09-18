package day01_QA_Team45;

import java.util.Scanner;

public class RG08_StrTerstenYazdirma {
    public static void main(String[] args) {


             /*8----
            Girilen String değerde tersten yazan Java kodunu yazınız.

            Test Data:
            java
            avaj
            */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin= scanner.nextLine();

        String TersMetin = "";

        for (int i = metin.length()-1; i >=0; i--) {
            TersMetin+=metin.charAt(i);

        }
        System.out.print(TersMetin);;

    }
}
