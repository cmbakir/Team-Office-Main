package day44_maps;

import day43_map.MapMethodDepo;

import java.util.Map;

public class C05_SoyisimUpdate_Cem {
    public static void main(String[] args) {

        // verilen ogrenci numarasinin bilgilerine ulasip
        // soyismini istenen yeni deger olarak update edin

        Map<Integer, String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();
        System.out.println(ogrenciMap);

       ogrenciMap= MapMethodDepo.soyisimGuncelle2(ogrenciMap,102, "Babacan");
        System.out.println(ogrenciMap);

    }
}
