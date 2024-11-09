/*Write a Java program to reverse an array.*/
import java.util.Scanner;
public class arr_q5 {
    public static void main(String[] args){
        int []a={1,2,3,4,5,6,7};
        int l = a.length,temp;
        for(int i=0;i<l/2;i++){
            temp = a[i];
            a[i]=a[l-1-i];
            a[l-1-i]=temp;

        }
        for(int element: a){
            System.out.print(element + " ");
        }
    }
}
