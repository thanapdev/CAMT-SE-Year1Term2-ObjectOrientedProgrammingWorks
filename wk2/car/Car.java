//thanpong yamkamol
//642115022
package car;

public class Car {

    private String color;
    private int speed;
    private int milage;

    public Car(String col){
        color = col;
        speed = 0;
        milage = 0;
    }

    public String getColor(){return color;}
    public int getSpeed(){return speed;}
    public int getMilage(){return milage;}

    public void setSpeed(int sp){
        speed = sp;
    }

    public void setMilage(int ml){
        milage = ml;
    }
}
