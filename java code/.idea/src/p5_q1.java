/*Question 1: Write a program to print the following pattern :

 ****

 ***

 **

 *
 */
import java.util.Scanner;
public class p5_q1 {
    public static void main(String[] args)
    {
        int n=4;
        for (int i=n;i>0;i--){
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}