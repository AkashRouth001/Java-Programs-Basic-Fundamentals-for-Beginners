/*Question 3 :Calculate income tax paid by an employee to the government as per the slabs mentioned below:

Income Slab	Tax
2.5L – 5.0L  	5%
5.0L – 10.0L 	20%
Above 10.0L	30%
Note that there is not tax below 2.5L. Take the input amount as input from the user.*/
import java.util.Scanner;
public class p4_q2 {
    public static void main(String[] args)
    {
        int income ;
        float tax;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the your yearly income =");
        income = sc.nextInt();
        if(income <2.5){
            System.out.println("in this case you will not give any tax  <3");
            tax =0;
        }
        else if (income>=2.5f && income<=5.0f) {
            tax = 2.5f+0.05f*(income-2.5f);
        }
        else if (income>5.0f && income<=10.0f) {
            tax = 2.5f+0.05f*(5.0f-2.5f)+0.2F*(income-5.0f);
        }
        else  {
            tax = 2.5f+0.05f*(5.0f-2.5f)+0.2F*(10.0f-5.0f)+0.3f*(income-10.0f);
        }
        System.out.println("tax is "+tax);
    }
}
