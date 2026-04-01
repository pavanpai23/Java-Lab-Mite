// Class Square
class Square1 {
    double side;
    String color;

    // 0-parameter constructor (default)
    Square1() {
        side = 1;
        color = "White";
    }

    // 1-parameter constructor
    Square1(double s) {
        side = s;
        color = "White";
    }

    // 2-parameter constructor
    Square1(double s, String c) {
        side = s;
        color = c;
    }

//    // Copy constructor
//    Square1(Square s) {
//        side = s.side;
//        color = s.color;
//    }

    // Method to calculate area
    double area() {
        return side * side;
    }

    // Method to display details
    void display() {
        System.out.println("Side  : " + side);
        System.out.println("Color : " + color);
        System.out.println("Area  : " + area());
        System.out.println();
    }
}

// Main class
public class Construtor{
    public static void main(String[] args) {

        Square1 sq1 = new Square1();              // default
        Square1 sq2 = new Square1(5);             // 1 parameter
        Square1 sq3 = new Square1(4, "Blue");     // 2 parameter
//        Square1 sq4 = new Square1(sq3);           // copy constructor

        sq1.display();
        sq2.display();
        sq3.display();

//        System.out.println("Copy Constructor Output:");
//        sq4.display();
    }
}