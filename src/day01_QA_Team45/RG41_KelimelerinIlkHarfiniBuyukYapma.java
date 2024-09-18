package day01_QA_Team45;

import java.util.Scanner;

public class RG41_KelimelerinIlkHarfiniBuyukYapma {
    public static void main(String[] args) {

        /*41-----
    Girilen metindeki tüm kelimelerin ilk harflerini büyük yapınız.(diğer harflere dokunmayın, büyükse büyük, küçükse küçük kalsın).

    Örnek
    makeTitle("Bu bir başlıktır")
    Bu Bir Başlıktır

    makeTitle("tüm ilk harfler büyük olacak")
    Tüm İlk Harfler Büyük Olacak
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();
        String [] str = metin.split("-");

        makeCamelCase(str);

    }

    private static void makeCamelCase(String [] str) {
        for (int i = 0; i <str.length ; i++) {
            String m1 = str[i].substring(0,1).toUpperCase() + str[i].substring(1);
            System.out.println(m1 + " ");

            
        }
    }
}
