package day43_map;

import java.util.Collection;
import java.util.Map;

public class C03_SoyisimdenOgrenciBilgisiYazdirma_Cem {
    public static void main(String[] args) {

        // verilen soyisim'e sahip ogrencilerin
        // sinif sube isim ve soyisimlerini
        // alt alta yazdirin

        Map<Integer, String> ogrenciMap =MapMethodDepo.ogrenciMapOlustur();
        // esitligin sag tarafi depo'dan hazir map'i alip getirdi
        // biz gelen hazir map'i bu class'da olusturdugumuz
        // ogrenci map'ine atadik

        String arananSoyisim = "Cem";

        System.out.println(ogrenciMap);

        // 1- tum value'lari alirim ve kaydederim
        Collection<String> ogrenciValueCollection = ogrenciMap.values();

        // 2- herbir value'u split ile ayirip
        //    soyisminin istenen soyisim olup olmadigini kontrol ederim

        for (String eachValue : ogrenciValueCollection) {
            String [] eachValueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]

            if (eachValueArr[1].equalsIgnoreCase(arananSoyisim)){

                System.out.println(eachValueArr[2] + " " + eachValueArr[3] + " "+
                        eachValueArr[0] + " " + eachValueArr[1] );
            }
        }




    }
}
