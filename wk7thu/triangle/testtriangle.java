package triangle;

import java.util.Scanner;

public class testtriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three sides of the Triangle");
        triangle myTri = new triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());

        System.out.println("Triangle :::: ");
        System.out.println("Side1 : " + myTri.getSide1());
        System.out.println("Side2 : " + myTri.getSide2());
        System.out.println("Side3 : " + myTri.getSide3());

        System.out.println("Area : " + myTri.getArea());
        System.out.println("Perimeter : " + myTri.getPerimeter());
        System.out.println("Color : " + myTri.getColor());
        System.out.println("Is filled? : " + myTri.isFilled());

    }
}