package day23_arrayLists_forEachLoop;

public class C02_ForEachLoop {

    public static void main(String[] args) {


        int[] arr = {3, 7, 1, 0, 5};
        // arr'deki tum elementlerin toplamini yazdirin


        int toplam = 0;

        for (int each : arr) {
            toplam += each;

        }

        System.out.println(toplam);
    }


}
