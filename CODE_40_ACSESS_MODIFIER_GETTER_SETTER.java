//ACESS MODIFIER PUBLIC PRIVATE PROTECTED;
class Myemployee{
    private int id;
    private String name;

    //WHEN OUR ATTRIBUTES ARE PRIVATE WE NEED A MEMBER FUNCTION 
    //TO ACESS THAT ATTRIBUTE
    //OR TO SET THAT ATTRIBUTE
    void get_id(int x){
        this.id=x;

    }
    void get_name(String y){
        this.name=y;
    }
    int id(){
        return id;
    }
    String name(){
        return name;
    }
}


public class CODE_40_ACSESS_MODIFIER_GETTER_SETTER {
    public static void main(String[] args) {
        Myemployee E1=new Myemployee();
        E1.get_id(301);
        E1.get_name("TEST-CASE-02");
        System.out.println(E1.id());
        System.out.println(E1.name());
        
    }
    
}
