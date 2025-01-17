package day40_exceptions_Cem;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C08_ParentChildExceptionsTryCatch_Cem {
    public static void main(String[] args) {

        // Notlar.txt dosyasindaki notlari yazdiralim

        String dosyaYolu = "src/day40_exceptions_Cem/note.txt";

        // Notlar dosyasini yazdirabilmek icin once Javanin o dosyaya ulasmasi lazim


        try {
            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
            // Unhandled exception: java.io.FileNotFoundException

            int k;

            while ((k = fileInputStream.read()) != (-1)) { // dosyayi okuyup, bize getirme
                // Unhandled exception: java.io.IOException
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            System.out.println("Dosya okuma ile ilgili hata olustu");

        }
    }
}
