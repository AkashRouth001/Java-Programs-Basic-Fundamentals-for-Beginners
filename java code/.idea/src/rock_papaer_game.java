/*gameeeeeeeeee =>rock paper scissor*/
import java.util.Scanner;
import java.util.Random;
public class rock_papaer_game {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter what you want\n0=>rock\n1=>paper\n2=>scissor\n=>");
        int user = sc.nextInt();
        Random random = new Random();
        int compInput = random.nextInt(3);
        if (user==0||user==1|user==2){
            if(user==compInput)
            {
                System.out.print("game is draw");
            }
            else if (user==0&&compInput==2||user==1&&compInput==0||user==2&&compInput==0) {
                System.out.println("you winnn :)");
            }
            else {
                System.out.println("coumputer winnn :(");
            }
        }
        else {
            System.out.println("take wrong input ..");
        }
    }
}
