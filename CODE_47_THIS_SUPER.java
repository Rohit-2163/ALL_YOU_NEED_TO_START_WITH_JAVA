class Ekclass{
    int a;
    public int getA(){
        return a;
    }
    Ekclass(int a){
        this.a=a;
    }
    public int returnone(){
        return 1;
    }
}

class DoClass extends Ekclass{
    DoClass(int c){
        super(c);
        System.out.println("i am a constructor");
    }
}


public class CODE_47_THIS_SUPER {
    public static void main(String[] args) {
        Ekclass e=new  Ekclass(45);
        DoClass d=new DoClass(8);
        System.out.println(e.getA());


        
    }
    
}
 