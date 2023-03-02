//this is also a superclass for derived classs
class Base{
    int x;

    public void printMe(){
        System.out.println("I AM A print function");
    }

    public int getX(){
        System.out.println("i am in base class");
        return x;
    }

    public void setX(int x){
        this.x=x;
    }
}
//using extends keyword we inherit the Base class
//this is subclass for Base class or for superclass 
class Derived extends Base{
    int y;
    public int getY(){
        System.out.println("i am in derived class");
        return y;

    }
    public void setY(int y){
        this.y=y;
    }
}


public class CODE_45_INHERITANCE {
    public static void main(String[] args) {

        //creating an object of base class
        Base B1=new Base();
        B1.setX(4);
        System.out.println(B1.getX());

        //creating an object of derived class 
        Derived D1=new Derived();
        D1.setX(6);
        System.out.println(D1.getX());
        D1.setY(88);
        System.out.println(D1.getY());
        
        
    }
    
}
