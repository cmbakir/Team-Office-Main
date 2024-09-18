package day17_whileLoop_doWhileLoop;

public class C04_RakamlarToplamiMethoduCem {
    public static void main(String[] args) {


        System.out.println(sayiRakamlarToplamiBul(1256));

    }

    public static int sayiRakamlarToplamiBul(int sayi) {

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int dummyNumber = sayi;

        while (dummyNumber != 0) {
            birlerBasamagi = dummyNumber % 10;
            rakamlarToplami += birlerBasamagi;
            dummyNumber /= 10;

        }
        return rakamlarToplami;
    }
}

