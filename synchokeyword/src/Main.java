
class VolatileExample {
    private static volatile boolean isRunning = true;

    public static void main(String[] args) {
        Thread workerThread = new Thread(() -> {
            while (isRunning) {
                for (int i = 1; i < 100; i++) {
                    System.out.println(i);
                }
            }
        });

        workerThread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        isRunning = false;
    }
}
