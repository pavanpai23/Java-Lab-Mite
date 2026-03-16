
//Students marks

import java.util.Scanner;

public class Student{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String usn;
        int m1, m2, m3;
        double avg;
        char grade;

        // Input USN
        System.out.print("Enter Student USN: ");
        usn = sc.nextLine();

        // Input Marks
        System.out.print("Enter Marks of Subject 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        m3 = sc.nextInt();

        // Calculate Average
        avg = (m1 + m2 + m3) / 3.0;

        // Grade Calculation
        if (avg >= 90 && avg <= 100)
            grade = 'A';
        else if (avg >= 75)
            grade = 'B';
        else if (avg >= 60)
            grade = 'C';
        else if (avg >= 50)
            grade = 'D';
        else if (avg >= 40)
            grade = 'E';
        else
            grade = 'F';

        // Output
        System.out.println("\n----- Student Details -----");
        System.out.println("USN: " + usn);

        System.out.println("Marks:");
        System.out.println("Subject 1: " + m1);
        System.out.println("Subject 2: " + m2);
        System.out.println("Subject 3: " + m3);

        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}