package MyBalance;

public class Balance {

    String name;
    double amount;

    // constructor
    public Balance(String n, double a) {

        name = n;
        amount = a;
    }

    // display negative balances
    public void show() {

        if(amount <0) {

            System.out.print("--->");

            System.out.println(name + ": $" + amount);
        }
    }
}