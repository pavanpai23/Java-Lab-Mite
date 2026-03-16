
//simple calculators

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, choice;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        do {
            System.out.println("\nCalculator Menu");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Addition = " + (a + b));
                    break;

                case 2:
                    System.out.println("Subtraction = " + (a - b));
                    break;

                case 3:
                    System.out.println("Multiplication = " + (a * b));
                    break;

                case 4:
                    if (b != 0)
                        System.out.println("Division = " + (a / b));
                    else
                        System.out.println("Cannot divide by zero");
                    break;

                case 5:
                    System.out.println("Modulus = " + (a % b));
                    break;

                case 6:
                    System.out.println("Exiting Calculator...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);
    }
}