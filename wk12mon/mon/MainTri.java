//642115022
//thanapong yamkamol

package mon;

public class MainTri {
    public static void main(String[] args) {
        try {
            Triangle tri1 = new Triangle(3.5, 2.0, 5.0);
            System.out.println("Perimeter Triangle 1 : " + tri1.getPerimeter());
            System.out.println("Area of Triangle 1: " + tri1.getArea());

            System.out.println("======================================");

            Triangle tri2 = new Triangle(3.0 , 2.0, 5.0);
            System.out.println("Perimeter Triangle 2 : " + tri2.getPerimeter());
            System.out.println("Area of Triangle 2 : " + tri2.getArea());
        }catch (IllegalTriangleException ex) {
            System.out.println("Illegal triangle");
            System.out.println("side1: "+ ex.getSide1());
            System.out.println("side2: "+ ex.getSide2());
            System.out.println("side3: "+ ex.getSide3());
        }
    }
} 

