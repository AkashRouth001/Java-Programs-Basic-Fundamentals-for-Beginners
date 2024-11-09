/*Question 2: Write a program to sum first n even numbers using a while loop.*/
import java.util.Scanner;
public class p5_q2 {
    public static void main(String[] args){
        int n,sum=0,i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n=");
        n=sc.nextInt();
        while(i<n)
        {
            sum = sum+2*i;
            i++;
        }
        System.out.println("sum = "+ sum);

    }
}
