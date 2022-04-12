package Bike;

import java.util.Random;

public class testBike {
    public static void main(String[] args) {

        Random rand = new Random();

        System.out.println("Normal Bike Start Speed : 20 ");
        Bicycle suckBike = new Bicycle(20);

        System.out.println("Speed Up Gear");
        suckBike.speedUp(rand.nextInt(99));
        System.out.println("Speed up : "+suckBike.getSpeed());
        suckBike.speedUp(rand.nextInt(99));
        System.out.println("Speed up : "+suckBike.getSpeed());
        suckBike.speedUp(rand.nextInt(99));
        System.out.println("Speed up : "+suckBike.getSpeed());
        suckBike.speedUp(rand.nextInt(99));
        System.out.println("Speed up : "+suckBike.getSpeed());
        suckBike.speedUp(rand.nextInt(99));
        System.out.println("Speed up : "+suckBike.getSpeed());
        System.out.println(" ");

        System.out.println("Speed Down Gear");
        suckBike.applyBrake(rand.nextInt(99));
        System.out.println("Speed down : "+suckBike.getSpeed());
        suckBike.applyBrake(rand.nextInt(99));
        System.out.println("Speed down : "+suckBike.getSpeed());
        suckBike.applyBrake(rand.nextInt(99));
        System.out.println("Speed down : "+suckBike.getSpeed());
        suckBike.applyBrake(rand.nextInt(99));
        System.out.println("Speed down : "+suckBike.getSpeed());
        suckBike.applyBrake(rand.nextInt(99));
        System.out.println("Speed down : "+suckBike.getSpeed());

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Mountain Bike Start Speed : 20");
        MountainBike FrameKaiser = new MountainBike(20, 1);

        System.out.println("Speed Up Gear : ");
        FrameKaiser.speedUp(rand.nextInt(99));
        System.out.println("Speed up : "+FrameKaiser.getSpeed());
        FrameKaiser.speedUp(rand.nextInt(99));
        System.out.println("Speed up : "+FrameKaiser.getSpeed());
        FrameKaiser.speedUp(rand.nextInt(99));
        System.out.println("Speed up : "+FrameKaiser.getSpeed());
        FrameKaiser.speedUp(rand.nextInt(99));
        System.out.println("Speed up : "+FrameKaiser.getSpeed());
        FrameKaiser.speedUp(rand.nextInt(99));
        System.out.println("Speed up : "+FrameKaiser.getSpeed());
        System.out.println(" ");

        System.out.println("Speed Down Gear : ");
        FrameKaiser.applyBrake(rand.nextInt(99));
        System.out.println("Speed down : "+FrameKaiser.getSpeed());
        FrameKaiser.applyBrake(rand.nextInt(99));
        System.out.println("Speed down : "+FrameKaiser.getSpeed());
        FrameKaiser.applyBrake(rand.nextInt(99));
        System.out.println("Speed down : "+FrameKaiser.getSpeed());
        FrameKaiser.applyBrake(rand.nextInt(99));
        System.out.println("Speed down : "+FrameKaiser.getSpeed());
        FrameKaiser.applyBrake(rand.nextInt(99));
        System.out.println("Speed down : "+FrameKaiser.getSpeed());

    }
}
