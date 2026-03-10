import java.util.Scanner;

public class Operators{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        // Arithmetic Operators
        System.out.println("\nArithmetic Operators");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // Logical Operators
        System.out.println("\nLogical Operators");
        System.out.println("(a > 0 && b > 0) : " + (a > 0 && b > 0));
        System.out.println("(a > 0 || b > 0) : " + (a > 0 || b > 0));
        System.out.println("!(a > b) : " + !(a > b));

        // Assignment Operator
        int c = a;
        c += b;
        System.out.println("\nAssignment Operator (c += b): " + c);

        // Unary Operator
        int d = a;
        System.out.println("\nUnary Operators");
        System.out.println("d++ : " + (d++));
        System.out.println("After increment d : " + d);

    }
}