/*Create a class cellphone with methods
 to print “ringing…”, “vibrating…”, etc.*/
class cellphone{
    public void ringing(){
        System.out.println("ph is ringing ");
    }
    public void vibrating(){
        System.out.println("ph is vibrating ..");
    }
    public void off(){
        System.out.println("ph is switch offff");
    }
}
public class oppsQ2 {
    public static void main(String[] args){
        cellphone poco = new cellphone();
        poco.vibrating();
        poco.ringing();
        poco.off();
    }
}
