package day01_QA_Team45;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RG38_EnbuyukEnKucukSayiFarki {
    public static void main(String[] args) {


    /*38----
    Verilen array'deki en büyük ve en küçük sayı arasındaki farkı return eden bir method yazınız.

    Örnek -
    farkBul([10, 15, 20, 2, 10, 6])
    18
    */
        int [] arr= {10, 15, 20, 2, 10, 6};
        enBuyukEnKucukFarkı(arr);
    }

    private static void enBuyukEnKucukFarkı(int [] arr) {
       Arrays.sort(arr);
        System.out.println(arr[arr.length-1]-arr[0]);



    }
}
