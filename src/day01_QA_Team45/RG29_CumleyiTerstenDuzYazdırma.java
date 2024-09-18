package day01_QA_Team45;

import java.util.Scanner;

public class RG29_CumleyiTerstenDuzYazdırma {
    public static void main(String[] args) {


            /*29----
            Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

            Test Data:
            sentence -> "Java is fun"
            reversed -> "fun is Java"
    */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen tersten yazdırılmasını istediginiz bi metin giriniz...");
        String metin= scan.nextLine();
        String tersMetin="";

        for (int i =metin.length()-1 ; i >=0; i--) {
            tersMetin+=metin.charAt(i);

        }
        System.out.println(tersMetin);
    }
}
