package lab6_1;

public class TestTime {
    public static void main(String[] args) {
        int size = 100000;

        double[] list = new double[size];

        StopWatch stopWatch = new StopWatch();
        for(int i = 0; i < size; i++ )
            System.out.println("wowza");
        stopWatch.stop();

        System.out.println("The process time is "+stopWatch.getElapsedTime());
    }
}
