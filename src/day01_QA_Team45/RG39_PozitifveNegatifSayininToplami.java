package day01_QA_Team45;

public class RG39_PozitifveNegatifSayininToplami {
    public static void main(String[] args) {

         /*39-----
    Bir dizi içerisindeki pozitif tam sayı sayısını ve
    negatif tam sayıların toplamını return (array olarak) eden bir method yazınız.

    Örnek:
    countPositivesSumNegative ([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15])
    [10, -65]
    // Toplam 10 pozitif sayı var.
    // Tüm negatif sayıların toplamı -65'tir.

    Notlar :
    Boş bir dizi verilirse, boş bir dizi döndürür: []
    0 pozitif değil.
    */

        int [] arr ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        pozitifVeNegatifSayilarinToplami(arr);

    }

    private static void pozitifVeNegatifSayilarinToplami(int [] arr) {
        int pozitifToplam = 0;
        int negatifToplam = 0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>0) {
                pozitifToplam+=arr[i];
            } else {
                negatifToplam+=arr[i];
            }

        }
        System.out.println("Pozitif Sayilarin Toplamı : " + pozitifToplam+ " ve" + "Negatif Sayilarin Toplamı :" + negatifToplam);
    }
}
// Pozitif Sayilarin Toplamı : 55 veNegatif Sayilarin Toplamı :-65

