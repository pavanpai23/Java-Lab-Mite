class AddNumbers {

    // Method with 2 integers
    void add(int a, int b) {
        System.out.println("Sum of 2 integers: " + (a + b));
    }

    // Method with 3 integers
    void add(int a, int b, int c) {
        System.out.println("Sum of 3 integers: " + (a + b + c));
    }

    // Method with double values
    void add(double a, double b) {
        System.out.println("Sum of 2 doubles: " + (a + b));
    }

    public static void main(String[] args) {
        AddNumbers obj = new AddNumbers();

        obj.add(10, 20);          // calls first method
        obj.add(10, 20, 30);      // calls second method
        obj.add(5.5, 6.5);        // calls third method
    }
}