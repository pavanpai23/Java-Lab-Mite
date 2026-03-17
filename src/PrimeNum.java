
//Prime Numbers

import java.util.Scanner;

public class PrimeNum{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start, end;

        // Input range
        System.out.print("Enter starting number: ");
        start = sc.nextInt();

        System.out.print("Enter ending number: ");
        end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {

            if (i < 2)
                continue;

            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}