package day01_QA_Team45;

import java.time.LocalDate;
import java.util.Scanner;

public class RG19_ArtikYil {
    public static void main(String[] args) {

            /*19----
            Kullanıcı tarafından girilen bir yılın  artık yıl olup
            olmadığını kontrol etmek için bir Java Methodu yazınız.

            Test Data:
            2017

            Beklenen Çıktı:
            false
            */


        		/*
        		//1. yol
				if (yil%4==0) {
					if (yil%100==0 && yil%400!=0) {
						System.out.println(yil + " artik yil degildir");
					}
					else System.out.println(yil + " artik yildir");
				} else {
					System.out.println(yil + " artik yil degildir");
				}
				*/

        	/*//2.yol
				if (yil%400==0 || (yil%100!=0 && yil%4==0)) {

					System.out.println(yil + " artik yildir");

				} else {
					System.out.println(yil + " artik yil degildir");
			*/

        /*//3.yol

				System.out.print(yil%400==0 || (yil%100!=0 && yil%4==0 ) ? yil + " artik yildir" : yil + " artik yil degildir");

			*/

        /*
				 new keyword u kullanilmaz..
				 4. yol
				 */

        Scanner sc = new Scanner(System.in);
        System.out.print("Tarih giriniz : ");
        int a = sc.nextInt();
        LocalDate date = LocalDate.of(a, 11, 15);
        System.out.println(date.isLeapYear());

        sc.close();


    }

    @SuppressWarnings("unused")
    private static boolean artikYilMi2(int yil) {


        return (yil % 400 == 0 || (yil % 100 != 0 && yil % 4 == 0));
    }
}