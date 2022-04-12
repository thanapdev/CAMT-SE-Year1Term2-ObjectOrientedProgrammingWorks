//thanapong yamkamol 
//642115022

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("input number : ");
        int num = input.nextInt();

        if (num < 500) {
            System.out.println("Your value is too low");
        }else{
            System.out.println("Your value is high enough");
        }
    }
}