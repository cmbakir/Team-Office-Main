package day44_maps;

import day43_map.MapMethodDepo;

import java.util.Map;
import java.util.Set;

public class C02_KeyVeValueyaBirlikteUlasma_Cem {

    public static void main(String[] args) {

        // verilen soyisme sahip ogrencilerin
        // numara, isim, sinif ve subelerini yazdirin



        String arananSoyisim = "Can";

        Map<Integer, String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();
        System.out.println(ogrenciMap);

        Set<Integer> ogrenciKey = ogrenciMap.keySet();

        System.out.println(ogrenciKey);

        for(Integer eachKey : ogrenciKey) {
            String eachValue = ogrenciMap.get(eachKey);

            String [] eachValueArr = eachValue.split("-");

            if(eachValueArr[1].equalsIgnoreCase(arananSoyisim)) {

                System.out.println(eachValueArr[2] + " " +eachValueArr[0] + " " + eachValueArr[3] );
            }
        }


    }
}
