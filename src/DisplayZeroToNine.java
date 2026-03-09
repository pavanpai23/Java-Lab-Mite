
//Program To Display Num and Num Name From 0 to 9

public class DisplayZeroToNine{
    public static void main(String[] args) {

        String[] array = {"Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"};

        for (int i = 0; i < array.length; i++) {
            System.out.println("Num : " + i + "  Num Name : " + array[i]);
        }
    }
}