public class CODE_24_BREAK_CONTINUE {
    public static void main(String[] args) {
        // break and continue using loops;
        // for(int i=0; i<5; i++){
        // System.out.println(i);
        // System.out.println("Java is great");
        // if(i==2){
        // System.out.println("Ending the loops");
        // break;
        // }
        // }

        // int i=0;
        // while(i<5){
        // System.out.println(i);
        // System.out.println("java is great");
        // if(i==2){
        // System.out.println("break encountered breaking the loop");
        // break;
        // }
        // i++;
        // }

        // int i=0;
        // do{
        // System.out.println(i);
        // System.out.println("java is great");
        // if(i==2){
        // System.out.println("break encountered breaking the loop");
        // break;
        // }
        // i++;
        // }while(i<5);

        // continue Statement;
        // int i = 0;
        // do {
        // i++;
        // if (i == 2) {
        // System.out.println("continue encountered skipping the current iteration on
        // the loop");
        // continue;
        // }
        // System.out.println(i);
        // System.out.println("java is great");
        // } while (i < 5);

        int i = 0;
        while (i < 5) {
            i++;
            if (i == 2) {
                System.out.println("continue encountered skipping the current iteration of the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }
    }

}
