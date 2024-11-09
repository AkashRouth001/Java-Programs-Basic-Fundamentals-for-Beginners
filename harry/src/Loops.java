import java.util.Scanner;
public class Loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = sc.nextInt();
        int i;
        int sum =0;
        for(i=0;i<=10;i++){
            sum = i*n + sum;
        }
        System.out.printf("sum = %d",sum);
        /*.....factorial....
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = sc.nextInt();
        int i;
        int fact=1;
        for(i =n;i>0;i--)
        {
            fact = fact * i;
        }
        System.out.printf("factorial = %d",fact);
        */

        /*....multiplication table reverse order ....
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = sc.nextInt();
        int i;
        for(i=10;i>0;i--)
        {
            System.out.printf("%d x %d = %d \n",n,i,n*i);
        }*/


        /*....multiplication table....

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = sc.nextInt();
        int i;
        for(i=0;i<=10;i++)
        {
            System.out.printf("%d x %d = %d \n",n,i,n*i);
        }*/


    /* .... som of even number ...
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number :");
    int n = sc.nextInt();
    int i;
    int sum =0;
    for(i=0;i<=n;i++){
        if(i%2==0){
            sum = i+ sum;

        }
    }
    System.out.println("sum = "+sum);
   */


        /*  ....... star print .....
        int n = 4;
        for(int i =n;i>0;i--){
            for(int j =0; j<i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }*/
    }
}
