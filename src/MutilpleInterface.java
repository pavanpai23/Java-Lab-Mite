interface Camera{
    void takephoto();
}
interface Musicplayer{
    void playMusic();
}
class Smartphone implements Camera,Musicplayer
{
    public void takephoto(){
        System.out.println("Photo Captured");
    }
    public void playMusic(){
        System.out.println("playing music");
    }
}

public class MutilpleInterface {
    public static void main(String[] args) {
        Smartphone s=new Smartphone();
        s.takephoto();
        s.playMusic();
    }
}
