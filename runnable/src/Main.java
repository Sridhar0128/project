
class MyRunnable implements Runnable {
    private String threadName;

    MyRunnable(String name) {
        threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " finished.");
    }
}

public class Main{
    public static void main(String[] args) {

        MyRunnable runnable1 = new MyRunnable("Runnable 1");
        MyRunnable runnable2 = new MyRunnable("Runnable 2");


        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.run();
        thread2.start();
    }
}
