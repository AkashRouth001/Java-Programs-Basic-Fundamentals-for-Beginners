import java.util.Scanner;
import java.util.Random;
public class Condition {
    public static void main(String[] args){


        // rock paper game
        System.out.println(" 0> rock \n 1> paper \n 2> scissor ");
        System.out.print(" enter your chose : ");
        Scanner sc = new Scanner(System.in);
        int usin = sc.nextInt();

        Random rn = new Random();
        int comin = rn.nextInt(3);

        if(usin == comin)
        {
            System.out.println(" !!DRAW!!");
        }
        else if (usin == 0 && comin == 2|| usin == 1 && comin == 0|| usin == 2 && comin == 1) {
            System.out.println(" !!YOU WIN THE GAME !!");
        }
        else {
            System.out.println(" !!COM WIN!!");
        }

        /* USING SWITCH CASE
        System.out.print("enter the age= ");
        Scanner sc = new Scanner(System.in);
        int age= sc.nextInt();

        switch (age){
            case 18:
                System.out.println(" you are adult now");
                break;
            case 25:
                System.out.println(" you are doing job now");
                break;
            case 30:
                System.out.println(" you are not single now");
                break;
            default:
                System.out.println(" no chap broo !!!");
        } */




        /*
        ........USING IF ......

        System.out.print("enter the age =");
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        if (age>18){
            System.out.println(" the person is adult");
        }
        else{
            System.out.println(" the person is not adult");
        }*/
    }
}
