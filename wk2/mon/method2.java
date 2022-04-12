package mon;
// thanapong yamkamol 
//642115022

import java.util.Scanner;

public class method2 {
    public static void main(String[] args) {

        System.out.println(cTof(1));

        System.out.println("|  Celcius  |  Farenheit |");
        System.out.println("==========================");

        System.out.printf("%8d", 40);
        System.out.printf("%13d", cTof(40));
        System.out.println();
        System.out.printf("%8d", 45);
        System.out.printf("%13d", cTof(45));
        System.out.println();
        System.out.printf("%8d", 50);
        System.out.printf("%13d", cTof(50));
        System.out.println();
        System.out.printf("%8d", 55);
        System.out.printf("%13d", cTof(55));
        System.out.println();
        System.out.printf("%8d", 60);
        System.out.printf("%13d", cTof(60));
        System.out.println();
        System.out.printf("%8d", 65);
        System.out.printf("%13d", cTof(65));
        System.out.println();
        System.out.printf("%8d", 70);
        System.out.printf("%13d", cTof(70));
        System.out.println();
        System.out.printf("%8d", 75);
        System.out.printf("%13d", cTof(75));
        System.out.println();
        System.out.printf("%8d", 80);
        System.out.printf("%13d", cTof(80));
        System.out.println();

    }

    public static int cTof(int c) {

        double f = (9.0 / 5.0) * c + 32;

        int answer = (int) Math.round(f);

        return answer;

    }
}
