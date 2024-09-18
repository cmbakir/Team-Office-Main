package day06_JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Odev_1 {

    public static void main(String[] args) {

           /*
            Soru 1:
            Verilen bir dizideki en büyük ve en küçük sayıyı bulan bir Java programı yazınız.
            Metodunuz varargs kullanarak herhangi bir sayıda argüman alabilmelidir.
             */


        int[] arr = {2, 6, 44, 221, 23, 54, 17,1, 66, 101, 77};

        arraydakiEnBuyukEnKucuk(arr);

        // versiyon 2
        sayilardanenBuyukEnKucuk(2, 6, 44, 321,425,1);



    }

    private static void sayilardanenBuyukEnKucuk(int...sayilar) {
        int enBuyuk=sayilar[0];
        int enKucuk=sayilar[0];

        for(int each : sayilar) {
            if(each > enBuyuk) {
                enBuyuk=each;
            }
            if(each < enKucuk) {
                enKucuk=each;
            }
        }
        System.out.println("Verilen dizideki en buyuk sayı:" + enBuyuk);
        System.out.println("Verilen dizideki en kucuk sayı:" + enKucuk);
    }

    private static void arraydakiEnBuyukEnKucuk(int arr[]) {

        int enBuyuk = arr[0];
        int enKucuk = arr[0];

        for (int each : arr) {
            if(each>enBuyuk) {
                enBuyuk=each;
            }
            if(each<enKucuk) {
                enKucuk=each;
            }

        }
        System.out.println("Verilen dizideki en buyuk sayı:" + enBuyuk);
        System.out.println("Verilen dizideki en kucuk sayı:" + enKucuk);
    }




}
