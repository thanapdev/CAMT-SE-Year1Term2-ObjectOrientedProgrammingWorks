//642115022
//thanapong yamkamol

package lab8;

import java.util.Scanner;

public class myPrimeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number : ");
        PrimeNum mypPrime = new PrimeNum(input.nextInt());
        mypPrime.factor();

    }
}
