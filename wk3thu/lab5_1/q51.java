//thanapong yamkamol
//642115022

package lab5_1;

import java.util.Date;

/**
 * q51
 */
public class q51 {
    public static void main(String[] args) {
        Date date = new Date();
        int count = 1;
        long time = 10000;

        while(count <= 8){
            date.setTime(time);
            System.err.println(date.toString());
            count++;
            time*=10;
        }
    }
    
}