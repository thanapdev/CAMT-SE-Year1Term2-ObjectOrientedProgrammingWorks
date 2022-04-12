//thanapong yamkamol
//642115022

package lab21;

import java.util.ArrayList;
import java.util.Random;

public class SortArray {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<Number>();
        Random rnd = new Random();
        list.add(rnd.nextInt(999));
        list.add(rnd.nextInt(999));
        list.add(rnd.nextInt(999));
        list.add(rnd.nextInt(999));
    
        System.out.println("Unsorted: " + list.toString());
        sort(list);
        System.out.println("Sorted: " + list.toString());
    }

    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) { 
            Number currentMin = list.get(i); 
            int currentMinIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (currentMin.doubleValue() > list.get(j).doubleValue()) {
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }   

            if (currentMinIndex != i) {
                list.set(currentMinIndex, list.get(i));
                list.set(i, currentMin);
            }
        }
        
    }
    
}
