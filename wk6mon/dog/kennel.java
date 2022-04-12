package dog;

public class kennel {
    public static void main(String[] args) {
        dog lucky = new dog("Lucky", 4);
        dog Milo = new dog("Milo", 12);
        dog Tony = new dog("Tony", 7);

        System.out.println(lucky.toString());
        System.out.println();

        System.out.println(Milo.toString());
        System.out.println();

        System.out.println(Tony.toString());
    }
}
