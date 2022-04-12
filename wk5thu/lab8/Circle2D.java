//642115022
//thanapong yamkamol

package lab8_911;

public class Circle2D {

    public double x, y, radius;

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getPerimeter() {
        return 3.14 * 2 * radius;
    }

    public double getArea() {
        return 3.14 * (radius * radius);
    }

    public double getradius() {
        return radius;
    }

    public double getx() {
        return x;
    }

    public double gety() {
        return y;
    }
}
