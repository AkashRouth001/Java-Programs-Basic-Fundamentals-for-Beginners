import java.util.Scanner;
public class New {
    public static void main(String[] args){
       // System.out.println("take input from the user :");
        //Scanner sc = new Scanner (System.in);
        // .........USING INT ........
       /* System.out.println("enter the number 1 =");
      int a = sc.nextInt();
       System.out.println("enter the number2 = ");
       int b = sc.nextInt();
        int sum = a+b;*/

        // ........USING FLOAT.............
        /*System.out.println("enter the number 1 =");
         float a = sc.nextFloat();
        System.out.println("enter the number2 = ");
         float b = sc.nextFloat();
        float sum = a+b;
        System.out.print("the sum of two numbers = ");
        System.out.println(sum);*/

        //.........finding number is
        /*boolean c = sc.hasNextInt();
        System.out.println(c);*/

        //...... write alphabet(only 1 word)..
        /*String str = sc.next();
        System.out.println("the name is =");
        System.out.println(str);*/

        // ....write sentens ......
       /* String str = sc.nextLine();
        System.out.println("the name is =");
        System.out.println(str);*/

        //...... question sloving
        /*Q. write a program to calculate percentage of a given student in exam in 5 subj.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of bengali:");
        int ben = sc.nextInt();
        System.out.println("enter the number of bengali:");
        int eng = sc.nextInt();
        System.out.println("enter the number of sub3");
        int sub3 = sc.nextInt();
        System.out.println("enter the number of sub4");
        int sub4 = sc.nextInt();
        System.out.println("enter the number of sub5");
        int sub5 = sc.nextInt();

        int sum = ben+eng+sub3+sub4+sub5;
        int per = (sum*100)/500;
        System.out.println("number is = ");
        System.out.println(per);
    }
}

