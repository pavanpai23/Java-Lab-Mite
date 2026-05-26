package MyBalance;

public class AccountBalance {

    public static void main(String[] args) {

        Balance accounts[] = new Balance[3];

        accounts[0] = new Balance("john", 134.33);

        accounts[1] = new Balance("vir", -233.4);

        accounts[2] = new Balance("don", 384.2);

        // enhanced for loop
        for(Balance acc : accounts) {

            acc.show();
        }
    }
}