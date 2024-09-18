package day13_forLoop_CemCalısma;

public class C01_forLoopCalismalar {

    public static void main(String[] args) {

        // 1'den baslayip, 50'ye kadar (50 dahil) tek sayilari yazdirin

        for (int i = 1; i <=50; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        // 207'den baslayip 5'er artirarak, 400'den kucuk olan sayilari yazdirin

        for (int i = 207; i <400 ; i+=5) {
            System.out.print(i+ " ");
        }

        System.out.println("");

        // 2 basamakli cift sayilarin toplami kactir?

        int toplam=0;
        for (int i = 10; i < 100; i+=2) {
           toplam +=i;
        }

        System.out.println("");

        // 40 sayisini kalansiz bolebilen pozitif tamsayilari yazdirin

        for (int i = 0; i <=40 ; i++) {
            if (i % 40 == 0) {
                System.out.println(i + " ");
            }
                    }
        System.out.println("");
        // verilen baslangic ve bitis degerleri dahil olmak uzere
        // bu sayilar arasinda 7 ile bolunebilen sayi adedini yazdiri

        int baslangıc = 7;
        int bitis = 14;
        int sayac =0;

        for (int i = baslangıc; i <= bitis ; i++) {
            if (i %7 == 0) {
                sayac ++;
            }

        }

        System.out.print(sayac);


    }
}
