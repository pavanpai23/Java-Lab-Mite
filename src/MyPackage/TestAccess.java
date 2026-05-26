package MyPackage;
import MyPackage.MyClass;
public class TestAccess extends MyClass{
    public static void main(String[] args) {
        MyClass ob=new MyClass();
        System.out.println("Accessing from a diff package");
//        System.out.println("public variable:"+ob.pubvar);
        System.out.println("protected variable"+ob.protvar);
//        System.out.println("default variable"+ob.defvar);
//        System.out.println("private variable"+ob.privar);//not allowed
//        TestAccess testobj=new TestAccess();
//        System.out.println("protected variable (via inheritance):"+testobj.protvar);//allowed
    }
}
