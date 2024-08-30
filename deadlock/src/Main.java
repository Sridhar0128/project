
public class Main {
    private static final Object s1=new Object();
    private static final Object s2=new Object();

    public static void main(String[] args) {

        Thread t1=new Thread(() ->{
            synchronized (s1){
                try{
                    Thread.sleep(100);
                }catch(Exception e){
                    System.out.println("Thread 1 locked");
                }
                synchronized (s2){
                    System.out.println("Thread 2 ready for lock");
                }
            }
        });


        Thread t2=new Thread(() ->{
            synchronized (s2){
                try{
                    Thread.sleep(100);
                }catch(Exception e){
                    System.out.println("Thread 1 locked");
                }
                /*synchronized (s1){
                    System.out.println("Thread 1 ready for lock");
                }*/
            }
        });
        t1.start();
        t2.start();
        System.out.println("Active thread count: " + Thread.activeCount());


    }
}