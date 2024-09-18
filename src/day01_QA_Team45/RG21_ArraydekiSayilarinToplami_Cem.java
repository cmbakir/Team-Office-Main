package day01_QA_Team45;

public class RG21_ArraydekiSayilarinToplami_Cem {
    public static void main(String[] args) {
         /*21----
        Array deki sayıları tolpayan Java kodunu yazınız.

        array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        Beklenen Çıktı:
        Array toplamı: 55
    */


        int arr []  =  {2, 8, 10, 20, 50, 10, 100, 250, 50, 17};
        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];


        }
        System.out.println("Array'daki tüm elementlerin toplamı:" + toplam);
    }
}
