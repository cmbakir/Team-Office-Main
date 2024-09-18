package day21_multiDimensionalArrays_arrayLists;

public class C03_CokKatliArraydeCiftSayilariTopla {

    public static void main(String[] args) {

        // Verilen 2 katli bir array’de
        // bulunan cift sayilari toplayip, sonucu yazdiran bir method olusturun.

        int[][] arr = {{3,6,7},{2,8,1},{4,7},{1}};

        arraydakiCiftSayilariTopla(arr);

        int[][] arr2 = {{3,6,7,10,2},{2,8,1,2},{4,7,100},{1}};
        arraydakiCiftSayilariTopla(arr2);


    }

    public static void arraydakiCiftSayilariTopla (int [] [] arr) {

        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j] % 2 == 0) {
                    toplam+= arr [i][j];

                }
            }

        }
        System.out.println(toplam);
    }

}
