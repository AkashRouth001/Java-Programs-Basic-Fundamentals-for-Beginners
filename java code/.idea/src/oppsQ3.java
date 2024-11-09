/*Create a class Square with a method to initialize
its side, calculating area, perimeter etc.*/
import java.util.Scanner;
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class oppsQ3 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side value=");
        n=sc.nextInt();
        square value = new square();
        value.side=n;
        System.out.println("area ="+value.area());
        System.out.println("perimeter="+value.perimeter());
    }
}
