/*Create a Java program to add two matrices of size 2x3.*/
import java.util.Scanner;
public class arr_q4 {
    public static void main(String[] ags){
        int [][]arr1={{1,2,3,4,5},{9,8,7,6,5}};
        int [][]arr2={{9,8,7,6,5},{1,2,3,4,5}};
        int [][]sum={{0,0,0,0,0},{0,0,0,0,0}};
        int i,j;
        for (i=0;i<arr1.length;i++){
            for (j=0;j<arr1[i].length;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
