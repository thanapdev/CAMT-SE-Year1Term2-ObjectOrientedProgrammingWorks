//thanapong yamkamol
//642115022

package readwtite;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter file name: ");
        File fl = new File("D:/WORKS/oop/wk12thu/readwrite/"+input.nextLine());
        try (Scanner readFile = new Scanner(fl)) {
            String[] scores = readFile.nextLine().split("\s");
            double sum = 0;
            for (int i = 0; i < scores.length; i++) {
                sum += Double.parseDouble(scores[i]);
            }
            System.out.println("Sum : "+sum);
            System.out.println("AVG : " + (sum/scores.length));
        }
        input.close();
    }
}
