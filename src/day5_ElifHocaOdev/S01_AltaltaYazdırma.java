package day5_ElifHocaOdev;

public class S01_AltaltaYazdırma {

    public static void main(String[] args) {

        /*
    12345 sayisinin herbir basamagini konsolda altalta yazdirin.
    input: 12345
    output: 1
            2
            3
            4
            5
     */

        int sayi = 78910;
        int birlerBasamagi = sayi % 10;
        sayi=(sayi/10);
        int onlarBasamagi = sayi % 10;
        sayi =(sayi/10);
        int yuzlerBasamagi = sayi % 10;
        sayi =(sayi/10);
        int binlerBasamagi = sayi % 10;
        sayi =(sayi/10);
        int onBinlerBasamagi = sayi % 10;


        System.out.println(onBinlerBasamagi + "\n" + binlerBasamagi + "\n" + yuzlerBasamagi + "\n" + onlarBasamagi + "\n" + birlerBasamagi );


    }
}
