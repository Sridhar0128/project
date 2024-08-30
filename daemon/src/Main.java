class ThreadExample {

    public static void main(String[] args) {
        Thread userThread = new Thread(() -> {
            System.out.println("User Thread is running...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("User Thread finished execution.");
        });

        Thread daemonThread = new Thread(() -> {
            System.out.println("Daemon Thread is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Daemon Thread finished execution.");
        });

        daemonThread.setDaemon(true);

        userThread.start();
        daemonThread.start();

        System.out.println("Is userThread a daemon thread? " + userThread.isDaemon());
        System.out.println("Is daemonThread a daemon thread? " + daemonThread.isDaemon());

        System.out.println("Active thread count: " + Thread.activeCount());
    }
}
