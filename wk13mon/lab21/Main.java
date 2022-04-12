//thanapong yamkamol
//642115022

package lab21;

import java.util.Scanner;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter three sides: side1, side2, side3: ");
        Scanner input = new Scanner(System.in);
        double side1, side2, side3;
        side1 = input.nextInt();
        side2 = input.nextInt();
        side3 = input.nextInt();

        System.out.print("set the color: ");
        String color;
        color = input.next();

        System.out.println();
        System.out.print("set filled: (True or False)");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3);

        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println("area is " + triangle.getArea());
        System.out.println("Perimeter is " + triangle.getPerimeter());
        System.out.println("toString is " +
                triangle.toString());
        System.out.println("the color is " + triangle.getColor());
        System.out.println("the filled is " + triangle.isFilled());
    }
}