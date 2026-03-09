
//Java pro to read i/p from keyboard from scanner

import java.util.Scanner;
public class read {
    public static void main(String[] args) {
        int x,y;
        int sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter x and y vals:");
        x=in.nextInt();
        y=in.nextInt();
        if(x>0 && ++y>0)
            sum=x+y;
        System.out.println("x="+x+" and y="+y+" \n x+y =" +sum);
    }
}
