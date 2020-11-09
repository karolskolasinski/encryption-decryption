import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toLowerCase().toCharArray();
        double sum = 0;

        for (char aChar : chars) {
            if (aChar == 'c' || aChar == 'g') {
                sum++;
            }
        }

        System.out.println(sum / chars.length * 100);
    }
}
