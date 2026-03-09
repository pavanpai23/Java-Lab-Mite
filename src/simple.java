
//to find Simple interest

import java.util.Scanner;
public class simple {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter p :");
        double p=in.nextDouble();
        System.out.println("enter r :");
        double r=in.nextDouble();
        System.out.println("enter t :");
        double t=in.nextDouble();
        double interest=(p*r*t)/100;
        System.out.println("simple interest :" +interest);
    }
}
