// package CWH_HAARY;

public class CODE_09_OPERATOR_PRECEDENCE {
    public static void main(String[] args) {
        int a=6*5-34/2;
        /*
        =30-34/2
        =30-17
        =13
        */
        int b=60/5-34*2;
        /*
        highest perecedence goes to * and / 
        they are evaluted on the basis of associativity
        =12-34*2
        =12-68
        =-56
        when there is a tie precedence  in  operators 
        check associativity goes left to----->right;
        */
        System.out.println(a);
        System.out.println(b);
        //precedence & Associativity
    }
}
