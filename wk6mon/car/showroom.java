package car;

public class showroom {
    public static void main(String[] args) {
        car toyota = new car("Toyota", "Veego" , 2000);
        car honda = new car("Honda", "City" , 2010);

        System.out.println(toyota.toString());
        System.out.println();

        System.out.println(honda.toString());
        System.out.println();
    }
}
