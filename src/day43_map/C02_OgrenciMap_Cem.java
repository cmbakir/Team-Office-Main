package day43_map;

import java.util.*;

public class C02_OgrenciMap_Cem {

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        System.out.println(ogrenciMap);

        // 103 numarali ogrencinin value'sunu yazdirin
        System.out.println(ogrenciMap.get(103)); // Ali-Cem-11-K-TM

        // olmayan bir key ile value'yu yazdirsak
        System.out.println(ogrenciMap.get(111)); // null

        // aranan key yoksa standart bir cevap yazmasini istersek
        System.out.println(  ogrenciMap. getOrDefault(105,"bu numarada ogrenci yok"));
        // Sevgi-Cem-11-M-TM

        // butun key'leri yazdirin
        System.out.println(ogrenciMap.keySet());

        // butun key'leri kaydedin

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // ogrenci map'inde 107 numarali ogrenci var mi ?

        System.out.println(ogrenciMap.containsKey(107));


        // tum value'leri yazdirin
        System.out.println(ogrenciMap.values());

        // tum value'leri kaydedin

        Collection<String> ogrenciValueCollection = ogrenciMap.values();

        // value'larda Ali var mi ?

        System.out.println(ogrenciMap.containsValue("Ali"));
        System.out.println(ogrenciMap.containsValue("Ali-Can-11-H-MF"));

        // value'larda Ali var mi ?
        // bir loop ile value collection'indaki tum String value'leri kontrol edip
        // Ali var mi bilgisine ulasabiliriz

        boolean AliVarmi = false;

        for( String eachValue : ogrenciValueCollection) {
            if(eachValue.contains("Ali")) {
                AliVarmi=true;
            }
        }
        System.out.println("Ali var mı : " + AliVarmi);

    }
}
