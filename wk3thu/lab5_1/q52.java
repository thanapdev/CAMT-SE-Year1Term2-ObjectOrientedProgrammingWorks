//thanapong yamkamol
//642115022

package lab5_1;

import java.util.Random;

public class q52 {
    public static void main(String[] args) {
        Random rnd = new Random(1000);

        for (int i = 1; i <= 50; i++) {
            System.out.println(rnd.nextInt(100));
        }
    }
}
