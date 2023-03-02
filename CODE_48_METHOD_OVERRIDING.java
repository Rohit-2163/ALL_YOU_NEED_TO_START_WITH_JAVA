
class A{
    public int a;
    public int number(){
        return 5;
    }
    public void meth1(){
        System.out.println("METHOD 1 OF THE CLASS A");
    }

    public void meth2(){
        System.out.println("i am method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I AM METHOD 2 OF CLASS B");
    }
    public void meth3(){
        System.out.println("I AM METHOD 3 OF CLASS B");
    }
}
public class CODE_48_METHOD_OVERRIDING {
    public static void main(String[] args) {
        A a=new A();
        a.meth1();
        a.meth2();
        
        B b=new B();
        b.meth1();
        b.meth2();
        
    }
    
}
/*
 *If the child class implements the same method present in the parent 
 * class again, it is know as method overriding.
 * Method overriding helps us to classify a behavior that is specific to the child class.
 * The subclass can override the method of the parent class only when the method is not declared as final. 
  
 
 * Example :
 * In the below code, we've created two classes: class A & class B.
 * Class B is inheriting class A.
 * In the main() method, we've created one object for both classes. 
 * We're running the meth1() method on class A and B objects separately, 
 * but the output is the same because the meth1() is defined in the parent class, i.e., class A.
 
 
 * but in meth2() both running differently because we overrided the meth()2  
 * in class B for running it separetly from class A meth2().
 * */
