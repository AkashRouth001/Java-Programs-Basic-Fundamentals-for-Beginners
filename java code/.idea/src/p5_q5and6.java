/*Question 5:Write a program to find the factorial of a given number using for loops.
import java.util.Scanner;
public class p5_q5and6 {
    public static void main(String[] args){
        int n,i,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number =");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            fact = fact *i;
        }
        System.out.println("factorial = "+fact);
    }
}*/
/*Question 6: Repeat problem 5 using a while loop.*/
import java.util.Scanner;
public class p5_q5and6 {
    public static void main(String[] args)
    {
        int n,fact=1;
        int i=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number =");
        n=sc.nextInt();
        while(i<=n)
        {
            fact = fact*i;
            i++;
        }
        System.out.println("factorial ="+fact);
    }
}