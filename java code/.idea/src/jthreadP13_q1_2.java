import java.util.ArrayList;
/*class Thread1 extends Thread{
    public void run(){
       while (true){
            System.out.println("welcome");
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        while (true){
            System.out.println("good morning");
        }
    }
}
public class jthreadP13_q1_2 {
    public static void main(String[] args){
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}*/
class Thread1 extends Thread{
    public void run(){
        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("welcome");
    }
}
class Thread2 extends Thread{
    public void run(){
            System.out.println("good morning");
    }
}
public class jthreadP13_q1_2 {
    public static void main(String[] args){
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}