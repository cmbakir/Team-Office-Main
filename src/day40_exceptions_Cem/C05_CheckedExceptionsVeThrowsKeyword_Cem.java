package day40_exceptions_Cem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C05_CheckedExceptionsVeThrowsKeyword_Cem {
    public static void main(String[] args) throws FileNotFoundException {

        // Java'da bilgisayarimizdaki
        // varolan dosyalara ulasmak icin FileInputStream class'i kullanilir
        // FileInputStream'in dosyaya ulasabilmesi icin dosya yolunu soylememiz gerekir

        String dosyaYolu = "src/day40_exceptions_Cem/note.txt";
        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

        // Unhandled exception: java.io.FileNotFoundException

              /*
            Method signature'ina throws keyword eklemek
            try-catch'den farklidir,

           üzerine gelip çözüme tıklarız

            throws keyword'u exception'i kontrol altina almaz (handle etmez),
            SADECE bu kod'da riskin farkinda oldugumuzu deklare etmis oluruz

            EGER exception olusursa KOD calismaya devam etmez
            exception firlatir ve durur
         */
    }
}
