package day01_QA_Team45;

public class RG28_ArraydeTekCiftSayiKacAdet_Cem {
    public static void main(String[] args) {

             /*28----
            Array içerisindeki tek ve çift sayıların
            kaçar tane olduğunu bulan Java Kodu yazınız.

            Array: [1,2,3,4,5,6,7,8,9]

            Beklenen Çıktı:

            Tek Sayilar: 5
            Cift Sayilar: 4
    */

        int [] arr = {12,21,33,44,51,60,70,83,97,25,67};
        int tekSayilar=0;
        int ciftSayilar=0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2 == 0) {
                ciftSayilar++;
            }
            if(arr[i]%2!=0) {
                tekSayilar++;
            }

        }
        System.out.println("Tek Sayılar : " + tekSayilar + "\n" + "Cift Sayılar: " + ciftSayilar);
    }
}
