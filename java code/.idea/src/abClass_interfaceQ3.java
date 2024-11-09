class Monkey{
    void jump(){
        System.out.println("jumping....");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("helloo hululu");
    }
    public void eat(){
        System.out.println("eatingg");
    }
    public void sleep(){
        System.out.println("sleepingg");
    }
}
public class abClass_interfaceQ3 {
    public static void main(String[] args){
        Human an = new Human();
        an.sleep();

        //Q5
        Monkey m1 = new Human();
        //m1.speak();--->not working
    }
}
