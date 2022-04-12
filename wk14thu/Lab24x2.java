//642115022
//Thanapong yamkamol

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lab24x2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        Random rnd = new Random();
        list.add(rnd.nextInt(10));
        list.add(rnd.nextInt(10));
        list.add(rnd.nextInt(10));
        list.add(rnd.nextInt(10));
        list.add(rnd.nextInt(10));

        System.out.println("Not Sort : " + list.toString());

        shuffle(list);

        System.out.println("Sort : " + list.toString());
    }

    public static <E> void shuffle(ArrayList<E> list) {
        Collections.shuffle(list);
    }
}