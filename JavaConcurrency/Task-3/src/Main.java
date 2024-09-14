import java.util.List;

public class Main {
    private static void printStrings(List<String> strings) {
        for (var string : strings) {
            System.out.println(string);
        }
    }

    private static void createAndStartThread(List<String> strings) {
        var thread = new Thread(() -> {
            printStrings(strings);
        });
        thread.start();
    }

    public static void main(String[] args) {
        createAndStartThread(List.of("a", "aa"));
        createAndStartThread(List.of("b", "bb"));
        createAndStartThread(List.of("c", "cc"));
        createAndStartThread(List.of("d", "dd"));
    }
}