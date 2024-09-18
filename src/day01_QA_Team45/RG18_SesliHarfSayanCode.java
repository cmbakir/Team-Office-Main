package day01_QA_Team45;

public class RG18_SesliHarfSayanCode {
    public static void main(String[] args) {


            /*18----
            Girilen Stringdeki tüm sesli harfleri saymak için bir Java Methodu yazınız.

            Test Data:
            java is fun

            Beklenen Çıktı:

            Stringdeki sesli harf sayısı: 4
            */

        String cumle = "baskan";
        int sayac = 0;

        for (int i = 0; i <cumle.length() ; i++) {
            char c=cumle.toLowerCase().charAt(i);
            if(c=='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                sayac++;
            }

        }
        System.out.println("Cumledeki sesli harf sayısı: " + sayac);
    }

}
