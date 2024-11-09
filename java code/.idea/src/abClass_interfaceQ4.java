abstract class telephone{
    abstract void with();
    abstract void lift();
    abstract void disconnected();
}
class smartPhone extends telephone{
    void with(){
        System.out.println("with someone..");
    }
    void lift(){
        System.out.println("pick up the call");
    }
    void disconnected(){
        System.out.println("cut the call");
    }
}
public class abClass_interfaceQ4 {
    public static void main(String[] args){
        telephone t = new smartPhone();
        t.lift();
    }
}
