class Test1 {
    int a;

    Test1(int i) {
        a = i;
    }

    Test1 incrementByTen(){
        Test1 temp = new Test1(a+10);
        return temp;
    }
}

public class RetruningAnObject {
    public static void main(String[] args) {
        Test1 ob1=new Test1(5);
        Test1 ob2;
        ob2=ob1.incrementByTen();
        System.out.println("ob1.a="+ob1.a);
        System.out.println("ob2.a="+ob2.a);
    }
}
