/*Write a program to find out whether a given integer is present in an array or not.*/
import java.util.Scanner;
public class arr_q2 {
    public static void main(String[] args){
        int []arr={20,11,3,7,9,17};
        int n;
        boolean num = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the searching value:");
        n = sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(n==arr[i]){
                num = true;
                break;
            }
        }
        if (num) {
            System.out.println("yes");
        }
        else  {
            System.out.println("nooooo");
        }
    }
}
