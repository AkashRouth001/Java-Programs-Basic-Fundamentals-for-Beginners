/*Calculate the average marks from an array containing
marks of all students in physics using a for-each loop.*/
import java.util.Scanner;
public class arr_q3 {
    public static void main(String[] args)
    {
        int []arr={20,11,30,70,90,17};
        int sum=0;
        //float avg;
        for (int e:arr) {
            sum = sum+e;
        }
        float avg = sum/arr.length;
        System.out.println("avg="+avg);
    }
}
