package day12_stringManipulations;

public class C03_ReplaceAll_CemCalısma {
    public static void main(String[] args) {

        //Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //		   input1 : “15.30 €” , input2 : “11.45 €”
        //		   output : 26.75 €


        String str1="15.30 €";
        String str2="11.45 €";

        str1= str1.replaceAll("\\D", "");
        System.out.println(str1);
        str2=str2.replaceAll("\\D", "");
        System.out.println(str2);

        double fiyat1=Double.parseDouble(str1);
        double fiyat2=Double.parseDouble(str2);

        System.out.println(fiyat1/100 + fiyat2/100 + " €");







    }
}
