class Student{
    int roll;
    String name;
    public void printThis(){
        System.out.println("name is "+name+" and roll "+roll);
    }
}
public class coustomClass_java {
    public static void main(String[] args){
        Student akash = new Student();
        Student sam = new Student();

        akash.name="Akash";
        akash.roll=1;

        sam.name="samridhha";
        sam.roll=2;

        akash.printThis();
        sam.printThis();
    }
}
