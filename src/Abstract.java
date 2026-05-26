abstract class shape{
    abstract void draw();
}
class circle extends shape{
    @Override
    void draw() {
        System.out.println("drawing a circle");
    }
}

class rectangle extends shape{
    @Override
    void draw() {
        System.out.println("draw a rectangle");
    }
}

public class Abstract {
    public static void main(String[] args) {
        rectangle r1=new rectangle();
        r1.draw();
        circle c1=new circle();
        c1.draw();
    }
}
