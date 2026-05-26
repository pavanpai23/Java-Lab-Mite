class A1{
    A1(){
        System.out.println("Inside A's Constructor");
    }
    void show(){
        System.out.println("Inside A's show");
    }
}
class B1 extends A1{
    B1(){
        System.out.println("Inside B's Constructor");
    }
    void show(){
        System.out.println("Inside B's show");
    }
}
class C1 extends B1{
    C1(){
        System.out.println("Inside C's Constructor");
    }
    void show(){
        System.out.println("Inside C'show");
    }
}


public class Dynamic {
    public static void main(String[] args) {
       A1 a=new A1();
       B1 b=new B1();
       C1 c=new C1();

       A1 r;
       r=a;
       r.show();
       r=b;
       r.show();
       r=c;
       r.show();
    }
}
