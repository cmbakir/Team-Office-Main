package day15_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C08_PalindromeMuCem {

    public static void main(String[] args) {

        // kullanicidan bir metin alip
        // palindrome olup olmadigini yazdirin

        System.out.println(tersMetin("arven"));


    }

    public static String tersMetin(String metin){


        String tersMetin ="";

        for (int i = metin.length()-1; i >=0 ; i--) {
            tersMetin +=metin.charAt(i);
        }
        return tersMetin;
    }
}
