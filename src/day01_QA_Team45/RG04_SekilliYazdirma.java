package day01_QA_Team45;

public class RG04_SekilliYazdirma {
    public static void main(String[] args) {


     /*4----
    1 den 10 a kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.

     Beklenen çıltı:

    1
    12
    123
    1234
    12345
    123456
    1234567
    12345678
    123456789
    12345678910
    */
            // versiyon 1 (anti prof cözümü)
        /*
        for (int i = 1; i <=10 ; i++) {
            System.out.println(" "+ i);
            System.out.println(" " + i + (i+1));
            System.out.println(" " + i + (i+1) +(i+2));
            System.out.println(" " + i + (i+1) +(i+2) + (i+3));
            System.out.println(" " + i + (i+1) +(i+2) + (i+3) + (i+4));
            System.out.println(" " + i + (i+1) +(i+2) + (i+3) + (i+4) + (i+5));
            System.out.println(" " + i + (i+1) +(i+2) + (i+3) + (i+4) + (i+5) + (i+6));
            System.out.println(" " + i + (i+1) +(i+2) + (i+3) + (i+4) + (i+5) + (i+6)+ (i+7));
            System.out.println(" " + i + (i+1) +(i+2) + (i+3) + (i+4) + (i+5) + (i+6)+ (i+7) +(i+8));
            System.out.println(" " + i + (i+1) +(i+2) + (i+3) + (i+4) + (i+5) + (i+6)+ (i+7) +(i+8)+(i+9));
            System.out.println(" " + i + (i+1) +(i+2) + (i+3) + (i+4) + (i+5) + (i+6)+ (i+7) +(i+8)+(i+9)+(i+10));
        }
*/
            // versiyon 2 (daha pro)
        int satir =10;

        for (int i = 1 ; i <=satir ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }




    }
}
