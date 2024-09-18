package day23_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_Fibonacci {
    public static void main(String[] args) {

        //  Fibonacci serisi ozel bir seri olup
        //            ilk 2 eleman haric, her eleman kendinde onceki 2 elemanin toplamina esittir
        //
        //             0 1 1 2 3 5 8 13 21 34 55 89 ...
        //
        //             Verilen pozitif bir n tamsayisini alarak,
        //             bize ilk n tane tane Fibonacci sayisini
        //             bir list olarak donduren bir method olusturun.

        System.out.println(nFibonacci(12));  // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]

    }

    public static List<Integer> nFibonacci (int istenenNFibonacciAdedi) {

        List<Integer> nTaneFibonnaciListesi = new ArrayList<>();

        if (istenenNFibonacciAdedi <0) {
            System.out.println("İstenen sayı sıfırdan büyük olmalıdır");
        } else if (istenenNFibonacciAdedi == 1) {
            nTaneFibonnaciListesi.add(0);
           } else if (istenenNFibonacciAdedi ==2) {
            nTaneFibonnaciListesi.add(0);
            nTaneFibonnaciListesi.add(1);

        } else {
            nTaneFibonnaciListesi.add(0);
            nTaneFibonnaciListesi.add(1);

            for (int i = 2 ; i <istenenNFibonacciAdedi ; i++) {
                nTaneFibonnaciListesi.add(nTaneFibonnaciListesi.get(i-2)+nTaneFibonnaciListesi.get(i-1));



            }
        }

        return nTaneFibonnaciListesi;
    }

}
