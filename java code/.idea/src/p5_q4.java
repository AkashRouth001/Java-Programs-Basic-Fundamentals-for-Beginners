import java.util.Scanner;
public class p5_q4 {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n=");
        n= sc.nextInt();
        for (int i=10;i>0;i--)
        {
            System.out.println(n+"*"+i+"="+i*n);
        }
    }
}
