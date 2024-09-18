package day21_multiDimensionalArrays_arrayLists;

import java.util.Arrays;

public class C01_CokKatliArrayler {

    public static void main(String[] args) {

        int[][] ikiKatliArr = { {2,3,4} , {4,8} , {7} , {1,5,6,9} };

        System.out.println(ikiKatliArr [0][2]);
        System.out.println(ikiKatliArr[3][2]);
        System.out.println(Arrays.deepToString(ikiKatliArr));

        System.out.println(Arrays.toString(ikiKatliArr[3]));
    }
}
