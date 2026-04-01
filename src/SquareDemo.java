import java.util.Scanner;

// Class Square
class Square {
    double side;

    // Function to calculate area
    double area() {
        return side * side;
    }

    // Function to calculate perimeter
    double perimeter() {
        return 4 * side;
    }
}

// Main class
public class SquareDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Square s = new Square();

        System.out.print("Enter side of square: ");
        s.side = sc.nextDouble();

        double a = s.area();
        double p = s.perimeter();

        System.out.println("Area of square = " + a);
        System.out.println("Perimeter of square = " + p);

        sc.close();
    }
}