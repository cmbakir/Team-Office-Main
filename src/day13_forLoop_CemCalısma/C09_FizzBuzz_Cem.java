package day13_forLoop_CemCalısma;

import java.util.Scanner;

public class C09_FizzBuzz_Cem {
    public static void main(String[] args) {


        // Kullanicidan pozitif bir sayi alin,
        // 1’den baslayarak o sayiya kadar tum tamsayilari yazdirin, sira
        //	- 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        //	- 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        //	- hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();


        for (int i = 1; i < girilenSayi; i++) {

            if (i % 3 == 0 && i % 5 ==0) {
                System.out.print( " fizbuzz");
                 } else if (i % 5 ==0) {
                System.out.print(" buzz");
            } else if (i % 3 == 0) {
                System.out.print(" fizz");
            } else { System.out.print(" " + i );
            }
        }







    }


}
