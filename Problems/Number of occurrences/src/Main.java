import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String source = scanner.nextLine();
        String toFind = scanner.nextLine();
        int i = 0;

        String output = source.replaceAll(toFind, "`");
        for (char c : output.toCharArray()) {
            if (c == '`') {
                i++;
            }
        }

        System.out.println(i);

        //v2:
//        System.out.println((" " + scanner.nextLine() + " ").split(scanner.nextLine()).length - 1);
    }
}
