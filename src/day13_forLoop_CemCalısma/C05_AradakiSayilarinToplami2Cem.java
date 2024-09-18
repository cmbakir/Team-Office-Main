package day13_forLoop_CemCalısma;

public class C05_AradakiSayilarinToplami2Cem {

    public static void main(String[] args) {

        //  Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //  sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //  Bitis degeri baslangic degerinden kucuk olsa da program calissin


        int baslangic = 12;
        int bitis = 15;
        int toplam = 0;

       if (baslangic>bitis) {

           for (int i = baslangic; i >=bitis ; i--) {
               toplam+=i;
               
           }
        } else {
           for (int i = baslangic; i <=bitis ; i++) {
               toplam+=i;
           }
       }

        System.out.println(toplam);
    }
}