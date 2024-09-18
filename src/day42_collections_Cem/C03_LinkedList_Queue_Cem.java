package day42_collections_Cem;

import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkedList_Queue_Cem {
    public static void main(String[] args) {

        Queue<Integer> sayilar1 = new LinkedList<>();
        Queue<Integer> sayilar2 = new LinkedList<>();

        sayilar2.add(3);
        sayilar2.add(5);
        sayilar2.add(7);
        sayilar2.add(9);

        System.out.println(sayilar2); // [3, 5, 7, 9]

        sayilar2.remove();  // [5, 7, 9]

        System.out.println(sayilar2);

        System.out.println(sayilar2.peek());

        System.out.println(sayilar2.poll());
        System.out.println(sayilar2);





    }
}
