public class Scope {
    public static void main(String[] args) {
        int x=10;
        if(x>5){
            int y=20;
            System.out.println("x:" +x + "y:" +y);
            x=y*2;
        }
        System.out.println("x:"+x);
    }
    //System.out.println(y) //error y is not access able
}
