package day01_QA_Team45;

public class RG05_ElmasDesenliYazdirma {

    public static void main(String[] args) {

    /*5-----
    Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
    */
        int satir=7;
        int sutun=7;
        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i+3 && j>=i-3 ; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }


    }
}
