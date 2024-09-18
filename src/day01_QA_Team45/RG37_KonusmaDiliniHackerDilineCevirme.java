package day01_QA_Team45;

public class RG37_KonusmaDiliniHackerDilineCevirme {
    public static void main(String[] args) {

          /*37-----
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.

    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0

    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m

    İpucu harfleri değiştirin ve ekrana yazdırın.
    */


        String metin ="Java en sicak liman";
        hackerDili(metin);
    }

    private static void hackerDili(String metin) {
        System.out.println(metin.replaceAll("s", "5").replaceAll("a", "4").replaceAll("e", "3").replaceAll("i", "1").replaceAll("o", "0"));
    }
}
//J4v4 3n 51c4k l1m4n