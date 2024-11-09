/*Question 2: Write a program to find out whether a student is pass or fail;
if it requires a total of 40% and at least 33% in each subject to pass.
 Assume 3 subjects and take marks as input from the user*/
import java.util.Scanner;
public class p4_q1 {
    public static void main(String[] args){
        int s1,s2,s3;
        float avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the % os 1st sub=");
        s1 = sc.nextInt();
        System.out.println("enter the % os 2nd sub=");
        s2 = sc.nextInt();
        System.out.println("enter the % os 3rd sub=");
        s3 = sc.nextInt();
        avg = (s1+s2+s3)/3.0f;
        System.out.println("avg is "+ avg);
        if(s1>=33&&s2>=33&&s3>=33&&avg>=40)
        {
            System.out.println("you pass the exam ");
        }
        else
        {
            System.out.println("you not pass the exam ...");
        }
    }
}
