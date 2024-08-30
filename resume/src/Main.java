import java.lang.Thread;
 class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread is running... " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

 class ThreadControlExample {
     public static void main(String[] args) {
         MyThread thread = new MyThread();
         thread.start();
         try {
             Thread.sleep(1000);
             thread.suspend();
             System.out.println("Thread suspended.");

             Thread.sleep(1000);
             thread.resume();
             System.out.println("Thread resumed.");

             Thread.sleep(1000);
             thread.stop();
             System.out.println("Thread stopped.");
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
