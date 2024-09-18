package day23_arrayLists_forEachLoop;

import java.util.ArrayList;

public class C01_Test {

    public static void main(String[] args) {


        int arr[] = new int[5];

        ArrayList<Integer> list = new ArrayList<Integer>();



        for (int i = 1; i <= arr.length; i++) {

            list.add(arr[i]);

        }

        System.out.println(list);

    }

    }

