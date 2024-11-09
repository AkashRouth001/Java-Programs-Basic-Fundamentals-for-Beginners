abstract class pen{
    abstract void write ();
    abstract void refill();
}
class FountainPen extends pen{
    void write(){
        System.out.println("writing with pen");
    }
    void refill(){
        System.out.println("put the refill");
    }
}
public class abClass_interfaceQ1 {
    public static void main(String[] args){
        FountainPen p = new FountainPen();
        p.refill();

    }
}
