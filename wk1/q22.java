//thanapong yamkamol 
//642115022

import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int money = 1;
        int day = 0;
        while (true) {
            System.out.println(money);
            money = money*2;
            day = day+1;

            if(money >= 1000000){
                break;
            }
        }

        System.out.println("Vader has save 1,000,000 at day" + day);
    }    
}
