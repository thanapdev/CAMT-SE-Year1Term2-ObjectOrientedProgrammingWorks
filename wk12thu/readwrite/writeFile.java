//thanapong yamkamol
//642115022

package readwtite;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class writeFile {
    public static void main(String[] args) throws IOException {
        try{
            File newFile = new File("D:/WORKS/oop/wk12thu/readwrite/newinput.txt");
            PrintWriter writer = new PrintWriter(new FileOutputStream(newFile, false));
            Random rng = new Random();
            for (int i = 0; i < 100; i++) {
                writer.write(rng.nextInt(100)+" ");
            }
            writer.close();
            
            String[] dataString = new String[100];
            int[] dataInt = new int[100];
            Scanner reader = new Scanner(newFile);
            while(reader.hasNextLine()){
                dataString = reader.nextLine().split("\s");
            }
            for (int i = 0; i < dataString.length; i++) {
                dataInt[i] = Integer.parseInt(dataString[i]);
            }
            Arrays.sort(dataInt);
            for (int i = 0; i < dataInt.length; i++) {
                System.out.println(dataInt[i]);
            }
            reader.close();
        } catch (IOException e){
            System.out.println("ERROR");
        }
    }
}
