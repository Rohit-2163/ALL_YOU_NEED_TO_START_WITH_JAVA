public class CODE_31_METHODS {

    //THIS IS METHOD IN JAVA SAME AS FUNCTIONS ;
    //WHEN YOUR METHOD IS STATIC;
    static int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;

    }   
        public static void main(String[] args) {
            
            int a=5;
            int b=7;
            int c;
            //invoking static method;
            c=logic(a,b);
            
            int a1 =2;
            int b1=1;
            int c1;
            //invoking static method;
            c1=logic(a1,  b1);
            System.out.println(c);
            System.out.println(c1);    
    }
    
}
