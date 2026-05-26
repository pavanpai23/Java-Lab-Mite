class A{
    A(){
        System.out.println("Inside A's Constructor");
    }
    void show(){
        System.out.println("Inside A's show");
    }
}
class B extends A{
    B(){
        System.out.println("Inside B's Constructor");
        }
        void show(){
            System.out.println("Inside B's show");
        }
    }
    class C extends B{
    C(){
            System.out.println("Inside C's Constructor");
        }
        void show(){
            System.out.println("Inside C'show");
    }
    }

public class MultilevelInheritance {
    public static void main(String[] args) {
        C ob=new C();
        ob.show();
    }
}
