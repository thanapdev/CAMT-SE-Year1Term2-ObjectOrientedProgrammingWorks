//thanapong yamkamol
//642115022

import java.util.ArrayList;
import java.util.Random;

public class lab25_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        Random rnd = new Random();

        list.add(rnd.nextInt(1000));
        list.add(rnd.nextInt(1000));
        list.add(rnd.nextInt(1000));
        list.add(rnd.nextInt(1000));
        list.add(rnd.nextInt(1000));

        for (int i = 0; i < list.size(); i++) {
            System.out.println("random num : " + list.get(i));
        }

        System.out.println("Min num : " + min(list));

    }

    public static <E extends Comparable<E>> E min(ArrayList<E> list){
        int n = list.size();
        E min = list.get(0);

        for (int i = 1; i < n; i++) {
            if (min.compareTo(list.get(i)) > 0) {
                min = list.get(i);
            }
        }

        return min;
    }
}
