//thanapong yamkamol 
//642115022

import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int money = 1 ;
        int saveday = 1;
       for (int i = 1; i <= 30; i++) {
           System.out.println(money);

           saveday = saveday*2;
           money = money+saveday;
       }
    }
}
