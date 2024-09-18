package day01_QA_Team45;

public class RG36_AsalSayi {
    public static void main(String[] args) {



    /*36-----
    Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.

    Test Data:

    isPrime(31)
    true

    isPrime(18)
    false
    */

        sayiAsalMi(18);
    }

    private static void sayiAsalMi(int sayi) {
        boolean kontrol=true;

        for (int i = 2; i <= sayi/2+1; i++) {
            if(sayi % i == 0) {
                kontrol=false;
                System.out.println(sayi+ " sayisi Asal mi? :" + kontrol);
                break;


            } else {
                System.out.println(sayi+ " sayisi Asal mi? :" + kontrol);
            }

        }
    }
}
