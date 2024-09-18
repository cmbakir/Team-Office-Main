package day13_forLoop_CemCalısma;

public class C02_forLoopCalismalar {

    public static void main(String[] args) {

        // 1000'den geriye dogru 37 ile bolunebilen sayilari yazdirin

        for (int i = 1000; i >=0 ; i--) {
            if (i % 37 == 0  ) {
                System.out.print(i + " ");
            }

        }

        System.out.println("");

        // 1000'den geriye dogru 3 basamakli 37 ile bolunebilen sayilari yazdirin

        for (int i = 1000; i >=0 ; i--) {
            if (i % 37 == 0 && i >99 ) {
                System.out.print(i + " ");
            }

        }

        System.out.println("");
        // verilen pozitif tamsayi degeri icin faktoryel degerini hesaplayin
        // 6! = 6 * 5 * 4 * 3 * 2 * 1

        int sayi = 6;
        int faktoryel=1;

        for (int i = sayi; i>=1; i--) {
            faktoryel*=i;
                      }
        System.out.println(sayi + "! :"   + faktoryel);

    }
}
