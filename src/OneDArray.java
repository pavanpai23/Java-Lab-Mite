
//14]To Read Elements Into array 1D and Display original and Reversed Array

import java.util.Scanner;

public class OneDArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        // Reading array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Display original array
        System.out.println("Original Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Display reversed array
        System.out.println("\nReversed Array:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
