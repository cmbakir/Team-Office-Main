package day01_QA_Team45;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RG27_ArrayListtekiEnBuyuk2nciElamaniBulma_Cem {
    public static void main(String[] args) {

             /*27----
            Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

            Array: [1232,2345,5467,678,3454,2312,3451]
            */

        int [] arr = {123,234,567,78,54,312,3451};

        List<Integer> arrList = new ArrayList(arr.length);


        for (int i = 0; i <arr.length ; i++) {
            arrList.add(arr[i]);
            Collections.sort(arrList);


        }
        System.out.println(arrList);
        System.out.println("Array list'in 2. en buyuk sayısı :" + arrList.get(1)+ "'dır");








            }
}
