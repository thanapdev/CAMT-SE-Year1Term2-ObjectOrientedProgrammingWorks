//thanpong yamkamol
//642115022
package rectangle;

public class MyRectangle {
    public static void main(String[] args) {

        Rectangle Square = new Rectangle(5 , 5);
       
        Rectangle nonSquare = new Rectangle(8, 5);
       

        System.out.println("Square: "+Square.getHeight()+" x "+Square.getWidth());
        System.out.println("Area : "+Square.area());
        System.out.println("Perimeter : "+Square.Perimeter());

        System.out.println("NON-Square: "+nonSquare.getHeight()+" x "+nonSquare.getWidth());
        System.out.println("Area : "+nonSquare.area());
        System.out.println("Perimeter : "+nonSquare.Perimeter());
}
}
