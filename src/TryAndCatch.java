public class TryAndCatch {
    public static void main(String[] args) {
        try{
            int arr[]=new int[3];
            arr[5]=10;
        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception occured");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured");
        } catch (Exception e) {
            System.out.println("some other exception occured");
        }
    }
}
