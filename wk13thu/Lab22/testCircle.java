package Lab22;

class testCircle{
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(1);
        ComparableCircle circle2 = new ComparableCircle(10);
        if(circle1.compareTo(circle2) >= 0){
            System.out.println("Circle 1 is bigger.");
        } else {
            System.out.println("Circle 2 is bigger.");
        }
    }
}
