//comstructor calling sequence and use of super keyword for passing parameter to the base class cponstructors
class Base{
    int x;

    public Base(){
        System.out.println("I AM A CONSTRUCTOR:");
    }
    Base(int x){
        System.out.println("i am an overload constructor with the value of x as: "+ x);
    }

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
}
class Derived extends Base{
    int y;

    Derived(){
        System.out.println("i am a drived class constructor");
    }
    Derived(int x  , int y){

        //suoer keyword forward the parameter to the base class constructor 
        super(x);
        System.out.println("i am an overload constructor of derived class with value of y as : "+y);
    }

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
}
class ChildOfDerived extends Derived{
    ChildOfDerived(){
        System.out.println("i am, a child of derived construtors ");

    }
    ChildOfDerived(int x , int y, int z){

        //super keyword forward the passed parameters to the base class parameterized constructor
        super(x, y);


        System.out.println("i am overload constructors of derived with valur of z as: "+z);
    }
}


public class CODE_46_CONSTRUCTOR_INHERITENCE {
    public static void main(String[] args) {
        // Base B1=new Base();
        // Derived D1=new Derived();
        // Derived D1=new Derived(14,56);
        // ChildOfDerived C1=new ChildOfDerived();
        ChildOfDerived C1=new  ChildOfDerived(12,45,778);

        
    }
}
/**
  When a drived class is extended from the base class,
  the constructor of the base class is executed first 
  followed by the constructor of the derived class. 
  For the following Inheritance hierarchy , 
  the constructors are executed in the order:

  C1- Parent 
  C2 - Child 
  C3 - Grandchild 



 * When there are multiple constructors in the parent class, 
   the constructor without any parameters is called from the child class.


 * If we want to call the constructor with parameters from the parent class,
   we can use the super keyword.

 * super(a, b) calls the constructor from the parent class  
   which takes 2 variables
  

 */
