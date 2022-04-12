//thanapong yamkamol 
//642115022

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to OOP Lab");
        System.out.println("1. menu 1");
        System.out.println("2. menu 2");
        System.out.println("3. menu 3");
        System.out.println("4. menu 4");
        System.out.println("5. menu 5");

        System.out.print("input your number : ");
        int num = input.nextInt();

        if (num == 1) {
            System.out.println("Welcome to menu 1");
        }else if (num == 2) {
            System.out.println("Welcome to menu 2");
        }else if(num == 3){
            System.out.println("Welcome to menu 3");
        }else if (num == 4) {
            System.out.println("Welcome to menu 4");
        }else if(num == 5){
            System.out.println("Bye bye, see you tomorrow");
        }
    }
    
}
