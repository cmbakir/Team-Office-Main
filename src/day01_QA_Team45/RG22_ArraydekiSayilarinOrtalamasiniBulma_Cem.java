package day01_QA_Team45;

public class RG22_ArraydekiSayilarinOrtalamasiniBulma_Cem {
    public static void main(String[] args) {

             /*22----
            Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

            Array =  [20, 30, 25, 35, -16, 60, -100 ]

            Beklenen Çıktı:
            Array Sayılarının ortalaması: 7.0
            */

        int arr1[] = {20, 30, 25, 35, -16, 60, -100};
        int ortalama=0;
        int toplam=0;


        for (int i = 0; i <arr1.length ; i++) {
         toplam+=arr1[i];
            ortalama=toplam/ arr1.length;


        }
        System.out.println("Array sayilarin toplamı:" + ortalama);
    }
}
