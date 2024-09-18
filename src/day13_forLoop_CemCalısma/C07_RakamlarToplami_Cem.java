package day13_forLoop_CemCalısma;

public class C07_RakamlarToplami_Cem {


    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.
        // input : 1453 output => 1+4+5+3 = 13

        int girilenSayi = 1453;

        int basamakSayisi = (girilenSayi+"").length(); // "1453".length() ==> 4
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        for (int i = 1; i <=4; i++) {
            birlerBasamagi = girilenSayi %10;
            rakamlarToplami  += birlerBasamagi;
            girilenSayi/=10;
        }


        System.out.println(rakamlarToplami);

    }
}
