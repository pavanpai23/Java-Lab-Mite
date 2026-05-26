class Test{
    int a,b;

    Test(int i,int j){
        a=i;
        b=j;
    }

    boolean equals(Test ob){
        if(a==ob.a&&b==ob.b){
            return true;
        }
        else{
            return false;
        }
    }
}
public class ObjectAsParameter {
    public static void main(String[] args) {
        Test ob1=new Test(5,10);
        Test ob2=new Test(5,10);
        Test ob3=new Test(5,40);
        System.out.println("ob1=ob2"+ob1.equals(ob2));
        System.out.println("ob1=ob3"+ob1.equals(ob3));
    }
}
