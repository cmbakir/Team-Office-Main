package day01_QA_Team45;

public class RG44_TekrarEdenHarfleriBulun_Cem {
    public static void main(String[] args) {

             /*44----
            String içindeki birden fazla geçen karakter sayısını bulan program yazınız.
             Mesela "Merhaba" kelimesinde sadece a harfi tekrar ettiği için
             bu String için sonuç 1 olacak.
             Eğer herhangi tekrar eden bir harf yoksa 0 sayısını döndersin program.

            Örnekler:
            duplicates("Hello World!")
            Çıktı : 2
            duplicates("foobar")
            Çıktı : 1
            duplicates("helicopter")
            Çıktı : 1
            */

        char aHarf ='o';
        int sayac =0;

        String str = "Cem murtaza bakir";
        for (int i = 0; i < str.length()-1; i++) {

            if(str.charAt(i)==aHarf) {
                sayac++;
            }
        }
        System.out.println("aranan " + aHarf+ " harfi " + str+ " kelimesinde " + sayac + " kez gecer");

    }
}
