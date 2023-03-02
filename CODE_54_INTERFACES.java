/**
 * just like a class in the java is a collection of the related methods,
   an interface in java is a collection of abstract methods.
 * The interface is   one more way to achieve abstraction in java.
 * An interface may also contain constants, default methods,  and static methods.
 * All the methods inside an interface must have empty bodies except default methods and  static method.
 * We use the interface keyword to declare an interface.
 * there is no need to write  abstract keyword before declaring methods in an interface 
   because an interface is implicitly abstract.
 * An interface cannot contain a constructor (as it cannot be used to create objects)
 * IN order to implement an interface java requires a class to use  the "implement" keyword.
 */
//example:-
/*interface Bicycle { 
    void apply brake ( int decrement ); 
    void  speed up ( int increment );
    }

class Avon cycle implements Bicycle {
    int speed = 7 ; 
     void apply brake ( int decrement ) {
             speed = speed - decrement ;
                 }
void speedup ( int increment ){ 
         speed = speed + increment ; 
            }
*/
interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int x = 45;
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    //public int x = 5;
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUP");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa po po po po");
    }
}
public class CODE_54_INTERFACES {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(cycleHarry.a);
        System.out.println(cycleHarry.x);

        // You cannot modify the properties in Interfaces as they are final
        // cycleHarry.a = 454;
        //System.out.println(cycleHarry.a);

        cycleHarry.blowHornK3g();
        cycleHarry.blowHornmhn();
        
    }
}

/**
 * ABSTRACT CLASS  VS INTERFACE
  
 * ABSTRACT CLASS:-
 
 * It can contain abstract and non abstract method
 * abstrcat keyword is used to decalre an abstract class  by using  the "extends"  keyword.
 * A abstract class in java can have class members like private , protected ,etc.
 * A abstract class doen't support multiple inheritance.
  
 * INTERFACE:-
  
 * It can only abstarct methods. we do not need to use the "abstract" keyword in interface methods 
   because the interface is implicitly abstract.

 * Interface keyword is used to declare an interface.
 * The "implements" keyword isused to implement an interface.
 * Members of a java interface are public by default.
 * Multiple inheritance is achieved in java by using the interface.  

 */

 //Why multiple inheritance is not supported in java:--
 /**
  * Qes> Is multiple inheritance allowed in java
  * Multiple inheritance faces problems when thre exists a method with the same signature in both
    the superclasses.

  * Due to such  a problem , java doesn't support multiple inheritnace directly ,
    but the similar concept can be achieved using interface and extend a class at the same time.

  * A class can implement multiple interfaces and extends a class at the  same time.
  */

  //Points to remember.
  /**
   * Interfaces in java are a bit like the class but with a signifcantly different.
   * An interface can only have method signatures field and a default method().
   * You can create a reference of an interface but not the object.
   * Interface methods are public by default. 
   */