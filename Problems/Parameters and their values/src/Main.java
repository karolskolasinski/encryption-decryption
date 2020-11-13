import java.util.stream.IntStream;

class Problem {

    public static void main(String[] args) {
        // Write your code here
        IntStream.iterate(0, i -> i < args.length, i -> i + 2)
                .forEach(i -> System.out.printf("%s=%s\n", args[i], args[i + 1]));
    }
}
