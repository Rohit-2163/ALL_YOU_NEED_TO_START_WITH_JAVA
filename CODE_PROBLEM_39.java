class Employee{
    int salary;
    String name;
    
    public int salary(){
        return salary;
    }

    public String getName(){
        return name;

    }
    public void setName(String x){
        name=x;

    }
}
class cellPhone{
    public void ring(){
        System.out.println("Ringing.....");
    }
    public void vibrate(){
        System.out.println("vibrating......");

    }
    public void callFriend(){
        System.out.println("calling .... friend");
    }
}
class Square{
    int side;
    public int area(int x){
        return x*x;
    }
    public int perimeter(int x){
        return 4*x;
    }
}

public class CODE_PROBLEM_39 {
    public static void main(String[] args) {
        /*Employee E1=new Employee();
        E1.setName("TEST_CSAE_01");
        E1.salary=2000;
        System.out.println(E1.getName());
        System.out.println(E1.salary());


        //"***************************************"
        cellPhone c1 = new cellPhone();
        c1.callFriend();
        c1.vibrate();
        c1.ring();
        */

        Square s1= new Square();
        int y,z;
        y=s1.area(3);
        z=s1.perimeter(3);
        System.out.println(y);
        System.out.println(z);    }
}
