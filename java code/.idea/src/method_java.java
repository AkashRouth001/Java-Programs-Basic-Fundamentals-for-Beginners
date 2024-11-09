//sum
import java.util.Scanner;
public class method_java {
   static int sum(int x,int y)
   {
       int z;
       z=x+y;
       return z;
   }
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st value=");
        a=sc.nextInt();
        System.out.println("enter the 2nd value=");
        b=sc.nextInt();
        c = sum(a,b);
        System.out.println("sum="+c);
    }
}
