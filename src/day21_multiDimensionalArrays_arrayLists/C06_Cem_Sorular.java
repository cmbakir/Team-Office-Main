package day21_multiDimensionalArrays_arrayLists;

public class C06_Cem_Sorular {

    public static void main(String[] args) {


        //Soru 4- Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
        //method olusturun.

        int[][] arr =  {{3,4,5}, {2,3,6,7}};

        System.out.println(tumSayilarinCarpimi(arr));
    }

    public static int tumSayilarinCarpimi (int [][] arr) {

        int carpim=1;

        for (int i = 0; i <arr.length ; i++) {
            int j;
            for (j = 0; j < arr[i].length; j++) {


            }


            carpim *= arr[i][j];

        }
        return carpim;

    }

}
