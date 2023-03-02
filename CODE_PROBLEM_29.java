public class CODE_PROBLEM_29 {

    public static void main(String[] args) {
        /*//PROBLEM 01;
        float []marks={45.5f,67.8f,99.8f,100.2f,80.3f};
        float sum=0;
        //method 01;
        for (float f : marks) {
            sum+=f;
        }
        System.out.println("TOTAL: "+sum);
        //method 02;
        for (int i = 0; i < marks.length; i++) {
            sum+=marks[i];
        }
        System.out.println("SUM T: "+sum);
        */

        //PROBLEM 02 WHETER GIVEN NUMBER IS PRESENT IN AARAY ;

        /*float []marks={45.5f,67.8f,99.8f,100.2f,80.3f};
        float num=100.2f;
        boolean isInArray=false;
        for (float f : marks) {
            if (num==f) {
                isInArray=true;
                break;   
            }
        }
        if(isInArray){
            System.out.println("THE VALUE PRESENT IN THE ARRAY!");
        }
        else{
            System.out.println("THE VALUE NOT PRESENT IN ARRAY!");
        }*/

        //PROBLEM 03;
        /*float []marks={45.5f,67.8f,99.8f,100.2f,80.3f};
        float sum=0;
        for (float f : marks) {
            sum+=f;
        }
        float avg;
        avg=sum/marks.length;
        System.out.println("TOTAL MARKS: "+sum);
        System.out.println("AVERAGE OF MARKS : "+avg);
        */

       /* //PROBLEM 04; 
        //ADDING TWO MATRIX;
        int [][] mat1={{1,2,3},
                       {4,5,6}};
        int [][] mat2={{7,8,9},
                       {10,11,12}};

        // int [][] mat3;

        for (int i = 0; i <2; i++) {
            for (int j = 0; j <3; j++) {
                mat1[i][j]+=mat2[i][j];
                
            }
            
        }
        for (int i = 0; i<2; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(mat1[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }*/


        /*//PROBLEM 05;
        //REVERSE ARRAY;
        int []AR={0,1,2,3,4,5,6,7,8,9};
        // int []temp={0,0,0,0,0};
        for (int i = 0; i < AR.length/2; i++) {
            int temp=AR[i];
            AR[i]=AR[AR.length-i-1];
            AR[AR.length-1-i]=temp;

            
        }
        for (int i = 0; i < AR.length; i++) {
            System.out.print(AR[i]+" ");
        }*/

        /*//PROBLEM 06;
        //MAXIMUM ELEMENT IN ARRAY;
        int []NUM={2,43,5,4,5,778,888,6544,6,7,8,9,5};
        int  max=0;
        for (int i = 0; i < NUM.length; i++) {
            if (NUM[i]>max) {
                
                max=NUM[i];
            }
        }
        System.out.println("THE MAX ELEMENT IN THE ARRAY: "+max);
        */
        //PROBLEM 7;
        //SORTED ARRAY;

        // int []NUM={2,43,5,4,5,778,888,6544,6,7,8,9,5};
        int []NUM={0,1,2,3,4,5,6,7};
        boolean isSorted=true;
        for (int i = 0; i < NUM.length-1; i++) {
            if(NUM[i]>NUM[i+1]){
                isSorted=false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("THE ARRAY IS SORTED");
        }
        else{
            System.out.println("ARRAY IS NOT SORTED");
        }



 

    }
    
}
