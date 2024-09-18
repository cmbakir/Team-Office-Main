package day44_maps;

import day43_map.MapMethodDepo;

import java.util.Collection;
import java.util.Map;

public class C01_BilgiyeUlasma_Cem {

    public static void main(String[] args) {

       // orn :  10/K sinifindaki ogrencilerin isim ve soyisimlerini yazdirin


        Map<Integer ,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        System.out.println(ogrenciMap); // {101=Ali-Can-11-H-MF,
                                        // 102=Veli-Cem-10-K-TM,
                                        // 103=Ali-Cem-11-K-TM,
                                        // 104=Ayse-Can-10-H-MF,
                                        // 105=Sevgi-Cem-11-M-TM,
                                        // 106=Sevgi-Can-10-K-MF,
                                        // 107=Esra-Han-11-M-SOZ}

        Collection<String> ogrenciValueCollection = ogrenciMap.values();

        System.out.println(ogrenciValueCollection); // [Ali-Can-11-H-MF,
                                                // Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF,
                                                // Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]

        for(String eachValue : ogrenciValueCollection) {
            String [] eachValueArr = eachValue.split("-");

            if(eachValueArr[2].equalsIgnoreCase("10") && eachValueArr[3].equalsIgnoreCase("K")) {

               // System.out.println("10. sınıf K subesi ogrencilerinin ismi: " + eachValueArr[0] + " " + " soyismi " + eachValueArr[1] );
                System.out.println( eachValueArr[0] + " "  + eachValueArr[1] );
            }
}
}
}