public class NestedTry {
    public static void main(String[] args) {
        try {
            int arr[] = {1, 2, 3};
            System.out.println("outer try block");
            // inner try
            try {
                System.out.println("inner try block");
                System.out.println(arr[5]);
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("inner catch: Array index out of bound!");
            }
            int result = 10 / 0;
        }
        catch(ArithmeticException e) {
            System.out.println("outer catch: division by zero error!");
        }
        System.out.println("exception continues....");
    }
}