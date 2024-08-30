import java.lang.Thread;
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            Thread.yield();
        }
    }
}
 class YieldExample {
     public static void main(String[] args) {
         Thread thread1 = new MyThread();
         Thread thread2 = new MyThread();

         thread1.start();
         thread2.start();

         try {
             thread1.join();
             thread2.join();
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }

