package mon;
// thanapong yamkamol 
//642115022

import java.util.Scanner;

public class method1 {
    public static void main(String[] args) {

        int answermax;
        int answermin;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 2 Number : ");

        int x = scan.nextInt();
        int y = scan.nextInt();

        answermax = myMax(x, y);
        answermin = myMin(x, y);

        System.out.println("your max is "+answermax);
        System.out.println("your min is "+answermin);
        
    }

    public static int myMax(int x, int y) {
        if (x > y) {
            return x;
        }else {
            return y;
        }
    }

    public static int myMin(int x, int y) {
        if (x > y) {
            return y;
        }else {
            return x;
        }
    }
    
}
