//CONSTRUCTORS IN JAVA
class testEmployee{
    private int id;
    private String name;

    //default constructor 
    public testEmployee(){
        System.out.println("CONSTRUCTOR WITH NO PARAMETER INVOKED 01");
        this.id=0;
        this.name="your-name-here";
    }
    //OVERLOADING CONSTRUCTIORS;
    //parameterized constructor 
    public testEmployee(String myName, int myId ){
        System.out.println("CONSTRUCTOR WITH BOTH  PARAMETER INVOKED 02");
        this.id=myId;
        this.name=myName;
    }
    //OVERLOADING CONSTRUCTORS
    //passing customized parameter in cosnstructor
    public testEmployee(String myName){
        System.out.println("CONSTRUCTOR WITH SINGLE PARAMETER INVOKED 03");
        this.id=1;
        this.name=myName;
    } 
    int Myid(){
        return id;
    }
    String myName(){
        return name;
    }
}
public class CODE_41_CONSTRUCTORS {
    public static void main(String[] args) {
        testEmployee E1=new testEmployee("TEST_CASE03",101);
        // testEmployee E1=new testEmployee();
        // testEmployee E1=new testEmployee("TEST_CASE03");

        System.out.println(E1.Myid());
        System.out.println(E1.myName());
        
    }
    
}
 