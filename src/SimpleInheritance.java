class Box{
    double width,height,depth;
    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    double volume(){
        return width*height*depth;
    }
}

class BoxWeight extends Box{
    double weight;
    BoxWeight(double w,double h,double d,double m){
        super(w,h,d);
        weight=m;
    }
}


public class SimpleInheritance {
    public static void main(String[] args) {
        BoxWeight b1=new BoxWeight(10,20,30,40);
    double vol=b1.volume();
        System.out.println("vol is:"+vol);
        System.out.println("weight is:"+b1.weight);
    }
}
