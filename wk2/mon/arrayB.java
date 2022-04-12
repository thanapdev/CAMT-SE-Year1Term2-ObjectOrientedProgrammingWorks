package mon;
// thanapong yamkamol 
//642115022

import java.util.Scanner;

public class arrayB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Sum of column 0: "+sumColumn(matrix, 0));
        System.out.println("Sum of column 1: "+sumColumn(matrix, 1));
        System.out.println("Sum of column 2: "+sumColumn(matrix, 2));
        System.out.println("Sum of column 3: "+sumColumn(matrix, 3));

        input.close();
    }

    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
}