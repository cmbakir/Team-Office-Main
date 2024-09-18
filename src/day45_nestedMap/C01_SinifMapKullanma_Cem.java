package day45_nestedMap;

public class C01_SinifMapKullanma_Cem extends SinifMapDepo{

    public static void main(String[] args) {


        System.out.println(sinifMap);

       // {101={sinif=10, sube=H, soyisim=Can, Isim=Ali, bolum=MF},
        // 102={sinif=11, sube=M, soyisim=Cem, Isim=Veli, bolum=Soz},
        // 103={sinif=11, sube=H, soyisim=Cem, Isim=Ali, bolum=TM},
        // 104={sinif=10, sube=H, soyisim=Can, Isim=Ayse, bolum=MF},
        // 105={sinif=11, sube=M, soyisim=Cem, Isim=Sevgi, bolum=TM},
        // 106={sinif=10, sube=K, soyisim=Can, Isim=Sevgi, bolum=MF},
        // 107={sinif=11, sube=M, soyisim=Han, Isim=Esra, bolum=SOZ}}

        sinifMapeOgrenciEkle(108,"Cemal","Pak","12","F", "Mat");
        System.out.println(sinifMap);

       // {101={sinif=10, sube=H, soyisim=Can, Isim=Ali, bolum=MF},
        // 102={sinif=11, sube=M, soyisim=Cem, Isim=Veli, bolum=Soz},
        // 103={sinif=11, sube=H, soyisim=Cem, Isim=Ali, bolum=TM},
        // 104={sinif=10, sube=H, soyisim=Can, Isim=Ayse, bolum=MF},
        // 105={sinif=11, sube=M, soyisim=Cem, Isim=Sevgi, bolum=TM},
        // 106={sinif=10, sube=K, soyisim=Can, Isim=Sevgi, bolum=MF},
        // 107={sinif=11, sube=M, soyisim=Han, Isim=Esra, bolum=SOZ},
        // 108={sinif=12, sube=F, soyisim=Pak, Isim=Cemal, bolum=Mat}}


        // 103 numarali ogrencinin soyismini yazdirin
        System.out.println(sinifMap.get(103)); // {sinif=11, sube=H, soyisim=Cem, Isim=Ali, bolum=TM}

        System.out.println(sinifMap.get(103).get("sube"));

        // 104 numarali ogrencinin bolumunu yazdirin

        System.out.println(sinifMap.get(104).get("bolum"));

        // 102 numarali ogrencinin subesini K yapin
        System.out.println(sinifMap.get(102).put("sube", "K"));
        System.out.println(sinifMap.get(102));

        // 104 numarali ogrencinin bolumunu TM yapin
        sinifMap.get(104).put("bolum", "TM");
        System.out.println(sinifMap.get(104));
        sinifMap.get(104).replace("bolum", "TK");

        System.out.println(sinifMap.get(104));

        









    }
}
