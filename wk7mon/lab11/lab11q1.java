//thanapong yamkamol
//642115022

package lab11;

import java.util.Random;
import java.util.Scanner;

public class lab11q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your first name : ");
        String fname = input.nextLine();

        System.out.print("Enter Your surname : ");
        String lname = input.nextLine();

        System.out.print(fname.charAt(0));
        for (int i = 0; i < 5; i++)
            System.out.print(lname.charAt(i));

        System.out.println((new Random()).nextInt(89) + 10);
    }
}
