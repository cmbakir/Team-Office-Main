package day22_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArraydeTekrarEdenElemanlariSilme {
    public static void main(String[] args) {

        // verilen int bir array'den tekrar eden sayilari silip
        // array'i her sayidan tek bir adet bulunacak hale getirin

        int[] arr = {3,6,4,2,3,4,6,1,7,3,5,6,7,2};

        List<Integer> tekrarEtmeyenList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(!tekrarEtmeyenList.contains(arr[i])) {
                tekrarEtmeyenList.add(arr[i]);


            }

        }
        System.out.println(tekrarEtmeyenList); // [3, 6, 4, 2, 1, 7, 5]

        // verilen array'deki sayilarin tekrarsiz halini bulduk
        // ANCAK su anda array degil arrayList

        int[] tekrarsizArray = new int[tekrarEtmeyenList.size()];

        for (int i = 0; i <tekrarsizArray.length ; i++) {
            tekrarsizArray[i] =tekrarEtmeyenList.get(i);



        }

        arr=tekrarsizArray;
        System.out.println(Arrays.toString(arr));

    }




}



