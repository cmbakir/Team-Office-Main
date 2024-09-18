package day12_stringManipulations;

public class C02_ReplaceAll_CemCalısma {

    public static void main(String[] args) {

        // verilen bir metindeki coklu space'leri tek space haline getirip,
        // sayilari silip, space disindaki ozel karakterleri yok edin

        // J12$%av)(a    C?and&^ir ==> Java Candir


        String str ="J12$%av)(a    C?and&^ir";

        str=str.replaceAll("\\s+", " "); //J12$%av)(a C?and&^ir
        System.out.println(str);
        str=str.replaceAll("\\d",""); // J$%av)(a C?and&^ir
        System.out.println(str);
        str=str.replaceAll("\\s", "5"); // J$%av)(a5C?and&^ir
        System.out.println(str);
        str=str.replaceAll("\\W", ""); // Java5Candir
        System.out.println(str);
        str=str.replaceAll("5", " ");
        System.out.println(str);




    }
}
