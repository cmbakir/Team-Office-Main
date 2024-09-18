package day02ElifHocaOdev;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class S03_KahveMak_CemCalısma {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Hangi Kahveyi isterseniz ?"
                + "\n" + "Turk Kahvesi"
                + "\n" +  "Filtre Kahve"
                + "\n" + "Espresso"
                );
        System.out.println("Icmek istediginiz kahvenin sadece adını yazınız");
        String hangikahve = scanner.nextLine();

        if (hangikahve.equalsIgnoreCase("Turk Kahvesi")) {
            System.out.println(hangikahve + " hazırlanıyor");
        } else if
        (hangikahve.equalsIgnoreCase("Filtre Kahve")) {
            System.out.println(hangikahve + " hazırlanıyor");
        } else if (hangikahve.equalsIgnoreCase("Espresso")) {
            System.out.println(hangikahve + " hazırlanıyor");
        }     else {
            System.out.println("Hatalı giriş yaptınız.. !");
        }
        System.out.println("Sut eklemek ister misiniz? (Evet ya da Hayır cevabınız veriniz)");
        String sut = scanner.nextLine();

            if (sut.equalsIgnoreCase("Evet")) {
                System.out.println("Sut ekleniyor");
            } else {
                System.out.println("Sut eklenmiyor");
            }
        System.out.println("Seker ıster misiniz? (Evet ya da Hayır cevabınız veriniz) ");
            String seker = scanner.nextLine();
            if (seker.equalsIgnoreCase("Evet")) {
                System.out.println("Kac seker olsun");
                int kacseker = scanner.nextInt();
                System.out.println(kacseker + " seker ekleniyor");
            } else {
                System.out.println("Seker eklenmiyor !");
            }
            String boskod = scanner.nextLine();

        System.out.println("Hangi boyutta olsun ? ( Buyuk boy - Orta boy - Kucuk boy olarak giriniz...");
            String boyut = scanner.nextLine();

            if (boyut.equalsIgnoreCase("Buyuk boy")) {
                System.out.println("Kahveniz" +  " "+ boyut + " olarak hazırlanıyor");
            } else if (boyut.equalsIgnoreCase("Kucuk boy")) {
                System.out.println("Kahveniz" + " "+ boyut + " olarak hazırlanıyor");
            } else if (boyut.equalsIgnoreCase("Orta boy")) {
                System.out.println("Kahveniz" + " "+ boyut + " olarak hazırlanıyor");
            } else {
                System.out.println("Hatalı giris !");
            }

        System.out.println(hangikahve + " " + boyut + " hazırdır. Afiyet Olsun !!!");
    }
        }







