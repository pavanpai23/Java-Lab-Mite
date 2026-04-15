import java.util.Scanner;
import java.util.Stack;

public class stack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int choice, value;

        do {
            System.out.println("\n--- STACK MENU ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = sc.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    if (!stack.isEmpty())
                        System.out.println("Popped: " + stack.pop());
                    else
                        System.out.println("Stack is empty!");
                    break;

                case 3:
                    if (!stack.isEmpty())
                        System.out.println("Top element: " + stack.peek());
                    else
                        System.out.println("Stack is empty!");
                    break;

                case 4:
                    System.out.println("Stack: " + stack);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}