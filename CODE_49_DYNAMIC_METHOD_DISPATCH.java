class Phone{
    public void showTime(){
        System.out.println("Time is 8 am....");
    }

    public void on(){
        System.out.println("Turning on phone.....");
    }
    
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music.....");
    }
    @Override
    public void on(){
        System.out.println("Turning on SmartPhone.....");
    }
}


public class CODE_49_DYNAMIC_METHOD_DISPATCH {
    public static void main(String[] args) {

        //this method is use to achieve  run time polymorphisim 

        Phone obj=new SmartPhone(); //it is allowed
        //refrence of superclass and object of sub class;

        /*but
        SmartPhone obj =new Phone();

        is not allowed refernce of subclass and object of superclass
        */

        obj.showTime();
        obj.on();

        //obj.music(); is not allowed because this is not present in superclasss ;
    }
    
}
