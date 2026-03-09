
//Write A Menu Driven Java Prog To Find Largest Of 3 N0. Using Ternary and If Control Statement

import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c, ch;

        System.out.println("Enter three numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println("1. Using If");
        System.out.println("2. Using Ternary");
        System.out.println("Enter choice:");
        ch = sc.nextInt();

        switch (ch) {
            case 1:
                if (a > b && a > c)
                    System.out.println("Largest = " + a);
                else if (b > c)
                    System.out.println("Largest = " + b);
                else
                    System.out.println("Largest = " + c);
                break;

            case 2:
                int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
                System.out.println("Largest = " + max);
                break;

            default:
                System.out.println("Wrong choice");
        }
    }
}