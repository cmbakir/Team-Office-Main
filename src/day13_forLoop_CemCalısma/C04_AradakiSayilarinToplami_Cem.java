package day13_forLoop_CemCalısma;

public class C04_AradakiSayilarinToplami_Cem {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin



        int baslangic = 2;
        int bitis = 5;
        int toplam=0;

       if (bitis < baslangic || bitis<0 || baslangic<0) {
           System.out.println("Uyarı");
       } else {
           for (int i = baslangic; i <=bitis ; i++) {
               toplam+=i;
                          }

            }
        System.out.print(toplam);
        }





    }

