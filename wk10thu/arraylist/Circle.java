//thanapong yamkamol
//642115022

package arraylist;

public class Circle {
    private double radius;
    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14*Math.pow(this.radius,2);
    }

    public double getPerimeter() {
        return 2*3.14*this.radius;
    }

    public String toString() {
        return "The radius of the circle is "+this.radius+"\nArea is "+getArea()+"\nPerimeter is "+getPerimeter();
    }
}
