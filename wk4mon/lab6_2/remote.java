package lab6_2;

public class remote {
    public static void main(String[] args) {
        TV tele = new TV(5, 10);

        System.out.println("the initial states of tv objesct are : ");
        System.out.println("Channel : "+tele.viewChannel());
        System.out.println("Volume : "+tele.viewVol());
        System.out.print("status : ");
        tele.checkTVFlag();

        tele.turnTV();
        tele.changeChannel(20);
        tele.lowerVol();
        tele.lowerVol();

        System.out.println("the states of tv objesct are : ");
        System.out.println("Channel : "+tele.viewChannel());
        System.out.println("Volume : "+tele.viewVol());
        System.out.print("status : ");
        tele.checkTVFlag();
    }
}
