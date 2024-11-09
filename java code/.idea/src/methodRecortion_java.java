import java.util.Scanner;
public class methodRecortion_java {
    static int fact(int n)
    {
        if(n!=0){
            return n*fact(n-1);
        }
        else {
            return 1;
        }
    }
    public static void main(String[] args){
        int num,f;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number =");
        num = sc.nextInt();
        f = fact(num);
        System.out.println("factorial of "+num+" is ="+f);
    }
}
