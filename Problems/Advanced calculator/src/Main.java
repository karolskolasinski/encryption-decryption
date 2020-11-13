import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        // write your code here
        List<Integer> list = IntStream.range(1, args.length)
                .mapToObj(i -> Integer.parseInt(args[i]))
                .collect(Collectors.toList());

        switch (operator) {
            case "MAX":
                list.stream().max(Integer::compareTo).ifPresent(System.out::println);
                break;
            case "MIN":
                list.stream().min(Integer::compareTo).ifPresent(System.out::println);
                break;
            case "SUM":
                System.out.println(list.stream().reduce(0, Integer::sum));
                break;
            default:
                break;
        }
    }
}
