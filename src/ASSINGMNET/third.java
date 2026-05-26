package ASSINGMNET;

// Interface
interface Remote {

    void pressButton();
}

// Implementing class
class TV implements Remote {

       public void pressButton() {
        System.out.println("TV is ON. Button Pressed!");
    }
}

public class third {

    public static void main(String[] args) {

        // Creating object of TV
        TV t = new TV();

        // Calling interface method
        t.pressButton();
    }
}