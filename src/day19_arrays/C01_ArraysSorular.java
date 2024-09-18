package day19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C01_ArraysSorular {

    public static void main(String[] args) {


        //Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        //donduren bir method olusturun.

        String [] isimler = BoyutAlElementAlArrayOlustur();
        System.out.println(Arrays.toString(isimler));


    }

    public static String [] BoyutAlElementAlArrayOlustur () {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen arrayin boyutunu giriniz...");
        int arrayBoyutu = scanner.nextInt();
        scanner.nextLine();

        String [] isimler = new String [arrayBoyutu];
        System.out.println("Lutfen array isimlerini giriniz");

        for (int i = 0; i <arrayBoyutu ; i++) {

            isimler[i]= scanner.nextLine();

        }

    return isimler;



    }
}
