package day01_QA_Team45;

public class RG31_SaatiSaniyeyeCevirme_Cem {

    public static void main(String[] args) {

            /*31----
            Saati saniyeye çeviren java methodunu yazınız.

            Test Data:
            howManySeconds(2);
            Beklenen çıktı:
             7200
            */
        howManySeconds(2);



    }

        public static void howManySeconds (int saat) {
        int saniye=saat*60*60;

            System.out.println(+saat + " saat " + saniye + " saniye yapmaktadır");
    }


}
