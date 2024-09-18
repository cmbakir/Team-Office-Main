package day06_JavaPractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ATM {

    static Scanner scan = new Scanner(System.in);
    static String kartno="123456";
    static String sifre="1234";
    static double bakiye=30000;
    static double miktar=0.0;
    static double cmiktar=0.0;

    public static void main(String[] args) {

    /*
             ATM EKRANI VE ISLEMLER
        -Kullanicidan giriş için kart numarasi ve şifresini isteyin,
           eger herhangi birini yanlis girerse tekrar girmesini isteyin.
        -Kart numarasini boşluk ile girerse, eger numara doğruysa kabul edin.
        -Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri (Menu listesi) ekrana yazdirin.
        -Menu listesinde;
               Bakiye sorgulama, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis
               islemleri olacaktır.
        -Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez ve gönderilemez.
        -Para gönderme işleminde istenen iban TR ile baslamali ve toplam 10 karakter olmali,
            eger iban bu kriterlere uygun değilse menü ekranina geri donmelidir.
       - Sifre değiştirme işlemini yapmadan önce mevcut şifreyi teyit etmelidir.
         */


        giris();


    }

    public static void giris() {
        System.out.println("\t**********JAVABANK'A HOSGELDINIZ********\n " +
                "\tGuvenliginiz için şifreyi kimse ile paylaşmayın");

        System.out.println("Lutfen kart numaranizi giriniz...");
        String kkartNo = scan.nextLine();

        System.out.println("Lutfen kart sifrenizi giriniz...");
        String kkartSifre= scan.next();

      //  kkartNo=kkartNo.replaceAll("//s","");
        if(kkartNo.equals(kartno) && kkartSifre.equals(sifre)) {
            System.out.println("Giriş Başarılı");
            menu();
        } else {
            System.out.println("Bilgiler dogru degil tekrar deneyin");
            giris();
        }
    }

    public static void menu() {
        System.out.println("Yapmak istediginiz işlemin numarasını tuşlayın\n" +
                "1.BAKİYE SORGULAMA\n" +
                "2.PARA YATIRMA\n" +
                "3.PARA CEKME\n" +
                "4.PARA GONDERME\n" +
                "5.SIFRE DEGISTIRME\n" +
                "6.CIKIS\n" +
                "Seciminiz: ");

        int secim = scan.nextInt();
        scan.nextLine();

        switch (secim) {
            case 1: {
                bakiyesorgulama();
                break;
            } case 2: {
                System.out.println("Lutfen yatıracagınız para miktarını giriniz...");
                double miktar = scan.nextDouble();
                parayatirma(miktar);
                break;
              } case 3: {
                System.out.println("Lutfen cekmek istediginiz miktari giriniz...");
                double cmiktar= scan.nextDouble();
                paracekme(cmiktar);
                break;
            } case 4: {
                paragonderme();
                break;
            } case 5 :{
                sifredegistirme();
                break;
            } case 6: {
                System.out.println("Programdan çıkılmıştır");
                break;
            } default :
                System.out.println("Gecerli bir secim yapiniz...");
                menu();

        }
    }

    private static void sifredegistirme() {
        System.out.println("Mevcut sifrenizi giriniz");
        String kontrolSfire = scan.nextLine();
        if (kontrolSfire.equals(sifre)) {
            System.out.println("Lutfen yeni sifrenizi giriniz...");
            String yeniSifre = scan.nextLine();
            // System.out.println("Sifreniz güncellendi"); 4 rakamli olmasinin önemi yoksa bunu yazdir
            if (yeniSifre.length() == 4) {
                sifre = yeniSifre;
                System.out.println("Şifreniz güncellendi");
                menu();
            } else {
                System.out.println("Şifreniz 4 karakterli olmalıdır");
                sifredegistirme();
            }
        } else {
            System.out.println("Şifreniz eşleşmedi, tekrar deneyiniz ");
            sifredegistirme();
        }
    }

    private static void paragonderme() {

        System.out.println("Lutfen IBAN no giriniz ( TR ile başlamalı ve 10 karakter uzunlugunda olmalıdır");
        String ibanNo = scan.nextLine().toUpperCase().replaceAll("\\s", "");
        if(ibanNo.startsWith("TR") && ibanNo.length()==10) {
            System.out.println("Göndereceginiz miktari yaziniz...");
            double gönderilenMiktar= scan.nextDouble();
                if(gönderilenMiktar<=bakiye) {
                    bakiye-=gönderilenMiktar;
                    System.out.println("Para Basarı ile gönderildi !!!, Kalan bakiye : ");
                    bakiyesorgulama();
                    } else {
                    System.out.println("Bakiyeniz yeterli degil !!!");
                    menu();
                }
                } else {
            System.out.println("Girilen IBAN No 10 karakter uzunlugunda olmalıdır !!!");
            paragonderme();

        }
    }

    private static void paracekme(double cmiktar) {
        if(cmiktar<=bakiye) {
            bakiye-=cmiktar;
            bakiyesorgulama();
        } else {
            System.out.println("Bakiyeniz yetersiz tekrar deneyiniz...");
            paracekme(scan.nextDouble());
        }


    }

    private static void parayatirma(double miktar) {
        bakiye+=miktar;
        bakiyesorgulama();
    }


    public static void bakiyesorgulama() {
        System.out.println("Bakiyeniz : " + bakiye);
        menu();

    }
}
