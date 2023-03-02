/**
 * An abstract class annot be instantiated.
 * java requires us to extend it if we want to acess it.
 * it can includ eabstarct and non-abstract methods.
 * if a class includes abstract methods, then the class itself must be declared abstract.
 *  
 * syntax
 * public abstract class phine Model{
 *       abstract void switch off();
 *               //more code  
 *                    }
 * 
 *  important:-
 * abstract class are used when we want to achieve security & abstrsction 
 * (hide certain details & show only necessary details to the user)
 * 
 * example
 * abstract class Phone{  
        abstract void on();  
            }  
    class SmartPhone extends Phone{  
    void run(){
    System.out.println("Turning on...");
    }  
    public static void main(String args[]){  
     Phone obj = new SmartPhone();  
    obj.on();  
    }  
    }  
 */

 /**
  * A method that is declared without implementation is known as the abstract method.
  * An abstract method  can only be used inside  an abstract class.
  *The body of the abstract method is provided by the class that inherits the abstract class in 
   which the abstrcat method is present
*/
abstract class Parent2{
    public Parent2(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
  
public class CODE_53_ABSTRACT_CLASS_METHOD {
    public static void main(String[] args) {
        //Parent2 p=new Parent2(); --error cannot instantiate abstract class
        Child2 c=new Child2();
        c.greet();
        c.greet2();
        //Child3 c3 =new child3(); --error cannot instantiate abstract class
        
    }
}
