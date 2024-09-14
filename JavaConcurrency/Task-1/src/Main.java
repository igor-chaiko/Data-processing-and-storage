public class Main {
    public static void main(String[] args) {
        var thread = new Thread(() -> {
           for (int i = 0; i < 5; i++ ) {
               System.out.println("Hello from child thread");
           }
        });

        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from parent thread");
        }
    }
}