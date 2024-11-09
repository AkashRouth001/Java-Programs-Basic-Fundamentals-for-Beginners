class MyStudent {
     private String name ;
     private int roll;
     public String getName(){
         return name;
     }
     public int getRoll(){
         return roll;
     }
     public void setName(String n){
         this.name = n;
     }
     public void setRoll(int r){
         this.roll=r;
     }

}
public class Getter_setter1_java {
    public static void main(String[] args){
        MyStudent s1 = new MyStudent();
        //s1.name="Akash";
        //s1.roll=1;
        s1.setName("akash");
        s1.setRoll(001);
        System.out.println(s1.getName());
        System.out.println(s1.getRoll());
    }
}
