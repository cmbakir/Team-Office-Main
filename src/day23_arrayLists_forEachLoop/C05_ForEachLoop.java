package day23_arrayLists_forEachLoop;

import java.util.Arrays;

public class C05_ForEachLoop {

    public static void main(String[] args) {

        // Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        String cumle = "Biz de voltrani olusturalim";
        String arananHarf = "g";

        String [] karakterler = cumle.split("");
        System.out.println(Arrays.toString(karakterler));
        int sayac=0;

        for (String each : karakterler) {
            if(each.equals(arananHarf)) {
                sayac++;
            }

        }

        if(sayac == 0) {
            System.out.println(arananHarf +" harfi "+ cumle + " cumlesinde kullanılmadı");
        } else {
            System.out.println(arananHarf +" harfi "+  cumle+ " cumlesinde " + sayac + " kez kullanıldı"); // a harfi Biz de voltrani olusturalim cumlesinde 2 kez kullanıldı
        }

    }
}
