
//smallest of 2 numbers

import java.util.Scanner;
public class SmallestOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Enter two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a < b)
            System.out.println("Smallest number is: " + a);
        else
            System.out.println("Smallest number is: " + b);
    }
}
