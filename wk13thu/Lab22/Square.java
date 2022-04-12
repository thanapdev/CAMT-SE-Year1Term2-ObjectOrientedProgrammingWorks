//thanapong Yamkamol
//642115022

package Lab22;

interface Colorable{
    public void howToColor();
}

class Square extends GeometricObject implements Colorable{
    private double side;

    public Square(){
        setSide(0);
    }

    public Square(double side){
        setSide(side);
    }

    public void setSide(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return side*4;
    }
}


