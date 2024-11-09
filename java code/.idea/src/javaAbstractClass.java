abstract class base{
    public base(){
        System.out.println("i am base constructor");
    }
    public void sayHallow(){
        System.out.println("hiiiiiiiiiiiiiiii");
    }
    abstract public void greet();
}
class base2 extends base{
    @Override
    public void greet() {
        System.out.println("good morning");
    }
}
public class javaAbstractClass {
    public static void main(String[] args){

    }
}
