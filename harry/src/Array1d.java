public class Array1d {
    public static void main(String[]args){

       // int [] arr = new int[4]; ---> number of arrays input
        /* other
        int []arr1;
        arr1= new int[3];*/
       /* arr[0]=100;
        arr[1]=10;
        arr[2]=20;
        arr[3]=30;
       System.out.println(arr[2]);*/

       /* int [] arr = {10,20,30};
        System.out.println(arr.length); --> find the length of array
         */

        // array value and location of array's value
        int [] arr = {10,20,30};
        for(int i=0;i<arr.length;i++){
            System.out.println( arr[i]);
        }

        // using only for array value print
        System.out.println( "using for-each loop :");
        for (int num:arr) {
            System.out.println(num);
        }
    }
}
