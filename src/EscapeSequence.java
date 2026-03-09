
//Demonstrate Escape Sequence

public class EscapeSequence {
    public static void main(String[] args) {
        String str=new String("My name is \'Hari\'");
        System.out.println(str);
        str="My lab in\"Java Lab";
        System.out.println(str);
        str="Firstline\nSecondline";
        System.out.println(str);
        str="MITE Eng \b\n" + "College";
        System.out.println(str);

    }
}
