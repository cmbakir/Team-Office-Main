package day12_stringManipulations;

public class C08_SifreKontroluCemMethod {
    public static void main(String[] args) {

        //System.out.println(sifreKontrol("cem"));
        //System.out.println(sifreKontrol("cembahbahaba1"));
        System.out.println(sifreKontrol("Cememem mm"));
    }

    public static boolean sifreKontrol (String sifre) {

        int hataSayaci=0;

        if (!Character.isLowerCase(sifre.charAt(0))) {
            System.out.println("Lütfen ilk harfi kucuk giriniz !");
            hataSayaci ++;
        }
        if (!Character.isDigit(sifre.charAt(sifre.length()-1))){
            System.out.println("Lutfen son karakteri bir rakam giriniz...");
            hataSayaci ++;
        }
        if (sifre.contains(" ")) {
            System.out.println("Sifre bosluk iceremez !");
            hataSayaci ++;
        }
        if (sifre.length() < 10) {
            System.out.println("Sifre en az 10 karakter uzunlugunda olmalıdır !");
            hataSayaci ++;
        }
        if (hataSayaci == 0) {
            return  true;
        } else {
            return false;
        }

    }

}
