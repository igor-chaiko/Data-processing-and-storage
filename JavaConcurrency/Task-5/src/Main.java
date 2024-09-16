public class Main {
    public static void main(String[] args) throws InterruptedException {
        var thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("a");
            }

            System.out.println("I'm done");
        });

        thread.start();

        Thread.sleep(2000);

        thread.interrupt();
    }
}
