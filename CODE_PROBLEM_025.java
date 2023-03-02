
public class CODE_PROBLEM_025 {
    public static void main(String[] args) {
        // program to print a pattren;
        // int n;
        // n=4;
        // for(int i=n; i>0; i--){
        // for(int j=0; j<i;j++){
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        // to sum of even numbers lies between n;
        // int sum=0;
        // int n;
        // n=10;
        // for(int i=0;i<=n; i++){
        // if(i%2==0){
        // sum+=i;
        // }
        // }
        // System.out.println("THE SUM IS: "+ sum);
        // while(n!=0){
        // if(n%2==0){
        // sum+=n;
        // }

        // n--;
        // }
        // System.out.println("THE SUM BY WHILE LOOP IS: "+sum);

        // Table of a given number;
        // int n;
        // n = 10;
        // for (int i = 1; i <= n; i++) {

        //     System.out.print(n + "x" + i + "= ");
        //     System.out.println(n * i);

        // }

        //Table in reverse order;
        // int n;
        // n = 10;
        // for (int i = n; i >= 1; i--) {

        //     System.out.print(n + "x" + i + "= ");
        //     System.out.println(n * i);

        // }

        //factorial of a number usnig for loop
        // int n;
        // n=5;
        // int fact=1;
        // for(int i=1; i<=n; i++){
        // if(i>0){
        // fact*=i;
        // }
        // else{
        // System.out.println("Factorial : 1");
        // }
        // }
        // System.out.println("Factorial: "+fact);

        //factorial by while loop;
    //     int n;
    //     n=5;
    //     int fact=1;
    //     while(n!=0){
    //         fact*=n;
    //         n--;
    //     }
    //     System.out.println("Factorial by While loop is: "+fact);

        // sum of a table;
        int n=8;
        int sum=0;
        for(int i=0;i<=10; i++){
            sum+=(n*i);

        }
        System.out.println("sum of table of 8: "+sum);
    }

}
  