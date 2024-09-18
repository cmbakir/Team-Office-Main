package day21_multiDimensionalArrays_arrayLists;

public class C02_CokKatliArrayler {

    public static void main(String[] args) {

        int[] arr = {3,6,7,8,9,1};

        // arr'nin tum elementlerinin toplamini yazdirin

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i];
        }
        System.out.print(toplam);
        System.out.println("");

        int[][] ikiKatliArr = {{3,6,7},{2,8,1},{4,7},{1}};
        int toplam2=0;

        for (int i = 0; i < ikiKatliArr.length ; i++) {
            for (int j = 0; j < ikiKatliArr[i].length; j++) {

                toplam2+=ikiKatliArr[i][j];


            }

        }
        System.out.print(toplam2);


        System.out.println("");


        int[][] ikiKatliArr2 = {{3,-6,7},{2,-8,1},{4,5},{-1}};
        int toplam3=0;

        // iki katlı array de tüm poztif elemanlarını sayıları toplayın

        for (int i = 0; i <ikiKatliArr2.length ; i++) {
            for (int j = 0; j < ikiKatliArr2[i].length; j++) {

                if (ikiKatliArr2[i][j] >0) {
                    toplam3+=ikiKatliArr2[i][j];
                }

            }

        }
        System.out.print(toplam3);

    }




}
