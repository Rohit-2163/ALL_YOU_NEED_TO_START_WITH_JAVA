public class CODE_34_RECURSION {
    static int Factorial(int n){
        //factorial (n)= n*n-1*.....1;
        //factorial (5)=5*4*3*2*1 =120;
        //factorial (n)=n*factorial(n-1);
        //factorial (0=1;
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*Factorial(n-1);
        }

    }
      public static void main(String[] args) {
        System.out.println(Factorial(5)); 
         
        
    }
}  