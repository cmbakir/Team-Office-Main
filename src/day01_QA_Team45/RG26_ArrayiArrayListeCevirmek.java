package day01_QA_Team45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RG26_ArrayiArrayListeCevirmek {
    public static void main(String[] args) {

             /*26-----
            Array i ARRAYLIST e çeviren Java Kodunu yazınız.
            Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]
        
            Beklenen Çıktı:
            [Python, JAVA, PHP, Perl, C#, C++]
            */

        String [] arr = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        List<String> isimler = new ArrayList<>(arr.length);

        for (int i = 0; i <arr.length ; i++) {
            isimler.add(arr[i]);

        }
        System.out.println(isimler);



            
        }



    }
    
    
    
    
    

