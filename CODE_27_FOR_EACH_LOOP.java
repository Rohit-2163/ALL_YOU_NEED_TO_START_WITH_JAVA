public class CODE_27_FOR_EACH_LOOP {
    public static void main(String[] args) {

        int [] marks={98,45,79,99,80};
        // float [] marks={98.5f,45.5f,79.5f,99.5f,80.5f};
        // System.out.println(marks.length); 
        // System.out.println(marks[0]); 
        // String [] students={"rohit","vijay","dj","lovish","mishra"};
        // System.out.println(students.length); //Gives the size of array;
        // System.out.println(students[1]);

        //Dispalying the Array(Naive way)
        /*System.out.println(marks[0]); 
        System.out.println(marks[1]); 
        System.out.println(marks[2]); 
        System.out.println(marks[3]); 
        System.out.println(marks[4]);
        */
        //Displaying array through loop
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        //Displaying in reverse order
        System.out.println("REVERSE ORDER:  ");
        for (int i = marks.length-1; i >=0; i--) {
            System.out.println(marks[i]);
        }
        

        //for each loop
        //Displaying the array using for each loop
        System.out.println("printing using for each loop:");
        for (int element : marks) {

            System.out.println(element);
            
        }

        
    }
    
}
