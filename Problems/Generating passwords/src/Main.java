import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        StringBuilder builder = new StringBuilder();

        IntStream.range(0, a)
                .mapToObj(i -> i % 2 == 0 ? "A" : "B")
                .forEach(builder::append);

        IntStream.range(0, b)
                .mapToObj(i -> i % 2 == 0 ? "a" : "b")
                .forEach(builder::append);

        IntStream.range(0, c)
                .mapToObj(i -> i % 2 == 0 ? "1" : "2")
                .forEach(builder::append);

        int i = 0;
        while (builder.length() < n) {
            builder.append(i % 2 == 0 ? "c" : "d");
            i++;
        }

        System.out.println(builder.toString());
    }
}
