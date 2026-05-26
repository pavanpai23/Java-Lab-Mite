package ASSINGMNET;

class Person {

    void displayName() {
        System.out.println("Name: Pavan Pai");
    }
}

class Employee extends Person {

    void showEmployeeId() {
        System.out.println("Employee ID: EMP101");
    }
}

class Manager extends Employee {

    void showDepartment() {
        System.out.println("Department: IT");
    }
}

public class sec {

    public static void main(String[] args) {

        Manager m = new Manager();

        // Calling all methods
        m.displayName();
        m.showEmployeeId();
        m.showDepartment();
    }
}