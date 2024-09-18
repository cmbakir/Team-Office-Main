package day44_maps;

import day43_map.MapMethodDepo;

import java.util.Map;
import java.util.Set;

public class C07_EntryIleUpdate_Cem {
    public static void main(String[] args) {

        // Entry kullanarak, 11/M sinifindaki ogrencileri
        // 11/T olarak guncelleyin

        Map<Integer, String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();
        System.out.println(ogrenciMap);

        Set<Map.Entry<Integer, String>> ogrenciEntrySeti = ogrenciMap.entrySet();

        for(Map.Entry<Integer, String> eachEntry : ogrenciEntrySeti) {

            String [] valueArr = eachEntry.getValue().split("-");

            if(valueArr[2].equalsIgnoreCase("11") && valueArr[3].equalsIgnoreCase("M")) {
                valueArr[3] = "T";
                // guncellemeyi array'de yaptik

                String yeniValue = String.join("-", valueArr);

                // yeni value ile Entry'i update edelim

                eachEntry.setValue(yeniValue);




            }
        }

        System.out.println(ogrenciMap);

        


    }
}
