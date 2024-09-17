public class Main {
    public static void main(String[] args) throws InterruptedException {
        var thread = new Thread(() -> {
           for (int i = 0; i < 5; i++) {
               System.out.println("hello from child thread");
           }
        });

        thread.start();
        thread.join();

        for (int i = 0; i < 5; i++) {
            System.out.println("hello from parent thread");
        }
    }
}