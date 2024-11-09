/*Create a class Employee with the following properties and methods:
Salary (property) (int)
getSalary (method returning int)
name (property) (String)
getName (method returning String)
setName (method changing name)*/
class Employee{
   int salary;
   String name;

    public int getSalary() {
        return salary;
    }
    public String getName(){
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }
}
public class oopsQ1 {
    public static void main(String[] args){
        Employee emp = new Employee();
        emp.setName("akash");
        emp.salary=10000000;
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
    }
}
