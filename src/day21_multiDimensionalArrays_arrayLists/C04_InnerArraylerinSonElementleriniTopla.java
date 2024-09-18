package day21_multiDimensionalArrays_arrayLists;

public class C04_InnerArraylerinSonElementleriniTopla {

    public static void main(String[] args) {

        // Verilen 2 katli bir array’de
        // her bir inner array’in son elementlerinin toplaminini yazdiran
        // bir method olusturun.

        int[][] arr =  {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
    arraydekiSonElementleriYazdir(arr);

    }

    public static void arraydekiSonElementleriYazdir (int [][] arr) {

        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            toplam += arr[i][arr[i].length-1];



        }
        System.out.println(toplam);

    }
}
