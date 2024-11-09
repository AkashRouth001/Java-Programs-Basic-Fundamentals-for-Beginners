import java.util.Scanner;
public class methodOverloding_java {
    static void sum(int x,int y){
        int z;
        z=x+y;
        System.out.println("sum="+z);
       // return z;
    }
    static void sum(int x,int y,int w){
        int z;
        z=x+y+w;
        System.out.println("sum="+z);
        //return z;
    }
    public static void main(String[] args){
        int p,q,r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st value=");
        p=sc.nextInt();
        System.out.println("enter the 2nd value=");
        q=sc.nextInt();
        System.out.println("enter the 3rd value=");
        r=sc.nextInt();
        sum(p,q);
        sum(p,q,r);

    }
}
