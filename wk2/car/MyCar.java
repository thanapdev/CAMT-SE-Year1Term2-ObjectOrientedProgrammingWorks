//thanpong yamkamol
//642115022
package car;

public class MyCar {
    public static void main(String[] args) {
        Car toyota = new Car("red");
        Car honda = new Car("blue");

        toyota.setSpeed(200);
        toyota.setMilage(1345);

        honda.setSpeed(300);
        honda.setMilage(8987);

        System.out.println("TOYOTA color : " +toyota.getColor() + " | speed : " + toyota.getSpeed() + " | Milage : " + toyota.getMilage());
        System.out.println("HONDA color : " +honda.getColor() + " | speed : " + honda.getSpeed() + " | Milage : " + honda.getMilage());
    }
}
