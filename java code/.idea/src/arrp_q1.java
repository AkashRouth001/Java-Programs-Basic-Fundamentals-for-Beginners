/*Create an array of 5 floats and calculate their sum.*/
import java.util.Scanner;
public class arrp_q1 {
    public static void main(String[] args){
        float [] arr={4.5f,3.5f,10.0f,20.5f,2.5f};
        float sum = 0.0f;
        for(float e:arr)
        {
            sum = sum+e;
        }
        System.out.print("sum="+sum);
    }
}
