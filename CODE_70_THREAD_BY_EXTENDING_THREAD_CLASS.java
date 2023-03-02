
class MyThread extends Thread{

    @Override
    public void run(){
        while(true){

            System.out.println("first... ");
        }
    }
}
class MyThread2 extends Thread{ //Thread is in built class in java we are just extending that to use..


    @Override
    public void run(){
        while(true){

            System.out.println("second... ");
        }
    }
}




public class CODE_70_THREAD_BY_EXTENDING_THREAD_CLASS {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread2 t2=new MyThread2();
        
        t1.start();

        t2.start();
        
    }
    
}
