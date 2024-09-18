package day01_QA_Team45;

import java.util.Arrays;

public class RG20_SayiVeKelimeSiralama {
    public static void main(String[] args) {

         /*20----
        Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
        not: Test datadaki değerleri kullanınız.


        Test Data:
        [1232, 1134,2345,1022]
        [Java, Python, PHP, C#, C Programming, C++]

        Beklenen Çıktı:
        [1022,1134,1232,2345]
        [C Programming, C#, C++, Java, PHP, Python]
        */
        yol2();
        yol1();

    }

    public static void yol2() {
        int[] liste1 = {1254, 2587, 1026, 2020};
        Arrays.sort(liste1);
        System.out.println(Arrays.toString(liste1));
    }

    private static void yol1() {
        int[] liste = {1232, 1134, 2345, 1022};//Dizi'mizi oluşturuyoruz

        for (int i = 0; i < liste.length - 1; i++) { //Dizimizin değerlerini sırası ile alıyoruz

            int sayi = liste[i]; //sıradaki değeri sayi değişkenine atıyoruz
            int temp = i; //sayi 'nin indeksini temp değerine atıyoruz

            for (int j = i + 1; j < liste.length; j++) { //dizimizde i' den sonraki elemanlara bakıyoruz
                if (liste[j] < sayi) { //sayi değişkeninden küçük sayı var mı
                    sayi = liste[j]; //varsa sayi değişkenimizide değiştiriyoruz
                    temp = j; //indeks değerinide değiştiriyoruz
                }
            }

            if (temp != i) { //temp değeri başlangıç değeri ile aynı değil ise ,
                //yani list[i]'nin değerinden küçük sayı varsa onları yer değiştiriyoruz
                liste[temp] = liste[i];
                liste[i] = sayi;
            }

        }
        for (int sayi : liste) {
            //Bu kısım sıralama ile ilgili değil sadece sıralamanın doğru calısıp calısmadıgını kontrol etmek için
            System.out.print(sayi + " ");

        }

    }
}