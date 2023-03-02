public class CODE_33_VARARGS {

    //simple methods...

    // static int sum(int a, int b){
    //     return a+b;
    // }
    // static int sum(int a, int b,int c){

    //     return a+b+c;
    // }
    // static int sum(int a, int b,int c,int d){


    //     return a+b+c+d;
    // }

    //varargs.....
    static int sum(int ...arr){
        //available as int [] arr;
        int result=0;
        for (int i : arr) {
            result+=i;
        }
        return result;
    }
    //making one arguments compulsory.....
   /* static int sum( int x,int ...arr){
       //AT ONE ARGUMENT IS COMPULSORY TO USE THIS METHOD MINIUM ONE ARGUMENT MUST BE PASSED;
        //available as int [] arr;
        int result=x;
        for (int i : arr) {
            result+=i;
        }
        return result;
    }*/
    public static void main(String[] args) {
        System.out.println("Welcome To Varargs Voturial");
        System.out.println("The sum of nothing "+sum());
        System.out.println("The sum of 4 and 5 is "+sum(4,5));
        System.out.println("The sum of 4 ,3 and 5 is "+sum(4,3,5));
        System.out.println("The sum of 2, 4 ,3 and 5 is "+sum(2,4,3,5));
    }
    
}
