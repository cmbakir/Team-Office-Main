package day45_nestedMap;

import java.util.Set;

public class C03_TopluUpdate_Cem extends SinifMapDepo{

    public static void main(String[] args) {


        // yil sonu otomatik sinif artirma yapilacak
        // 9,10,11. siniftakilerin siniflarini 1 artirin
        // 12.siniftakilerin sinif bilgisine  mezun yazin
        // mezun olanlara islem yapilmasin

        sinifMapeOgrenciEkle(108,"Pinar","Can","12","M","MF");
        sinifMapeOgrenciEkle(109,"Sabri","Cem","mezun","K","MF");
        sinifMapeOgrenciEkle(110,"Ali","Bakir","9","H","TM");


        System.out.println(sinifMap);
        //{101={sinif=10, sube=H, soyisim=Can, Isim=Ali, bolum=MF},
        // 102={sinif=11, sube=M, soyisim=Cem, Isim=Veli, bolum=Soz},
        // 103={sinif=11, sube=H, soyisim=Cem, Isim=Ali, bolum=TM},
        // 104={sinif=10, sube=H, soyisim=Can, Isim=Ayse, bolum=MF},
        // 105={sinif=11, sube=M, soyisim=Cem, Isim=Sevgi, bolum=TM},
        // 106={sinif=10, sube=K, soyisim=Can, Isim=Sevgi, bolum=MF},
        // 107={sinif=11, sube=M, soyisim=Han, Isim=Esra, bolum=SOZ},
        // 108={sinif=12, sube=M, soyisim=Can, Isim=Pinar, bolum=MF},
        // 109={sinif=mezun, sube=K, soyisim=Cem, Isim=Sabri, bolum=MF},
        // 110={sinif=9, sube=H, soyisim=Bakir, Isim=Ali, bolum=TM}}

        Set<Integer> sinifKeySeti = sinifMap.keySet();
        for(Integer eachKey:sinifKeySeti) {

        if(sinifMap.get(eachKey).get("sinif").equalsIgnoreCase("9")) {

            sinifMap.get(eachKey).put("sinif","10");
                    System.out.println(sinifMap);
        }
        // sadece 9.Sınıf yaptım
    }
}
}
