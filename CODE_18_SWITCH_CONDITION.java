import java.util.Scanner;
public class CODE_18_SWITCH_CONDITION {
    public static void main(String[] args) {
        int age;
        System.out.print("ENETR YOUR AGE: ");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        sc.close();
        /*if (age>56) {
            System.out.println("YOU ARE EXPERIENCED");
        }
        else if(age>46){
            System.out.println("YOU ARE SEMI-EXPERIENCED");

        }
        else if(age>36){
            System.out.println("YOU ARE ON THE WAY");

        }
        else if(age>28){
            System.out.println("ROOKIE!!!");

        }
        else{
            System.out.println("NOT EXPERIENCED !!");
        }*/

        //USING SWITCH CASE;

        switch (age) {
            case 18:
            System.out.println("GOING TO ADULT!!");
                break;
            case 23:
            System.out.println("GET JOB!!");
                break;
            case 60:
            System.out.println("GET RETIERED!!!");
                break;
            default:
            System.out.println("ENJOY!!! LIFE!!");
                break;
        }
    }
    
}
