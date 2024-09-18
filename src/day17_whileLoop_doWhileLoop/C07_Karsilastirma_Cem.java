package day17_whileLoop_doWhileLoop;

public class C07_Karsilastirma_Cem {
    public static void main(String[] args) {


        // sayi 0'dan buyukse , 0 oluncaya kadar birer azaltip yazdirin

        int sayi=25;

        while(sayi > 0) {
            System.out.print(sayi + " ");
            sayi --;


        }
        System.out.println("");
        int sayi2  = 35;

        do {
            System.out.print(sayi2 + " ");
            sayi2--;

        } while (sayi2>0);
    }
}
