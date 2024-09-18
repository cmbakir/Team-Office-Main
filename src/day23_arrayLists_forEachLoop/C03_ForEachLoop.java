package day23_arrayLists_forEachLoop;

public class C03_ForEachLoop {

    public static void main(String[] args) {


        // Verilen int array’deki
        // her elementin karelerini alip,
        // karelerinin toplamini yazdiran bir method olusturun.

        int[] arr1 = {1,0,0,0,5,2};
        herElementinKareleriTopla(arr1); // verilen elemanların kareleri toplamı: 30

        int[] arr2 = {2,3,4,1,5,2};
        herElementinKareleriTopla(arr2); // verilen elemanların kareleri toplamı: 59

        int[] arr3 = {2,3};
        herElementinKareleriTopla(arr3); // verilen elemanların kareleri toplamı: 13

    }

    public static void herElementinKareleriTopla (int arr[] ) {
        int toplam = 0;
        for (int each : arr) {
            toplam+=each*each;
        }
        System.out.println("verilen elemanların kareleri toplamı: "  + toplam);
    }
}
