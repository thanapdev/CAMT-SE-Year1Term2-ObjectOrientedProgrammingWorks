//642115022
//thanapong yamkamol

package mon;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        Exception();
    }

    public void Exception() throws IllegalTriangleException{
        if (this.side1 + this.side2 <= this.side3)
            throw new IllegalTriangleException(this.side1, this.side2, this.side3);
        else if (this.side1 + this.side3 <= this.side2)
            throw new IllegalTriangleException(this.side1, this.side2, this.side3);
        else if (this.side2 + this.side3 <= this.side1)
            throw new IllegalTriangleException(this.side1, this.side2, this.side3);
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public double getArea() {
        double s = getPerimeter()/2;
        return Math.sqrt(s * (s-this.side1) * (s-this.side2) * (s-this.side3));
    }

    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) throws IllegalTriangleException {
        this.side1 = side1;
        Exception();
    }
    public void setSide2(double side2) throws IllegalTriangleException {
        this.side2 = side2;
        Exception();
    }
    public void setSide3(double side3) throws IllegalTriangleException {
        this.side3 = side3;
        Exception();
    }
}// end class
