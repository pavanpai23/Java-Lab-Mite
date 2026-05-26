class DataTypes {
    public static void main(String args[]) {

        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 10000L;
        float f = 10.5f;
        double d = 20.99;
        char c = 'A';
        boolean bool = true;

        System.out.println("byte: " + Byte.SIZE + " bits");
        System.out.println("short: " + Short.SIZE + " bits");
        System.out.println("int: " + Integer.SIZE + " bits");
        System.out.println("long: " + Long.SIZE + " bits");
        System.out.println("float: " + Float.SIZE + " bits");
        System.out.println("double: " + Double.SIZE + " bits");
        System.out.println("char: " + Character.SIZE + " bits");
        System.out.println("boolean: 1 bit (approx)");
    }
}