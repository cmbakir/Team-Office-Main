package day01_QA_Team45;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RG24_ArraydeIstenenDegeriBulma_Cem {
    public static void main(String[] args) {

         /*24----
        Yazılan değerin array içerisinde arayan Java Kodu yazınız.

        Array: [1551,1223,1443,1267,1789,1023,2020]


        Aranan Değer:2020
        Beklenen Çıktı:True

        Aranan Değer:2010
        Beklenen Çıktı :False
        */

int arr[] = {1551,1223,1443,1267,1789,1023,2020};
List arraylist1 = new ArrayList(arr.length);

        for (int i = 0; i < arr.length; i++) {
            arraylist1.add(arr[i]);
        }
        System.out.println(arraylist1);

       Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Array listesinde aramak istediginiz sayıyıyı giriniz...");
        int sayi = scan.nextInt();

        if(arraylist1.contains(sayi)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
