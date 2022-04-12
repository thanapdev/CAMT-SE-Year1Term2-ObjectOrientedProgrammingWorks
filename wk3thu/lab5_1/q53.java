package lab5_1;

import java.util.Random;

//thanapong yamkamol
//642115022

public class q53 {
    public static void main(String[] args) {
        int min = 20;
        int max = 40;

        int rndint = (int)Math.floor(Math.random()*(max-min+1)+min);

        System.out.println("random number is : " + rndint);

        double a = rndint;

        double b = Math.toRadians(a);

        System.out.println("sin : " + Math.sin(b));

        System.out.println("cosin : " + Math.cos(b));

        System.out.println("tan : " + Math.tan(b));

    }
}
