package day5_ElifHocaOdev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class S01_ArrayList_SicaklikGostergesi {
    public static void main(String[] args) {

        // Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
        // 100 girildiğinde veri girişi sonlandırılsın.
        // Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.


        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> sicakliklar = new ArrayList<>();
        double girilenSicaklik = 0.0;
        int sonlandirmaSayisi = 100;
        int sayac = 0;
        double enSicak = 0.0;
        double enSoguk = 0.0;

        System.out.println("Sıcaklık degerlerini giriniz, sonlandirmak için 100 giriniz !!");

        do {
            girilenSicaklik = scanner.nextDouble();
            if (girilenSicaklik != 100) {
                sicakliklar.add(girilenSicaklik);
                sayac++;
            }

        } while (girilenSicaklik != 100);
        {
            System.out.println("Veri girişi sonlandi");
        }

        if(!sicakliklar.isEmpty()) {
            Collections.sort(sicakliklar);
            enSoguk=sicakliklar.get(0);
            System.out.println("Girdiğiniz sicaklik degerlerinden En Soguk olanı: " + enSoguk);
            enSicak=sicakliklar.get(sicakliklar.size()-1);
            System.out.println("Girdiğiniz sicaklik degerlerinden En Sicak olanı: " + enSicak);
            System.out.println("Toplam : " + sayac+ " adet sayı girildi");
        }

        //Veri girişi sonlandi
        //Girdiğiniz sicaklik degerlerinden En Soguk olanı: 12.0
        //Girdiğiniz sicaklik degerlerinden En Sicak olanı: 98.0
        //Toplam : 6adet sayı girildi
    }
}

