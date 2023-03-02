//custom class code in java ;
class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("my id is "+id);
        System.out.println("my name  is "+name);
    }
    public int getSalary(){
        return salary;
    }

}
public class CODE_38_CLASS {
    public static void main(String[] args) {
        System.out.println("THIS IS OUR CUSTOM CLASS: ");
        //creating objects ;
        Employee E1=new Employee();
        Employee E2=new Employee();
        //instansiating objects setting attributes for our parameters;
        //object 1;
        E1.id=201;
        E1.name="TEST_CASE";
        E1.salary=70000;

        //object 2;
        E2.id=202;
        E2.name="JOHN KHANDELWAAL";
        E2.salary=40000;
        /*System.out.println(E1.id);
        System.out.println(E1.name);
        */
        E1.printDetails();
        // E1.getSalary();
        System.out.println(E1.getSalary());
        E2.printDetails();
        // E2.getSalary();
        System.out.println(E2.getSalary());
    }
    
}
 
