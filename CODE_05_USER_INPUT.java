//TAKING USER INPUT METHOD
// package CWH_HAARY;

import java.util.Scanner;
public class CODE_05_USER_INPUT {
    public static void main(String[] args){
        System.out.println("Taking Input From User: ");
        Scanner User_Input=new Scanner(System.in);
        System.out.print("ENTER NUMBER 1: ");
        int a=User_Input.nextInt();
        System.out.print("ENTER NUMBER 2: ");
        int b=User_Input.nextInt();
        //STRING INPUT FROM USER STRING METHODS;
        System.out.print("Enter your string: ");
        String str=User_Input.next(); //--->this will read only a single word ;
        System.out.print("Enter your sentence: ");
        String dr=User_Input.nextLine(); //--->this will read entire sentence nextline() method;
        //--------------------------------//
        User_Input.close();
        System.out.print("The Sum Of These Number is: ");
        int sum=a+b;
        System.out.println(sum);
        System.out.println(str);
        System.out.println(dr);
    }
    
}
