package Lab13_1;

public class main1 {
    public static void main(String[] args) {

        Admin person2 = new Admin("Nong Su ");

        Janitor person3 = new Janitor("Nong Sora ");

        Receptionist person4 = new Receptionist("Nong Poopha ");

        IT person5 = new IT("Nong Vee ");

        person2.management();
        person3.cleaning();
        person4.welcome();
        person5.development();

    }
    
}
