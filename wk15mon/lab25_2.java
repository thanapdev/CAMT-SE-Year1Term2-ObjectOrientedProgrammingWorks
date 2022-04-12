//thanapong yamkamol
//642115022

import java.util.ArrayList;
import java.util.Random;

public class lab25_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        Random rnd = new Random();

        list.add(rnd.nextInt(100));
        list.add(rnd.nextInt(100));
        list.add(rnd.nextInt(100));
        list.add(rnd.nextInt(100));
        list.add(rnd.nextInt(100));
        list.add(rnd.nextInt(100));
        list.add(rnd.nextInt(100));
        list.add(rnd.nextInt(100));

        for (int i = 0; i < list.size(); i++) {
            System.out.println("random num : " + list.get(i));
        }

        System.out.println("Unsort " + list);

        sort(list);

        System.out.print("Sort " + list);
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list){
    E temp;
    boolean sorted = false;

    while (!sorted) {
        sorted = true;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp);
                sorted = false;
            }
        }
    }
    }
}
