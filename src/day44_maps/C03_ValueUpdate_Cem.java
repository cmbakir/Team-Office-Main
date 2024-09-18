package day44_maps;

import day43_map.MapMethodDepo;

import java.util.Arrays;
import java.util.Map;

public class C03_ValueUpdate_Cem {
    public static void main(String[] args) {

        // 102 numarali ogrencinin adini Kemal olarak degistirin

        Map<Integer, String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();
        System.out.println(ogrenciMap); //{101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM,
                                    // 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM,
                                    // 106=Sevgi-Can-10-K-MF, 107=Esra-Han-11-M-SOZ}

        ogrenciMap.replace(102, "Kemal-Cem-10-K-TM");
        System.out.println(ogrenciMap);

        // kod ile 104 numarali ogrencinin soyismini Yilmaz yapin

        String value104 = ogrenciMap.get(104);
        System.out.println(value104);

        String [] value104Arr = value104.split("-");

        System.out.println(Arrays.toString(value104Arr));

        value104Arr[1] = "Yilmaz";
        System.out.println(Arrays.toString(value104Arr));

        String yeniValue104 = String.join("-", value104Arr); // burada value104Arr yi aralarında tire (-) olan String e donuşturduk

        System.out.println(yeniValue104);

        ogrenciMap.put(104, yeniValue104);
        System.out.println(ogrenciMap);


    }
}
