package day40_exceptions_Cem;

import java.util.Scanner;

public class C02_MultipleExceptions2_Cem {
    public static void main(String[] args) {

        // Kullanicidan bir tam sayi isteyin
        // verilen tamsayiyi index olarak kabul edip
        // Asagida verilen String ve array'de o index'de olan elementleri yazdirin

        String str = "Java candır";
        int[] arr = {2, 3, 5, 6, 8, 7, 9, 11, 15, 74};

        /*
            Bu soruda 3 adet exception olusma riski var

            InputMissmatchException
            StringIndexOutOfBoundsException
            ArrayIndexOutOfBoundsException

            Bu soruda InputMissmatchException'i dikkate almayip
            kalan 2 exception'i nasil kontrol altina alabilecegimizi inceleyelim
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen index olarak kabul edilecek tam sayıyı giriniz");
        int girilenSayi = scanner.nextInt();


        try {
            System.out.println(str.charAt(girilenSayi));
            System.out.println(arr[girilenSayi]);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Index out of bound yakalandı");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound yakalandı");


}
}
}



