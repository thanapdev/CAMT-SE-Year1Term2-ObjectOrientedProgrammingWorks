//642115022
//thanapong yamkamol

package lab8_911;

public class myCircle2D {
    public static void main(String[] args) {
        Circle2D mycircle = new Circle2D(2, 2, 5.5);

        System.out.println("Area : " + mycircle.getArea());
        System.out.println("Perimeter : " + mycircle.getPerimeter());
        System.out.println("Radius : " + mycircle.getradius());
        System.out.println("Center : " + mycircle.getx() + "," + mycircle.gety());
    }
}
