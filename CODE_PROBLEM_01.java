// package CWH_HAARY;
import java.util.Scanner;
public class CODE_PROBLEM_01 {
    public static void main(String[] args){
        Scanner U_In=new Scanner(System.in);
        System.out.println("ENTER YOUR SUBJECT MARKS: ");
        System.out.print("ENGLISH: ");
        Float E=U_In.nextFloat();
        System.out.print("HINDI: ");
        Float H=U_In.nextFloat();
        System.out.print("SOCIAL SCIENCE: ");
        Float SC=U_In.nextFloat();
        System.out.print("MATHS: ");
        Float M=U_In.nextFloat();
        System.out.print("SCIENCE: ");
        Float S=U_In.nextFloat();
        U_In.close();
        Float Percentage=((E+H+SC+M+S)/500)*100;
        System.out.println("CONGRATULATIONS !!! ");
        System.out.print("YOUR PERCENTAGE IS :  ");
        System.out.println(Percentage+"%");

    }
    
}
