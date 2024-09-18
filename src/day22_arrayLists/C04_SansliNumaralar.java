package day22_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class C04_SansliNumaralar {
    public static void main(String[] args) {

        // calistirdigimizda 1milyondan kucuk sayilardan sansli 5 sayi secip
        // bir liste olarak bize donduren bir method olusturun
        System.out.println(istenenAraliktaSayilarUret(200, 300));


        // verilen baslangic ve bitis derleri arasinda
        // 5 tane sansli sayi secip
        // bir liste olarak donduren bir method olusturun
        // sayilar birbirinden farkli olmalidir

        System.out.println(getSansliSayilar());


    }
    public static List<Integer> istenenAraliktaSayilarUret (int baslangic, int bitis) {

        // ornek olarak 2200 ile 3000 arasinda 5 sayi uretsin

        List<Integer> sansliSayilarList = new ArrayList<>();



        Random random = new Random();

        while(sansliSayilarList.size() <5) {

            int sayi= random.nextInt(bitis-baslangic);

            if(!sansliSayilarList.contains(sayi+baslangic)) {
                sansliSayilarList.add(sayi+baslangic);
            }
        }
        return sansliSayilarList;
    }


    public static List<Integer> getSansliSayilar() {

        List<Integer> sansliSayilarList = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i <5 ; i++) {
            int sayi = random.nextInt(500);

            sansliSayilarList.add(sayi);


        }
        return sansliSayilarList;
    }
}
