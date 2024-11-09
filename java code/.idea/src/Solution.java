import java.util.*;
public class Solution {
    public static int dataTypes(String type) {
        // Write your code here
        switch (type){
            case "integer":
                return 4;
            case "lang":
                return 8;
            case "float":
                return 4;
            case "double":
                return 8;
            case "character":
                return 1;
            default:
                return -1;
        }
    }
    public static void main(String[] args ){

        System.out.println("enter the data type\n Integer\nLong\nFloat\nDouble\nCharacter:");
        Scanner sc = new Scanner(System.in);
        String inputype = sc.nextLine();
        int size = dataTypes(inputype);
        if(size!=-1){
            System.out.println("the size of "+inputype+" is "+size);
        }
        else{
            System.out.println("take thewright inputt ");
        }
    }

}
