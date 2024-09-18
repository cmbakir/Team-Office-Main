package day01_QA_Team45;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class RG33_ArrayTersCevirme_Cem {
    public static void main(String[] args) {

                /*33-----
                Bir arrayi tersine çeviren  method yazınız.

                Test Data:

                reverse [1, 2, 3, 4]
                return  [4, 3, 2, 1]
                */

        int arr [] = {1,2,3,4,5,6,7,8};
        arrayReverse(arr);

    }

    private static void arrayReverse(int [] arr) {
        List<Integer> tersArray =new ArrayList<>(arr.length);

        for (int i = arr.length-1; i >=0 ; i--) {
            tersArray.add(arr[i]);


        }
        System.out.println(tersArray);
    }
}
