
//] Program To Read Jagged Array And Display The Same

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows;

        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();

        int[][] arr = new int[rows][];

        // Reading elements
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of elements in row " + i + ": ");
            int cols = sc.nextInt();

            arr[i] = new int[cols];

            System.out.println("Enter elements:");
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Displaying jagged array
        System.out.println("Jagged Array Elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}