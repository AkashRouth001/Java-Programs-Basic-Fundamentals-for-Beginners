/*Write a Java program to find out the day
of the week given the number
[1 for Monday, 2 for Tuesday … and so on!]*/
import java.util.Scanner;
public class p4_q4 {
    public static void main(String[] args)
    {
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of the day:");
        day = sc.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
        }
    }
}
