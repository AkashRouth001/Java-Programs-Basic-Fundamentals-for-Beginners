import java.util.*;
public class ArraylistP {
    public static void main(String[]  args){
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(90);
        l1.add(10);
        l1.add(12);
        l1.add(16);
        l1.add(0,19);
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
    }
}
