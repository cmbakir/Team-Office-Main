package day16_MethodKullanma_MethodOverloading;

import java.util.Scanner;

public class C02_FaktoryelHesaplama {
    public static void main(String[] args) {

        // Verilen pozitif tamsayinin faktoryel degerini bize donduren bir method olusturun.
        // 6! = 6 * 5 * 4 * 3 * 2 * 1 ==> 720

        System.out.println(faktoryelDegeriDondur(6));

        // Kullanicidan pozitif bir tamsayi alip
        // sayi ile sayinin faktoryel degerini toplayip sayi variable'ina atayin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayı giriniz...");
        int sayi = scanner.nextInt();

        sayi=sayi + faktoryelDegeriDondur(sayi);
        // görev bitti ama kontrol edelim.

        System.out.println(sayi);

    }

    public static int faktoryelDegeriDondur (int sayi) {

        int faktoryel =1;
        for (int i = 1; i <=sayi ; i++) {
            faktoryel*=i;
        }

        return faktoryel;
    }


}
