package mon;
// thanapong yamkamol 
//642115022

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] list = new int[10];
        list = readData(list);
        if(list != null){
            printList(list,10);
        }
    }

    private static void printList(int[] array, int x) {
        System.out.print("List: ");
        for (int i = 0; i < x; i++) {
            System.out.print(array[i]+" ");
        }
    }

    private static int[] readData(int[] array) {
        int input;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("["+i+"] ");
            input = scan.nextInt();
            if(input == -999){
                scan.close();
                return null;
            } else {
                array[i] = input;
            }
        }
        scan.close();
        return array;
    }
}