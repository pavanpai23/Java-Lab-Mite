class Test3{
    int a;        // default access
    public int b; // public access
    private int c; // private access

    // set value of c
    void setc(int i) {
        c = i;
    }

    // get value of c
    int getc() {
        return c;
    }
}

class AccessTest {
    public static void main(String args[]) {
        Test3 ob = new Test3();

        // Accessing a and b directly
        ob.a = 10;
        ob.b = 20;

        // ob.c = 100; ❌ ERROR (private variable)

        // Accessing private variable using methods
        ob.setc(100);

        System.out.println("a, b, and c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}