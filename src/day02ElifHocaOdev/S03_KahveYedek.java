package day02ElifHocaOdev;

import java.util.Scanner;

public class S03_KahveYedek {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Hangi Kahveyi isterseniz ?"
                        + "\n" + "Turk Kahvesi"
                        + "\n" + "Filtre Kahve"
                        + "\n" + "Espresso"
        );
        System.out.println("Icmek istediginiz kahvenin sadece adını yazınız");
        String hangikahve = scanner.nextLine().toLowerCase();

        switch (hangikahve) {
            case "turk kahvesi":
                System.out.println(hangikahve + " hazırlanıyor");
                System.out.println("Sut eklemek ister misiniz? (Evet ya da Hayır cevabınız veriniz)");
                String sut = scanner.nextLine().toLowerCase();
                switch(sut) {
                    case "evet":
                        System.out.println("Sut ekleniyor");
                        System.out.println("Seker ıster misiniz? (Evet ya da Hayır cevabınız veriniz) ");
                        String seker = scanner.nextLine().toLowerCase();
                        switch (seker) {
                            case "evet":
                                System.out.println("Kac seker olsun");
                                int kacseker = scanner.nextInt();
                                System.out.println(kacseker + " seker ekleniyor");
                                System.out.println("Hangi boyutta olsun ? ( Buyuk boy - Orta boy - Kucuk boy olarak giriniz...");
                                String boskod = scanner.nextLine();
                                String boyut = scanner.nextLine().toLowerCase();
                                switch (boyut) {
                                    case "buyuk boy":
                                        System.out.println("Kahveniz" +  " "+ boyut + " olarak hazırlanıyor");
                                        System.out.println(hangikahve + " " + boyut + " hazırdır. Afiyet Olsun !!!");
                                        break;
                                    case "orta boy":
                                        System.out.println("Kahveniz" +  " "+ boyut + " olarak hazırlanıyor");
                                        System.out.println(hangikahve + " " + boyut + " hazırdır. Afiyet Olsun !!!");
                                        break;
                                    case "kucuk boy":
                                        System.out.println("Kahveniz" +  " "+ boyut + " olarak hazırlanıyor");
                                        System.out.println(hangikahve + " " + boyut + " hazırdır. Afiyet Olsun !!!");
                                        break;
                                    default:
                                        System.out.println("Hatalı giris !");
                                        break;
                                }
                                break;
                            case "hayır":
                                System.out.println("Seker eklenmiyor !");
                                System.out.println("Hangi boyutta olsun ? ( Buyuk boy - Orta boy - Kucuk boy olarak giriniz...");
                                String boyut2 = scanner.nextLine().toLowerCase();
                                switch (boyut2) {
                                    case "buyuk boy":
                                        System.out.println("Kahveniz" + " " + boyut2 + " olarak hazırlanıyor");
                                        System.out.println(hangikahve + " " + boyut2 + " hazırdır. Afiyet Olsun !!!");
                                        break;
                                    case "orta boy":
                                        System.out.println("Kahveniz" + " " + boyut2 + " olarak hazırlanıyor");
                                        System.out.println(hangikahve + " " + boyut2 + " hazırdır. Afiyet Olsun !!!");
                                        break;
                                    case "kucuk boy":
                                        System.out.println("Kahveniz" + " " + boyut2 + " olarak hazırlanıyor");
                                        System.out.println(hangikahve + " " + boyut2 + " hazırdır. Afiyet Olsun !!!");
                                        break;
                                    default:
                                        System.out.println("Hatalı giris !");
                                }
                                break;
                            default:
                                System.out.println("Gecerli bir karakter giriniz");
                        }
                        break;
                    case "hayır":
                        System.out.println("Sut eklenmiyor");
                        System.out.println("Kac seker olsun");
                        int kacseker = scanner.nextInt();
                        String boskod = scanner.nextLine();
                        System.out.println(kacseker + " seker ekleniyor");
                        System.out.println("Hangi boyutta olsun ? ( Buyuk boy - Orta boy - Kucuk boy olarak giriniz...");
                        String boyut = scanner.nextLine().toLowerCase();
                        switch (boyut) {
                            case "buyuk boy":
                                System.out.println("Kahveniz" +  " "+ boyut + " olarak hazırlanıyor");
                                System.out.println(hangikahve + " " + boyut + " hazırdır. Afiyet Olsun !!!");
                                break;
                            case "orta boy":
                                System.out.println("Kahveniz" +  " "+ boyut + " olarak hazırlanıyor");
                                System.out.println(hangikahve + " " + boyut + " hazırdır. Afiyet Olsun !!!");
                                break;
                            case "kucuk boy":
                                System.out.println("Kahveniz" +  " "+ boyut + " olarak hazırlanıyor");
                                System.out.println(hangikahve + " " + boyut + " hazırdır. Afiyet Olsun !!!");
                                break;
                            default:
                                System.out.println("Hatalı giris !");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Gecerli bir karakter giriniz");
                }
                break;

            case "filtre kahve":
                System.out.println(hangikahve + " hazırlanıyor");
                System.out.println("Sut eklemek ister misiniz? (Evet ya da Hayır cevabınız veriniz)");
                String sut3 = scanner.nextLine().toLowerCase();
                switch(sut3) {
                    case "evet":
                        System.out.println("Sut ekleniyor");
                        System.out.println("Seker ıster misiniz? (Evet ya da Hayır cevabınız veriniz) ");
                        String seker = scanner.nextLine();
                        switch (seker) {
                            case "evet":
                                System.out.println("Kac seker olsun");
                                int kacseker = scanner.nextInt();
                                System.out.println(kacseker + " seker ekleniyor");
                                System.out.println("Hangi boyutta olsun ? ( Buyuk boy - Orta boy - Kucuk boy olarak giriniz...");
                                String boskod = scanner.nextLine();
                                String boyut = scanner.nextLine().toLowerCase();
                                switch (boyut) {
                                    case "buyuk boy":
                                        System.out.println("Kahveniz" +  " "+ boyut + " olarak hazırlanıyor");
                                        System.out.println(hangikahve + " " + boyut + " hazırdır. Afiyet Olsun !!!");
                                        break;
                                    case "orta boy":
                                        System.out.println("Kahveniz" +  " "+ boyut + " olarak hazırlanıyor");
                                        System.out.println(hangikahve + " " + boyut + " hazırdır. Afiyet Olsun !!!");
                                        break;
                                    case "kucuk boy":
                                        System.out.println("Kahveniz" +  " "+ boyut + " olarak hazırlanıyor");
                                        System.out.println(hangikahve + " " + boyut + " hazırdır. Afiyet Olsun !!!");
                                        break;
                                    default:
                                        System.out.println("Hatalı giris !");
                                        break;
                                }
                                break;
                            case "hayır":
                                System.out.println("Seker eklenmiyor !");
                                System.out.println("Hangi boyutta olsun ? ( Buyuk boy - Orta boy - Kucuk boy olarak giriniz...");
                                String boyut2 = scanner.nextLine().toLowerCase();
                                switch (boyut2) {
                                    case "buyuk boy":
                                        System.out.println("Kahveniz" + " " + boyut2 + " olarak hazırlanıyor");
                                        System.out.println(hangikahve + " " + boyut2 + " hazırdır. Afiyet Olsun !!!");
                                        break;
                                    case "orta boy":
                                        System.out.println("Kahveniz" + " " + boyut2 + " olarak hazırlanıyor");
                                        System.out.println(hangikahve + " " + boyut2 + " hazırdır. Afiyet Olsun !!!");
                                        break;
                                    case "kucuk boy":
                                        System.out.println("Kahveniz" + " " + boyut2 + " olarak hazırlanıyor");
                                        System.out.println(hangikahve + " " + boyut2 + " hazırdır. Afiyet Olsun !!!");
                                        break;
                                    default:
                                        System.out.println("Hatalı giris !");
                                }
                                break;
                            default:
                                System.out.println("Gecerli bir karakter giriniz");
                        }
                        break;
                    case "hayır":
                        System.out.println("Sut eklenmiyor");
                        System.out.println("Kac seker olsun");
                        int kacseker = scanner.nextInt();
                        String boskod = scanner.nextLine();
                        System.out.println(kacseker + " seker ekleniyor");
                        System.out.println("Hangi boyutta olsun ? ( Buyuk boy - Orta boy - Kucuk boy olarak giriniz...");
                        String boyut = scanner.nextLine().toLowerCase();
                        switch (boyut) {
                            case "buyuk boy":
                                System.out.println("Kahveniz" +  " "+ boyut + " olarak hazırlanıyor");
                                System.out.println(hangikahve + " " + boyut + " hazırdır. Afiyet Olsun !!!");
                                break;
                            case "orta boy":
                                System.out.println("Kahveniz" +  " "+ boyut + " olarak hazırlanıyor");
                                System.out.println(hangikahve + " " + boyut + " hazırdır. Afiyet Olsun !!!");
                                break;
                            case "kucuk boy":
                                System.out.println("Kahveniz" +  " "+ boyut + " olarak hazırlanıyor");
                                System.out.println(hangikahve + " " + boyut + " hazırdır. Afiyet Olsun !!!");
                                break;
                            default:
                                System.out.println("Hatalı giris !");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Gecerli bir karakter giriniz");
                }
                break;

            case "espresso":
                System.out.println(hangikahve + " hazırlanıyor");
                System.out.println("Sut eklemek ister misiniz? (Evet ya da Hayır cevabınız veriniz)");
                String sut4 = scanner.nextLine().toLowerCase();
                switch(sut4) {
                    case "evet":
                        System.out.println("Sut ekleniyor");
                        System.out.println("Seker ıster misiniz? (Evet ya da Hayır cevabınız veriniz) ");
                        String seker = scanner.nextLine().toLowerCase();
                        switch (seker) {
                            case "evet":
                                System.out.println("Kac seker olsun");
                                int kacseker = scanner.nextInt();
                                System.out.println(kacseker + " seker ekleniyor");
                                System.out.println("Hangi boyutta olsun ? ( Buyuk boy - Orta boy - Kucuk boy olarak giriniz...");
                                String boskod = scanner.nextLine();
                                String boyut = scanner.nextLine().toLowerCase();
                                switch (boyut) {
                                    case "buyuk boy":
                                        System.out.println("Kahveniz" +  " "+ boyut + " olarak hazırlanıyor");
                                        System.out.println(hangikahve + " " + boyut + " hazırdır. Afiyet Olsun !!!");
                                        break;
                                    case "orta boy":
                                        System.out.println("Kahveniz" +  " "+ boyut + " olarak hazırlanıyor");
                                        System.out.println(hangikahve + " " + boyut + " hazırdır. Afiyet Olsun !!!");
                                        break;
                                    case "kucuk boy":
                                        System.out.println("Kahveniz" +  " "+ boyut + " olarak hazırlanıyor");
                                        System.out.println(hangikahve + " " + boyut + " hazırdır. Afiyet Olsun !!!");
                                        break;
                                    default:
                                        System.out.println("Hatalı giris !");
                                        break;
                                }
                                break;
                            case "hayır":
                                System.out.println("Seker eklenmiyor !");
                                System.out.println("Hangi boyutta olsun ? ( Buyuk boy - Orta boy - Kucuk boy olarak giriniz...");
                                String boyut2 = scanner.nextLine().toLowerCase();
                                switch (boyut2) {
                                    case "buyuk boy":
                                        System.out.println("Kahveniz" + " " + boyut2 + " olarak hazırlanıyor");
                                        System.out.println(hangikahve + " " + boyut2 + " hazırdır. Afiyet Olsun !!!");
                                        break;
                                    case "orta boy":
                                        System.out.println("Kahveniz" + " " + boyut2 + " olarak hazırlanıyor");
                                        System.out.println(hangikahve + " " + boyut2 + " hazırdır. Afiyet Olsun !!!");
                                        break;
                                    case "kucuk boy":
                                        System.out.println("Kahveniz" + " " + boyut2 + " olarak hazırlanıyor");
                                        System.out.println(hangikahve + " " + boyut2 + " hazırdır. Afiyet Olsun !!!");
                                        break;
                                    default:
                                        System.out.println("Hatalı giris !");
                                }
                                break;
                            default:
                                System.out.println("Gecerli bir karakter giriniz");
                        }
                        break;
                    case "hayır":
                        System.out.println("Sut eklenmiyor");
                        System.out.println("Kac seker olsun");
                        int kacseker = scanner.nextInt();
                        String boskod = scanner.nextLine();
                        System.out.println(kacseker + " seker ekleniyor");
                        System.out.println("Hangi boyutta olsun ? ( Buyuk boy - Orta boy - Kucuk boy olarak giriniz...");
                        String boyut = scanner.nextLine().toLowerCase();
                        switch (boyut) {
                            case "buyuk boy":
                                System.out.println("Kahveniz" +  " "+ boyut + " olarak hazırlanıyor");
                                System.out.println(hangikahve + " " + boyut + " hazırdır. Afiyet Olsun !!!");
                                break;
                            case "orta boy":
                                System.out.println("Kahveniz" +  " "+ boyut + " olarak hazırlanıyor");
                                System.out.println(hangikahve + " " + boyut + " hazırdır. Afiyet Olsun !!!");
                                break;
                            case "kucuk boy":
                                System.out.println("Kahveniz" +  " "+ boyut + " olarak hazırlanıyor");
                                System.out.println(hangikahve + " " + boyut + " hazırdır. Afiyet Olsun !!!");
                                break;
                            default:
                                System.out.println("Hatalı giris !");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Gecerli bir karakter giriniz");
                }

            default:
                System.out.println("Gecerli bir karakter giriniz");



        }
    }
}