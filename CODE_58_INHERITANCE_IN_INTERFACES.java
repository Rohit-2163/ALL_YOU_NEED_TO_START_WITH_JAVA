/**
 * Interfaces can extend  other interfaces 
 */
//EXAMPLE:--
/*
public interface Interface 1 {
    void meth1 (); 
  }


public interface Interface 2 extends Interface 1 { 
     void meth 2( );
    }
*/

interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class CODE_58_INHERITANCE_IN_INTERFACES {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        
    }
    
}