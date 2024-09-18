package day5_ElifHocaOdev;

import java.util.Scanner;

public class S02_Cay {

    public static void main(String[] args) {

        /*
        Kullaniciya
                * 1 = Gunde kac bardak cay ictigini,
         * 2 = Her bardak icin kac kup seker kullandigini sorup;
        kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda consolda yazdiran bir program yazin.
         * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
        (1 kup seker = 2.77 gr)
    */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Günde kac bardak cay ictiginizi giriniz... ");
        double girilenGunlukBardakSayisi = scanner.nextDouble();
        System.out.println("Her bardak icin kac kup seker kullandıgınızı giriniz...");
        double girilenKupSekerSayisi = scanner.nextDouble();
        double birkupSekerKg = 2.77 / 1000;


        double yillikSekerTuketimi = girilenGunlukBardakSayisi * girilenKupSekerSayisi * birkupSekerKg * 360;
        double kirkYillikSekerTuketimi = girilenGunlukBardakSayisi * girilenKupSekerSayisi * birkupSekerKg * 360 * 40;

        if (girilenKupSekerSayisi < 0 || girilenGunlukBardakSayisi < 0) {
            System.out.println("Negatif bir sayi girilemez...");
        } else if (girilenKupSekerSayisi == 0) {
            System.out.println("Aferin, boyle devam et :)");
        } else {
            System.out.println("Yillik seker tüketiminiz : " + yillikSekerTuketimi + " kg'dir");
            System.out.println("40 yillik seker tüketiminiz : " + kirkYillikSekerTuketimi + " kg'dir");
        }


    }
}

