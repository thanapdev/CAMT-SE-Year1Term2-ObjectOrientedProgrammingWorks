package Lab22;
import java.util.ArrayList;

class testSquare{
    public static void main(String[] args) {
        ArrayList<Square> sqList = new ArrayList<Square>();
        sqList.add(new Square(1));
        sqList.add(new Square(2));
        sqList.add(new Square(3));
        sqList.add(new Square(4));
        sqList.add(new Square(5));
        for (int i = 0; i < sqList.size(); i++) {
            System.out.println(i+" Area: "+sqList.get(i).getArea());
            System.out.print(i+" ");
            sqList.get(i).howToColor();
        }
    }
}
