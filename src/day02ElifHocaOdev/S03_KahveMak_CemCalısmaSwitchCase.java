package day02ElifHocaOdev;

import java.util.Scanner;

public class S03_KahveMak_CemCalısmaSwitchCase {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Hangi Kahveyi isterseniz ?"
                        + "\n" + "Turk Kahvesi"
                        + "\n" + "Filtre Kahve"
                        + "\n" + "Espresso"
        );
        System.out.println("Icmek istediginiz kahvenin sadece adını yazınız");
        String hangikahve = scanner.nextLine();

        switch (hangikahve) {
            case "Turk Kahvesi":
                System.out.println(hangikahve + " hazırlanıyor");
                System.out.println("Sut eklemek ister misiniz? (Evet ya da Hayır cevabınız veriniz)");
                String sut = scanner.nextLine();
                        switch(sut) {
                            case "Evet":
                                System.out.println("Sut ekleniyor");
                                    System.out.println("Seker ıster misiniz? (Evet ya da Hayır cevabınız veriniz) ");
                                    String seker = scanner.nextLine();
                                    switch (seker) {
                                        case "Evet":
                                            System.out.println("Kac seker olsun");
                                            int kacseker = scanner.nextInt();
                                            System.out.println(kacseker + " seker ekleniyor");
                                            System.out.println("Hangi boyutta olsun ? ( Buyuk boy - Orta boy - Kucuk boy olarak giriniz...");
                                            String boskod = scanner.nextLine();
                                            String boyut = scanner.nextLine();
                                                switch (boyut) {
                                                    case "Buyuk boy":
                                                        System.out.println("Kahveniz" +  " "+ boyut + " olarak hazırlanıyor");
                                                        System.out.println(hangikahve + " " + boyut + " hazırdır. Afiyet Olsun !!!");
                                                        break;
                                                    case "Orta boy":
                                                        System.out.println("Kahveniz" +  " "+ boyut + " olarak hazırlanıyor");
                                                        System.out.println(hangikahve + " " + boyut + " hazırdır. Afiyet Olsun !!!");
                                                        break;
                                                    case "Kucuk boy":
                                                        System.out.println("Kahveniz" +  " "+ boyut + " olarak hazırlanıyor");
                                                        System.out.println(hangikahve + " " + boyut + " hazırdır. Afiyet Olsun !!!");
                                                        break;
                                                    default:
                                                        System.out.println("Hatalı giris !");
                                                        break;
                                                }
                                           break;
                                        case "Hayır":
                                            System.out.println("Seker eklenmiyor !");
                                            System.out.println("Hangi boyutta olsun ? ( Buyuk boy - Orta boy - Kucuk boy olarak giriniz...");
                                            String boyut2 = scanner.nextLine();
                                            switch (boyut2) {
                                                case "Buyuk boy":
                                                    System.out.println("Kahveniz" + " " + boyut2 + " olarak hazırlanıyor");
                                                    System.out.println(hangikahve + " " + boyut2 + " hazırdır. Afiyet Olsun !!!");
                                                    break;
                                                case "Orta boy":
                                                    System.out.println("Kahveniz" + " " + boyut2 + " olarak hazırlanıyor");
                                                    System.out.println(hangikahve + " " + boyut2 + " hazırdır. Afiyet Olsun !!!");
                                                    break;
                                                case "Kucuk boy":
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
                            case "Hayır":
                                System.out.println("Sut eklenmiyor");
                                System.out.println("Kac seker olsun");
                                int kacseker = scanner.nextInt();
                                String boskod = scanner.nextLine();
                                System.out.println(kacseker + " seker ekleniyor");
                                System.out.println("Hangi boyutta olsun ? ( Buyuk boy - Orta boy - Kucuk boy olarak giriniz...");
                                String boyut = scanner.nextLine();
                                switch (boyut) {
                                    case "Buyuk boy":
                                        System.out.println("Kahveniz" +  " "+ boyut + " olarak hazırlanıyor");
                                        System.out.println(hangikahve + " " + boyut + " hazırdır. Afiyet Olsun !!!");
                                        break;
                                    case "Orta boy":
                                        System.out.println("Kahveniz" +  " "+ boyut + " olarak hazırlanıyor");
                                        System.out.println(hangikahve + " " + boyut + " hazırdır. Afiyet Olsun !!!");
                                        break;
                                    case "Kucuk boy":
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









        }
    }
}