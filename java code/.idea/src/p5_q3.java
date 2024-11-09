/*Write a program to print the multiplication table of a given number n.*/
import java.util.Scanner;
public class p5_q3 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n =");
        n = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+"*"+n+"="+i*n);
        }
    }
}
