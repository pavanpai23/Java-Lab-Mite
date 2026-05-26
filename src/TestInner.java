class Outer {
    int number = 10;  // instance variable

    // method to display number
    void display() {
        System.out.println("Number: " + number);
    }

    // inner class
    class Inner {
        void show() {
            System.out.println("This is inner class");
        }
    }
}

public class TestInner {
    public static void main(String args[]) {

        Outer obj = new Outer();     // outer object
        obj.display();               // call outer method

        Outer.Inner in = obj.new Inner();  // inner object
        in.show();                  // call inner method
    }
}